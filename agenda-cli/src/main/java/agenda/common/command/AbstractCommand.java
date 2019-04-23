package agenda.common.command;

import org.apache.commons.cli.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractCommand implements Command {

    protected String name;
    protected String[] args;
    protected Options opts = new Options();
    protected CommandLineParser parser;
    protected CommandLine commandLine;

    private boolean subcmd = false;

    private List<Command> cmds = new ArrayList<Command>();

    protected void parser() {
        if (args.length > 0) {
            if (args[0].startsWith("-") == false) {
                for (Iterator<Command> iter = cmds.iterator(); iter.hasNext(); ) {
                    Command cmd = iter.next();
                    if (cmd.getName().equals(args[0])) {
                        // find sub
                        subcmd = true;
                        String[] args1 = new String[args.length-1];
                        for (int i = 0; i < args1.length; i++) {
                            args1[i] = args[i + 1];
                        }
                        cmd.setArgs(args1);
                        cmd.execute();
                        return;
                    }
                }
                System.out.println("Eerr SUB CMD");
                return;
            }
        }
        parser = new BasicParser();
        try {
            commandLine = parser.parse(opts, args);
        } catch ( ParseException e ) {
            e.printStackTrace();
        };
    }

    /**
     * 执行命令
     */
    protected abstract void doing();

    /**
     * 定义命令
     */
    protected abstract void defineOpts();

    @Override
    public void execute() {
        defineOpts();
        parser();
        if (!subcmd) {
            doing();
        }
    }

    @Override
    public void setArgs(String[] args) {
        this.args = args;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCommand(Command cmd) {
        cmds.add(cmd);
    }
}
