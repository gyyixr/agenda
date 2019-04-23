package agenda.common.command;


public class RootCMD extends AbstractCommand {
    public RootCMD() {
        this.setName("root");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("h", false, "HELP_DESCRIPTION");
    }

    @Override
    protected void doing() {
        System.out.println("Welcome use Help");
        System.out.println("add -n [UserName] -m [UserMail]");
        System.out.println("list [-d][detail]");
    }
}
