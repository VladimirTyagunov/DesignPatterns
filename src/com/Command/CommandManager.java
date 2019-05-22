package com.Command;

        import java.util.ArrayList;

public class CommandManager {
    private static CommandManager instance;
    private boolean flag = false;
    private ArrayList<Command> commands = new ArrayList<Command>();

    private CommandManager() {
    }

    public void registrateCommand(Command command){
        if (flag == false) {
            commands.add(command);
//            System.out.println(commands);
//            System.out.println(this);
        }
    }

    public static CommandManager getInstance() {
        if (instance == null) {
            instance = new CommandManager();
        }
        return instance;
    }

    public void undo() {
        commands.remove(commands.size()-1);
        System.out.println(commands);

        flag = true;

        for (Command command:commands) {
            command.execute();
        }

        flag = false;
    }
}
