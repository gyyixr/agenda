package client;

import generated.Meeting;
import generated.User;
import generated.UserService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.omg.CORBA.TIMEOUT;


import java.util.*;

public class ThriftClient {
    public static List<User> userList = new ArrayList<>();
    public static List<Meeting> meetingList = new ArrayList<>();
    public static List<Meeting> currentMeetingList = new ArrayList<>();
    public static Map<User, Meeting> userMeetingMap = new HashMap<User, Meeting>();

    public static String currentName;

    public static final String SERVER_IP = "localhost";
    public static final int SERVER_PORT = 8090;
    public static final int TIMEOUT = 30000;
    boolean isOut = false;
    TTransport tTransport = new TSocket(SERVER_IP, SERVER_PORT,TIMEOUT);
    TProtocol protocol = new TBinaryProtocol(tTransport);
    UserService.Client client = new UserService.Client(protocol);
    public  void  startClient() throws TException {

        tTransport.open();
        TTransport finalTTransport = tTransport;
//        boolean isOut = false;

        User admin = new User("asd", "111", "111", 111, true);
        admin.setUserName("admin");
        admin.setPassWord("admin");
        userList.add(admin);

        menu1();

        if (isOut == true){
            finalTTransport.close();
        }

        userMenu();

    }
    //登录前列表
    public void menu1() throws TException {
        a: while(true){
            System.out.println("注册请输入1，登录请输入2, 退出请输入0");
            Scanner scan1 = new Scanner(System.in);
            Integer ini = scan1.nextInt();

            //注册
            if (ini.equals(1)) {
//               client.registe();
                boolean Exist = false;

                while (!Exist){
                    System.out.println("请输入注册的用户名：");
                    User user = new User("asd", "111", "111", 111, true);
                    Scanner scan = new Scanner(System.in);
                    user.setUserName(scan.nextLine());
//                    System.out.println("*****");
//                    System.out.println(user.getUserName());
                    for (int i=0; i<userList.size(); i++){
//                        System.out.println("-----");
                        if(user.userName.equals(userList.get(i).getUserName())){
                            System.out.println("该用户名已被注册，请重新注册");
                            break;
                        }else {
                            System.out.println("请输入密码：");
                            user.setPassWord(scan.nextLine()) ;
                            System.out.println("请输入邮箱：");
                            user.setMail(scan.nextLine()) ;
                            System.out.println("请输入手机号码：");
                            user.setPhone(scan.nextLong()) ;
                            userList.add(user);
                            System.out.println("注册成功");
                            client.registe();
                            System.out.println();
                            Exist = true;
                            break;
                        }
                    }
//                    System.out.println("++++");
                    if (Exist == true) { break;}
                }
                continue;



            }

            //登录
            else if (ini.equals(2)) {
                String userName = "";
                String passWord = "";
                System.out.println("请输入用户名：");
                Scanner scan = new Scanner(System.in);
                userName = scan.nextLine();
                for(int i=0;i<userList.size();i++){
//                    System.out.println("+++++");
                    if(userName.equals(userList.get(i).getUserName())){

                        System.out.println("请输入密码：");
                        passWord = scan.nextLine();
                        User user = userList.get(i);
                        if(user.getPassWord().equals(passWord)){
                            userList.get(i).setIsLogin(true);
                            System.out.println("登录成功");
                            currentName = userList.get(i).getUserName();
                            break a;
                        }
                        else{
                            System.out.println("密码错误，登录失败");
                            continue a;
                        }
                    }
                }
                System.out.println( "该用户名暂未注册");
                continue a;

//                for(int i=0;i<userList.size();i++){
//                    if(userName.equals(userList.get(i).getUserName())){
//                        User user = userList.get(i);
//                        if(user.getPassWord().equals(passWord)){
//                            userList.get(i).setIsLogin(true);
//                            System.out.println("登录成功");
//                        }
//                        else{
//                            System.out.println("密码错误，登录失败");
//                        }
//                    }
//                    break;
//                }
//                client.login();
            }

            //登出
            else if (ini.equals(0)){
                System.out.println("再见！");
                isOut = true;
                break;
            }
//            else if (!ini.equals(1) && !ini.equals(2) && !ini.equals(0))
            else {
                System.out.println("输入无效，请重新输入");
                continue a;
            }
        }
    }

