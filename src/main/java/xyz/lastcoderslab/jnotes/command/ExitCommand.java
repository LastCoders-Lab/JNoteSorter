package xyz.lastcoderslab.jnotes.command;

import xyz.lastcoderslab.jnotes.util.Message;
import xyz.lastcoderslab.jnotes.util.MessageType;
import xyz.lastcoderslab.jnotes.util.TextColor;

public class ExitCommand implements ICommand{
    @Override
    public String getName() {
        return "/exit";
    }

    @Override
    public String getDescription() {
        return "Выход";
    }

    @Override
    public void execute(String[] args) {
        Message.send("Bye!", MessageType.MAIN);
    }

    @Override
    public String help() {
        String help = TextColor.BOLD + "" + TextColor.YEllOW + getName() + TextColor.RESET + " - " + getDescription() + "\n";
        return help;
    }
}
