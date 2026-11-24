package xyz.lastcoderslab.jnotes.command;

public interface ICommand {
    String getName();

    String getDescription();

    void execute(String[] args);

    //Map<String, String> arguments();

    String help();
}