    //登录后列表
    public void  userMenu() throws TException {

        System.out.println("查询用户信息请输入1，删除用户信息请输入2，管理会议请输入3，登出请输出0");
        Scanner scan1 = new Scanner(System.in);
        Integer ini = scan1.nextInt();
        if (ini.equals(1)){
            userQuery();
            userMenu();
        }
        else if (ini.equals(2)){
            userDelete();
            menu1();
        }
        else if (ini.equals(0)){
            userLogout();
            menu1();
        }
        else if (ini.equals(3)){
            meetingMenu();
        }
    }

    //提示信息
    public void information(){
        System.out.println("欢迎来到会议管理系统！");
        System.out.println("创建会议请按输入1，增删会议参与者请按2，查询会议请按3，取消会议请按4，退出会议请按5，清空会议请按6，退出会议管理请按0");
    }

    //管理会议菜单
    public void meetingMenu() throws TException {
        while (true){
            System.out.println("******************");
            information();
            Scanner scan1 = new Scanner(System.in);
            Integer ini = scan1.nextInt();
            if (ini.equals(1)){
                meetingCreate();
//                System.out.println("******************");
            }
            else if (ini.equals(2)){
                participatorEdit();
            }
            else if (ini.equals(0)){
                userMenu();
            }
            else if (ini.equals(3)){
                meetingQuery();
            }
        }

    }

    //创建会议
    public void meetingCreate(){
        Meeting meeting = new Meeting("ads","asd","das","das");
        String name = currentName;
        System.out.println("请输入会议名");
        Scanner scan1 = new Scanner(System.in);
        String title = scan1.nextLine();
        meeting.setTitle(title);
        meetingList.add(meeting);
        List<String> userList = new ArrayList<>();
        userList.add(name);
//        System.out.println("+++++");
        meeting.setParticipator(userList);
//        meeting.getParticipator().add(name);  //发起者是参与者列表的第一个
        System.out.println("请输入参会者姓名，输入0结束");
        while(true){
            Scanner scan2 = new Scanner(System.in);
            String participator = scan2.nextLine();
            if (!participator.equals("0")){
                meeting.participator.add(participator);
            }else {
                break;
            }
        }
        System.out.println("请输入会议开始时间");
        String startTime = scan1.nextLine();
        meeting.setStartTime(startTime);
        System.out.println("请输入会议结束时间");
        String endTime = scan1.nextLine();
        meeting.setEndTime(endTime);
        System.out.println("会议创建成功");
    }


    //查询会议
    public void meetingQuery(){
        boolean flag = true;
        for (int i = 0; i < meetingList.size(); i ++){
            if (currentName.equals(meetingList.get(i).getParticipator().get(0))){
                Meeting meeting = new Meeting("asdf","sdaf","asfd","fsd");
                meeting = meetingList.get(i);
                System.out.println("您发起的会议主题为：" + meeting.getTitle() );
                System.out.print("会议的参与者有：");
                for (int j = 0; j < meeting.getParticipator().size(); j ++){
                    System.out.print(meeting.getParticipator().get(j) + "   ");
                }
                System.out.println();
                System.out.println("会议的开始时间为：" + meeting.getStartTime());
                System.out.println("会议的结束时间为：" + meeting.getEndTime());
            }
        }
    }

    //增删会议参与者
    public void participatorEdit(){
        System.out.println("请从下列会议列表中选择您的会议");
        Meeting selectedMeeting = new Meeting("asdf","sdaf","asfd","fsd");
        for (int i = 0; i < meetingList.size(); i ++){
            if (currentName.equals(meetingList.get(i).getParticipator().get(0))){
                if (currentMeetingList.contains(meetingList.get(i))){
                    break;
                }else {
                    currentMeetingList.add(meetingList.get(i));
                }
            }
        }
        for(int i = 0 ; i < currentMeetingList.size(); i ++){
            System.out.print(currentMeetingList.get(i).getTitle() + "   ");
        }
        System.out.println();
        c: while(true){
            Scanner scanner = new Scanner(System.in);
            String selectedTitle = scanner.nextLine();
            for (int i = 0; i < currentMeetingList.size(); i ++){
                if (selectedTitle.equals(currentMeetingList.get(i).getTitle())){
                    selectedMeeting = currentMeetingList.get(i);
                    System.out.println("您已选择会议主题：" + selectedTitle);
                    System.out.println("增加会议参与者输入1，删除会议参与者输入2");
                    Integer number = scanner.nextInt();
                    if (number.equals(1)){
                        System.out.println("请输入增加参会者的名字，输入0结束");
                        while(true){
                            Scanner scanner1 = new Scanner(System.in);
                            String addName = scanner1.nextLine();
                            if (!addName.equals("0")){
                                currentMeetingList.get(i).getParticipator().add(addName);
                            }else {
                                System.out.println("增加完成");
                                break;
                            }
                        }
                    }
                    if (number.equals(2)){
                        System.out.print("当前会议参与者有：");
                        for (int j = 0; j < currentMeetingList.get(i).getParticipator().size(); j ++){
                            System.out.print(currentMeetingList.get(i).getParticipator().get(j) + "   ");
                        }
                        System.out.println();
                        System.out.println("请输入删除参会者的名字，输入0结束");

                        while(true){
                            Scanner scanner1 = new Scanner(System.in);
                            String addName = scanner1.nextLine();
                            if (!addName.equals("0")){
                                currentMeetingList.get(i).getParticipator().remove(addName);
                            }else {
                                System.out.println("删除完成");
                                break;
                            }
                        }

                    }
                    break c;
                }else {
                    System.out.println("输入错误，请重新输入会议主题");
                    continue c;
                }
            }
        }

        System.out.print("会议" + selectedMeeting.getTitle() + "当前的参与者为：" );
        for (int i = 0 ; i < selectedMeeting.getParticipator().size(); i ++){
            System.out.print(selectedMeeting.getParticipator().get(i) + "   ");
        }
        System.out.println();
    }


