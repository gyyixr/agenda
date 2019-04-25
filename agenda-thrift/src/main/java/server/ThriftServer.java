package server;

import generated.User;
import generated.UserService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;


public class ThriftServer {
    public static final int SERVER_PORT = 8090;


    // 简单的单线程服务模型，一般用于测试
    public void startSimleServer(){
        try {
            System.out.println("UserInfoServiceDemo TSimpleServer start ....");
            TProcessor tprocessor = new UserService.Processor<UserService.Iface>(new UserServiceImpl());
            TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();

            //初始化admin对象
            User admin = new User("asd", "111", "111", 111, true);
            admin.setUserName("admin");
            admin.setPassWord("admin");

        } catch (Exception e) {
            System.out.println("Server start error!!!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        ThriftServer server = new ThriftServer();
        server.startSimleServer();
    }

//        TNonblockingServerSocket socket = new TNonblockingServerSocket(8899);
//        THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);
//        //范型就是实现的接收类
//        UserService.Processor<UserServiceImpl> processor = new UserService.Processor<>(new UserServiceImpl());
//
//        //表示协议层次（压缩协议）
//        arg.protocolFactory(new TCompactProtocol.Factory());
//        //表示传输层次
//        arg.transportFactory(new TFramedTransport.Factory());
//        arg.processorFactory(new TProcessorFactory(processor));
//
//        //半同步半异步的server
//        TServer server = new THsHaServer(arg);
//
//        System.out.println("Thrift Server started!");
//
//
//        //死循环，永远不会退出
//        server.serve();
//    }


}
