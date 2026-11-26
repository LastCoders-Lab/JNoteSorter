package xyz.lastcoderslab.jnotes.command;

import xyz.lastcoderslab.jnotes.util.TextColor;

public class SortCommand implements ICommand{
    @Override
    public String getName() {
        return "/sort";
    }

    @Override
    public String getDescription() {
        return "Выполнить сортировку";
    }

    @Override
    public void execute(String[] args) {

    }

    @Override
    public String help() {
        String help = TextColor.BOLD + "" + TextColor.YEllOW + getName() + TextColor.RESET +
                " - Сортрировка";
        return help;
    }
}
