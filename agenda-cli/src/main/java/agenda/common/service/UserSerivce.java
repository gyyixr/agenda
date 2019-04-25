package agenda.common.service;

public class UserSerivce {


    public void addUser(String name,String password){
        System.out.println("已添加用户:" + name + ",密码："+password);
    }
    public void listUser(){
        System.out.println("用户1：郭雨阳");
        System.out.println("用户2：申浩");
    }
    public void deleteUser(String name){
        System.out.println("用户："+name+" 已删除！");
    }
}
