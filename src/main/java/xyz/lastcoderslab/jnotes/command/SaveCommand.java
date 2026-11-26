package xyz.lastcoderslab.jnotes.command;

import xyz.lastcoderslab.jnotes.util.Message;
import xyz.lastcoderslab.jnotes.util.TextColor;

public class SaveCommand implements ICommand{
    @Override
    public String getName() {
        return "/save";
    }

    @Override
    public String getDescription() {
        return "Сохранить в файл";
    }

    @Override
    public void execute(String[] args) {
        // ToDo
        Message.send("Ваш массив сохранен в файле: ");
    }

    @Override
    public String help() {
        String help = TextColor.BOLD + "" + TextColor.YEllOW + getName() +
                TextColor.RESET  +" - " + getDescription();
        return help;
    }
}
