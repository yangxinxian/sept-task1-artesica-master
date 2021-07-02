package cn.edu.whut.sept.zuul;


/**
 * 这个类是应用程序 "World of Zuul" 的一部分
 * "World of Zuul" 是个十分简单的文字冒险游戏.
 *
 * Command将命令词汇分为第一个与第二个存储，
 * 返回命令词汇，检测词汇是否是已知词汇和检测是否有第二个词时返沪bool值。
 *
 * @标注者 杨晨
 */

public class Command
{
    private String commandWord;
    private String secondWord;

    /* 
     * 构造函数，根据两个词初始化类
     * */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /* 
     * 返回第一个词
     * */
    public String getCommandWord()
    {
        return commandWord;
    }

    /* 
     * 返回第二个词
     * */
    public String getSecondWord()
    {
        return secondWord;
    }

    /* 
     * 检测第一个词是否存在（正确）
     * */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /* 
     * 检测第二个词是否存在
     * */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
