package server;

import generated.DataException;
import generated.User;
import generated.UserService;
import org.apache.thrift.TException;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService.Iface {
    public static List<User> userList = new ArrayList<>();

    //用户注册
    @Override
    public void registe() throws DataException, TException {
//        boolean Exist = false;
        System.out.println("11111111");
//        while (true){
//            System.out.println("请输入用户名：");
//            User user =new User();
//            Scanner scan = new Scanner(System.in);
//            user.setUserName(scan.nextLine());
//            for(int i=0;i<userList.size();i++){
//                if(user.userName.equals(userList.get(i).getUserName())){
//                    System.out.println("该用户名已被注册，请重新注册");
//                    break;
//                }else {
//                    System.out.println("请输入密码：");
//                    user.setPassWord(scan.nextLine()) ;
//                    System.out.println("请输入邮箱：");
//                    user.setMail(scan.nextLine()) ;
//                    System.out.println("请输入手机号码：");
//                    user.setPhone(scan.nextLong()) ;
//                    userList.add(user);
//                    System.out.println("注册成功");
//                    System.out.println();
//                    Exist = true;
//                    break;
//                }
//            }
//            if (Exist == true)  break;
//        }
    }

    //用户登录
    @Override
    public void  login() throws TException {
//        String userName = "";
//        String passWord = "";
//        System.out.println("请输入用户名：");
//        Scanner scan = new Scanner(System.in);
//        userName = scan.nextLine();
//        a: for(int i=0;i<userList.size();i++){
//            if(userName.equals(userList.get(i).getUserName())){
//                System.out.println("请输入密码：");
//                passWord = scan.nextLine();
//                break a;
//            }
//            System.out.println( "该用户名暂未注册");
//
//        }
//
//        for(int i=0;i<userList.size();i++){
//            if(userName.equals(userList.get(i).getUserName())){
//                User user = userList.get(i);
//                if(user.getPassWord().equals(passWord)){
//                    userList.get(i).setIsLogin(true);
//                    System.out.println("登录成功");
//                }
//                else{
//                    System.out.println("密码错误，登录失败");
//                }
//            }
//            break;
//        }
    }

    //用户登出
    @Override
    public void logout(String userName, boolean isLogin) throws TException {
//        isLogin = false;
//        User user = getUserByUserName(userName);
//        user.setIsLogin(isLogin);
//        System.out.println("已登出");
    }

    //用户查询
    @Override
    public void check(String userName) throws TException {
//        User user = getUserByUserName(userName);
//        System.out.println("用户名:"+user.getUserName());
//        System.out.println("邮箱:"+user.getMail());
//        System.out.println("手机号码:"+user.getPhone());
//        System.out.println("登录状态:"+true);
    }

    //用户删除
    @Override
    public void deleteUser(String userName) throws TException {
//        User user = getUserByUserName(userName);
//        user.setIsLogin(false);
//        userList.remove(user);
//        System.out.println("已删除该用户");
    }


//    public User getUserByUserName(String name){
//        for(int i=0;i<userList.size();i++){
//            if(name.equals(userList.get(i).getUserName())){
//                User user = userList.get(i);
//                return user;
//            }
//            break;
//        }
//        return null;
//    }
}
