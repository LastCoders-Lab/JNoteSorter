package xyz.lastcoderslab.jnotes;

import xyz.lastcoderslab.jnotes.command.*;
import xyz.lastcoderslab.jnotes.util.Message;
import xyz.lastcoderslab.jnotes.util.MessageType;
import xyz.lastcoderslab.jnotes.util.TextColor;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    private Scanner sc;
    private String cmd = "";
    Map<String, ICommand> commands = new LinkedHashMap<>();

    public void run(){
        // Для стратегии
        commands.put("/generate", new GenerateCommand());
        commands.put("/load", new LoadCommand());
        commands.put("/save", new SaveCommand());
        commands.put("/sort", new SortCommand());
        commands.put("/exit", new ExitCommand());

        System.out.println(TextColor.ORANGE + "|~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println(TextColor.ORANGE + "| J N o t e S o r t e r |");
        System.out.println(TextColor.ORANGE + "|~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println();

        dialog();
    }

    private void dialog() {
        System.out.println(help());
        sc = new Scanner(System.in);

        do {
            sc = new Scanner(System.in);
            String commandLine = sc.nextLine();
            String[] args;
            args = commandLine.split(" ");
            args[0] = args[0].trim();
            if (!args[0].startsWith("/")) {
                Message.send("Неверный формат команды", MessageType.ERROR);
            }
            else {
                cmd = args[0];
                if(args.length > 1) {
                    args = Arrays.copyOfRange(args,1, args.length);
                }
                else args = new String[0];

                if(commands.containsKey(cmd)) {
                    commands.get(cmd).execute(args);
                }
                else {
                    Message.send("Неизвесная команда", MessageType.ERROR);
                }
            }
        }
        while (! cmd.equals("/exit"));
    }

    public String help() {
        String s =Message.get("Доступные команды:\n", MessageType.MAIN);
        for(String cmdKey : commands.keySet()) {
            s += commands.get(cmdKey).help() + "\n";
        }
        return s;
    }
}
