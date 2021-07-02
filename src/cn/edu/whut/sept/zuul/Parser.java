package cn.edu.whut.sept.zuul;

import java.util.Scanner;

/**
 * 这个类是应用程序 "World of Zuul" 的一部分
 * "World of Zuul" 是个十分简单的文字冒险游戏.
 *
 * parser读输入命令并将之翻译成 "Adventure"
 * 命令. 每次使用，它读一行终端命令并
 * 分解成两个单词. 它将命令作为
 * Command类返回.
 *
 * parser 有一套已知命令词. 它检查用户输入是否在
 * 已知词里, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 *
 * @author  Michael K枚lling and David J. Barnes
 * @version 2016.02.29
 * @翻译 杨晨
 */
public class Parser
{
    private CommandWords commands;  // holds all valid command words
    private Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand()
    {
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "null" command (for unknown command).
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
     * Print out a list of valid command words.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}

