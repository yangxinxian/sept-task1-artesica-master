package cn.edu.whut.sept.zuul;


/**
 * �������Ӧ�ó��� "World of Zuul" ��һ����
 * "World of Zuul" �Ǹ�ʮ�ּ򵥵�����ð����Ϸ.
 *
 * Command������ʻ��Ϊ��һ����ڶ����洢��
 * ��������ʻ㣬���ʻ��Ƿ�����֪�ʻ�ͼ���Ƿ��еڶ�����ʱ����boolֵ��
 *
 * @��ע�� �
 */

public class Command
{
    private String commandWord;
    private String secondWord;

    /* 
     * ���캯�������������ʳ�ʼ����
     * */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /* 
     * ���ص�һ����
     * */
    public String getCommandWord()
    {
        return commandWord;
    }

    /* 
     * ���صڶ�����
     * */
    public String getSecondWord()
    {
        return secondWord;
    }

    /* 
     * ����һ�����Ƿ���ڣ���ȷ��
     * */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /* 
     * ���ڶ������Ƿ����
     * */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
