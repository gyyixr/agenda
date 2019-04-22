package agenda.common.command;


import agenda.common.service.UserSerivce;

public class  AddUserCMD extends AbstractCommand {

    public AddUserCMD() {
        this.setName("add");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("n",true,"Name");
        opts.addOption("m",true,"Mail");
    };

    @Override
    protected void doing(){
        // 执行
        UserSerivce userSerivce = new UserSerivce();
        userSerivce.addUser(args[1],args[3]);
    }
}
