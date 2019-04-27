package agenda.common.command.sub;


import agenda.common.annotations.SubCommand;
import agenda.common.command.AbstractCommand;
import agenda.common.service.UserSerivce;


@SubCommand
public class  AddUserCMD extends AbstractCommand {

    public AddUserCMD() {
        this.setName("add");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("n",true,"Name");
        opts.addOption("p",true,"Password");
    };

    @Override
    protected void doing(){
        // 执行
        UserSerivce userSerivce = new UserSerivce();
        userSerivce.addUser(args[1],args[3]);
    }
}
