package agenda.common.command.sub;

import agenda.common.annotations.SubCommand;
import agenda.common.command.Command;
import agenda.common.command.RootCMD;
import agenda.common.utils.ClazzUtils;

import java.lang.annotation.Annotation;
import java.util.List;

public class CommandLoader {

    public static void load(Command root){

        Package currentPackage = CommandLoader.class.getPackage();
        List<Class<?>> classList = ClazzUtils.getClasssFromPackage(currentPackage.getName());
        for (Class clz : classList) {
            Annotation commandAnnotation = clz.getAnnotation(SubCommand.class);
            if(commandAnnotation == null){
                continue;
            }
            if(!Command.class.isAssignableFrom(clz)){
                continue;
            }
            try {
                Command subCommand = (Command)clz.newInstance();
                if(subCommand != null){
                    root.addCommand(subCommand);
                }
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
            }
        }
    }
}
