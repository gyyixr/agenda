package agenda.common.command;


public class ListUserCMD extends AbstractCommand {

    public ListUserCMD() {
        this.setName("list");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("d",true,"Detail");
    };

    @Override
    protected void doing(){
        //TODO 执行

    }



}
