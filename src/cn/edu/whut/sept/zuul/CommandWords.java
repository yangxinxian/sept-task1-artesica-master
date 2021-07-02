package cn.edu.whut.sept.zuul;

/**
 * 这个类是应用程序 "World of Zuul" 的一部分
 * "World of Zuul" 是个十分简单的文字冒险游戏.
 *
 * CommandWords存储命令词汇库
 * 返回命令词汇，检测词汇是否是已知词汇和检测是否有第二个词时返沪bool值。
 *
 * @标注者 杨晨
 */

public class CommandWords
{
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    public CommandWords()
    {
        // nothing to do at the moment...
    }

    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
