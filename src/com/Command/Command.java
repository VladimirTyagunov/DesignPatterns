package com.Command;

public abstract class Command implements ICommand {

    public final void execute() {
        CommandManager CM = CommandManager.getInstance();
        CM.registrateCommand(this);
        this.doExecute();
    }

    abstract protected void doExecute();
}
