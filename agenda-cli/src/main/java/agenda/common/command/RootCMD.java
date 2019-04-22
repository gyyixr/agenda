package agenda.common.command;


public class RootCMD extends AbstractCommand {
    public RootCMD() {
        this.setName("root");
    }

    @Override
    protected void defineOpts(){
        opts.addOption("h", false, "HELP_DESCRIPTION");
        System.out.println("RootCMD Add OVER");
    }

    @Override
    protected void doing() {
        System.out.println("Doing RootCMD!");
    }
}
