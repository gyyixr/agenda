package agenda.common.command.sub;

import agenda.common.annotations.SubCommand;
import agenda.common.command.AbstractCommand;
import agenda.common.service.UserSerivce;

@SubCommand
public class ListUserCMD extends AbstractCommand {

    public ListUserCMD() {
        this.setName("list");
    }

    @Override
    protected void defineOpts() {
    }

    ;

    @Override
    protected void doing() {
        //TODO 执行
        UserSerivce userSerivce = new UserSerivce();
        userSerivce.listUser();
        ;
    }
}