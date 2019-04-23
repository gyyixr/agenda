package agenda.fifthweek;

import agenda.common.command.sub.AddUserCMD;
import agenda.common.command.Command;
import agenda.common.command.sub.ListUserCMD;
import agenda.common.command.RootCMD;
import agenda.common.command.sub.RemoveUserCMD;

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

        Command removeUserCMD = new RemoveUserCMD();
        root.addCommand(removeUserCMD);

        root.execute();
        //System.out.println("hello!");
    }
}
