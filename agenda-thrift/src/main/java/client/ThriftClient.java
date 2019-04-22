package client;

import generated.UserService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.Scanner;

public class ThriftClient {

    public static void main(String[] args) {
        TTransport tTransport = new TFastFramedTransport(new TSocket("localhost", 8899), 600);
        TProtocol tProtocol = new TCompactProtocol(tTransport);
        UserService.Client client = new UserService.Client(tProtocol);
        try {
            tTransport.open();
            class MenuClass {
                public void menu() throws TException {
                    System.out.println("注册请输入1，登录请输入2,推出请输入0");
                    Scanner scan = new Scanner(System.in);
                    Integer ini = scan.nextInt();
                    if (ini.equals(1)) {
                        client.registe();
                    } else if (ini.equals(2)) {
                        client.login();
                    } else if (ini.equals(0)){
                        tTransport.close();
                    }
                    else {
                        System.out.println("输入无效，请重新输入");
                    }

                }
            }
            MenuClass menuClass = new MenuClass();
            System.out.println("注册请输入1，登录请输入2,推出请输入0");
            Scanner scan = new Scanner(System.in);
            Integer ini = scan.nextInt();
            if (ini.equals(1)) {
                client.registe();
                menuClass.menu();
            } else if (ini.equals(2)) {
                client.login();
            } else if (ini.equals(0)){
                System.out.println("再见");
                tTransport.close();
            }
            else {
                System.out.println("输入无效，请重新输入");
            }






        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } finally {
            tTransport.close();
        }



    }

}