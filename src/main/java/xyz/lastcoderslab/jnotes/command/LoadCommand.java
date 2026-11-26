package xyz.lastcoderslab.jnotes.command;

import xyz.lastcoderslab.jnotes.util.Message;
import xyz.lastcoderslab.jnotes.util.MessageType;
import xyz.lastcoderslab.jnotes.util.TextColor;

public class LoadCommand implements ICommand{

    @Override
    public String getName() {
        return "/load";
    }

    @Override
    public String getDescription() {
        return "Загрузить массив из файла";
    }

    @Override
    public void execute(String[] args) {
        if(args.length < 1) {
            Message.send("Не хватает аргументов", MessageType.ERROR);
            return;
        }
        // ToDo
        Message.send("Загружен массив:\n");
        Message.send("Используйте его для последующих сортировок");
        return;
    }

    @Override
    public String help() {
        String help = TextColor.BOLD + "" + TextColor.YEllOW + getName() + TextColor.RESET +
                TextColor.BLUE + " [path/to/file]"  + TextColor.RESET  +" - " + getDescription();
        return help;
    }
}
