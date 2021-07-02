package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**
 * �������Ӧ�ó��� "World of Zuul" ��һ����
 * "World of Zuul" �Ǹ�ʮ�ּ򵥵�����ð����Ϸ.
 *
 * RoomΪ�����࣬�洢���������͵���
 * ��������ʻ㣬���ʻ��Ƿ�����֪�ʻ�ͼ���Ƿ��еڶ�����ʱ����boolֵ��
 *
 * @��ע�� �
 */

public class Room
{
    private String description;
    private HashMap<String, Room> exits;

    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * �������ڷ���
     * @param ǰ�����ڷ���neighbor����ȥ���ķ���direction
     * */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }


    /** 
     * @return ��������
     * */
    public String getShortDescription()
    {
        return description;
    }

    /** 
     * @return ���ִ����������������ڵ������ȥ���ķ���
     * */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /** 
     * @return ���ִ������������߿���ȥ���ķ���
     * */
    private String getExitString()
    {
        String returnString = "Exits:";
        // ��������ĵ�ͼ���ҵ�����ȥ�ķ��򣬺ϲ���һ���ַ���
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /** 
     * @return ��ͼexits�з���direction��Ӧ��Room
     * */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


