package server;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.User;
import thrift.generated.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService.Iface {

    @Override

    public void registe() throws DataException, TException {
        System.out.println("请输入用户名：");
        User user =new User();
        Scanner scan = new Scanner(System.in);
        user.setUserName(scan.nextLine());
        for(int i=0;i<userList.size();i++){
            if(user.userName.equals(userList.get(i).getUserName())){
                System.out.println("改用户名已被注册，请重新注册");
            }
        }

        System.out.println("请输入密码：");
        user.setPassWord(scan.nextLine()) ;
        System.out.println("请输入邮箱：");
        user.setMail(scan.nextLine()) ;
        System.out.println("请输入手机号码：");
        user.setPhone(scan.nextLong()) ;
        userList.add(user);
        System.out.println("注册成功");
    }

    @Override
    public void  login() throws TException {
        String userName = "";
        String passWord = "";
        System.out.println("请输入用户名：");
        Scanner scan = new Scanner(System.in);
        userName = scan.nextLine();
        a: for(int i=0;i<userList.size();i++){
            if(userName.equals(userList.get(i).getUserName())){
                System.out.println("请输入密码：");
                passWord = scan.nextLine();
                break a;
            }
            System.out.println( "该用户名暂未注册");

        }

        for(int i=0;i<userList.size();i++){
            if(userName.equals(userList.get(i).getUserName())){
                User user = userList.get(i);
                if(user.getPassWord().equals(passWord)){
                    userList.get(i).setIsLogin(true);
                    System.out.println("登录成功");
                }
                else{
                    System.out.println("密码错误，登录失败");
                }
            }
            break;


        }



    }

    @Override
    public void logout(String userName, boolean isLogin) throws TException {
        isLogin = false;
        User user = getUserByUserName(userName);
        user.setIsLogin(isLogin);
        System.out.println("已登出");


    }

    @Override
    public void check(String userName) throws TException {
        User user = getUserByUserName(userName);
        System.out.println("用户名:"+user.getUserName());
        System.out.println("邮箱:"+user.getMail());
        System.out.println("手机号码:"+user.getPhone());
        System.out.println("登录状态:"+true);

    }

    @Override
    public void deleteUser(String userName) throws TException {
        User user = getUserByUserName(userName);
        user.setIsLogin(false);
        userList.remove(user);
        System.out.println("已删除该用户");
    }
    public static List<User> userList = new ArrayList<>();

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
}
