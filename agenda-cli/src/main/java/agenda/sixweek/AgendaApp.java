package agenda.sixweek;

import agenda.common.command.sub.AddUserCMD;
import agenda.common.command.Command;
import agenda.common.command.sub.CommandLoader;
import agenda.common.command.sub.ListUserCMD;
import agenda.common.command.RootCMD;

public class AgendaApp {
    public static void main( String[] args ) {
        //printArgs(args);

        // rootcmd agenda -h
        // subcmd agenda add -n Name -m Name@qq.com
        // subcmd agenda list / agenda list -d

        Command root = new RootCMD();
        root.setArgs(args);
        CommandLoader.load(root);
        root.execute();
    }
}
