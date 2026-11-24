package xyz.lastcoderslab.jnotes.command;

import xyz.lastcoderslab.jnotes.util.Message;
import xyz.lastcoderslab.jnotes.util.MessageType;
import xyz.lastcoderslab.jnotes.util.TextColor;

public class GenerateCommand implements ICommand{
    @Override
    public String getName() {
        return "/generate";
    }

    @Override
    public String getDescription() {
        return "Создает новый набор данных для сортировки";
    }

    @Override
    public void execute(String[] args) {
        if(args.length < 1) {
            Message.send("Не хватает аргументов", MessageType.ERROR);
            return;
        }
        if (args[0].matches("\\d+")) {

            Message.send("Ваш массив:");
            //Печать сгенерированного массива
            Message.send("Массив из " + args[0] + " элементов"); //заглушка

            Message.send("Используйте его для последующих сортировок");
            return;
        }
        Message.send("Значение аргумента должно быть целым положительным числом", MessageType.ERROR);
    }

    @Override
    public String help() {
        String help = TextColor.BOLD + "" + TextColor.YEllOW + getName() + TextColor.RESET +
                TextColor.BLUE + " [размерность]" + TextColor.RESET  +" - " + getDescription() + "\n";
        return help;
    }
}
