package agenda.common.command;

public interface Command {
    void execute();
    void setArgs(String[] args);
    String getName();
    void setName(String name);
    void addCommand(Command cmd);
}
