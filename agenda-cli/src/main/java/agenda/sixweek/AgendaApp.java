package agenda.sixweek;

import agenda.common.command.AddUserCMD;
import agenda.common.command.Command;
import agenda.common.command.ListUserCMD;
import agenda.common.command.RootCMD;

public class AgendaApp {
    public static void main( String[] args ) {
        //printArgs(args);

        // rootcmd agenda -h
        // subcmd agenda add -n Name -m Name@qq.com
        // subcmd agenda list / agenda list -d

        Command root = new RootCMD();
        root.setArgs(args);

        Command addUserCMD = new AddUserCMD();
        root.addCommand(addUserCMD);

        Command listUserCMD = new ListUserCMD();
        root.addCommand(listUserCMD);

        root.execute();
        //System.out.println("hello!");
    }
}
