package cn.edu.whut.sept.zuul;

/**
 * �������Ӧ�ó��� "World of Zuul" ��һ����
 * "World of Zuul" �Ǹ�ʮ�ּ򵥵�����ð����Ϸ.
 *
 * CommandWords�洢����ʻ��
 * ��������ʻ㣬���ʻ��Ƿ�����֪�ʻ�ͼ���Ƿ��еڶ�����ʱ����boolֵ��
 *
 * @��ע�� �
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
