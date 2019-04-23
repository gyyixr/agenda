package agenda.common.command.sub;


import agenda.common.annotations.SubCommand;
import agenda.common.command.AbstractCommand;
import agenda.common.service.UserSerivce;

@SubCommand
public class RemoveUserCMD extends AbstractCommand {

    public RemoveUserCMD() {
        this.setName("remove");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("n",true,"Name");
    };

    @Override
    protected void doing(){
        // 执行
        System.out.println("OK,the User had removed");
    }
}