    //用户查询功能
    public void userQuery(){
        System.out.println("为您查找到已注册用户信息：");
        for (int i = 0; i < userList.size(); i ++){
            System.out.println("用户名：" + userList.get(i).getUserName() + "   邮箱：" + userList.get(i).getMail() + "    电话：" + userList.get(i).getPhone());
        }

    }

    //登出功能
    public void userLogout(){
//        User user = new User("asd","111","111",111,true);
        User user = getUserByUserName(currentName);
//        user.setIsLogin(false);
        System.out.println(currentName + "，您已成功登出系统");
    }

    //删除功能
    public void userDelete(){
//        System.out.println("请输入您要删除的用户名");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner,string;
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
        User user = getUserByUserName(currentName);
//        user.setIsLogin(false);
        userList.remove(user);
        System.out.println(currentName + "，您的账户已被注销");
    }


    public User getUserByUserName(String name){
        for(int i=0;i<userList.size();i++){
            if(name.equals(userList.get(i).getUserName())){
                User user = userList.get(i);
                return user;
            }
            break;
        }
        return null;
    }


    public static void main(String[] args) throws TException {
        ThriftClient Client = new ThriftClient();
        Client.startClient();
//        TTransport tTransport = new TFastFramedTransport(new TSocket("localhost", 8899), 600);
////        TProtocol tProtocol = new TCompactProtocol(tTransport);
////        UserService.Client client = new UserService.Client(tProtocol);
//        TTransport tTransport = null;
//
//
//        try {
//            tTransport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
//            // 协议要和服务端一致
//            TProtocol protocol = new TBinaryProtocol(tTransport);
////             TProtocol protocol = new TCompactProtocol(transport);
////             TProtocol protocol = new TJSONProtocol(transport);
//            final UserService.Client client = new UserService.Client(protocol);
//            tTransport.open();
//            TTransport finalTTransport = tTransport;
//
//            class MenuClass {
//                public void menu() throws TException {
//                    System.out.println("注册请输入1，登录请输入2,推出请输入0");
//                    Scanner scan = new Scanner(System.in);
//                    Integer ini = scan.nextInt();
//                    if (ini.equals(1)) {
//                        client.registe();
//                    } else if (ini.equals(2)) {
//                        client.login();
//                    } else if (ini.equals(0)){
//                        finalTTransport.close();
//                    }
//                    else {
//                        System.out.println("输入无效，请重新输入");
//                    }
//
//                }
//            }
//
//            MenuClass menuClass = new MenuClass();
//
//            System.out.println("注册请输入1，登录请输入2,退出请输入0");
//            Scanner scan = new Scanner(System.in);
//            Integer ini = scan.nextInt();
//            if (ini.equals(1)) {
//                client.registe();
//                menuClass.menu();
//            } else if (ini.equals(2)) {
//                client.login();
//            } else if (ini.equals(0)){
//                System.out.println("再见");
////                Robot r   =   new   Robot();
////                r.delay(   2000   );
//
//                tTransport.close();
//            }
//            else {
//                System.out.println("输入无效，请重新输入");
//            }
//        } catch (Exception ex) {
//            throw new RuntimeException(ex.getMessage(), ex);
//        } finally {
//            tTransport.close();
//        }

    }

}