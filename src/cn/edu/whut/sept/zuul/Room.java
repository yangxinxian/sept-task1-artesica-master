package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**
 * 这个类是应用程序 "World of Zuul" 的一部分
 * "World of Zuul" 是个十分简单的文字冒险游戏.
 *
 * Room为房间类，存储房间描述和地形
 * 返回命令词汇，检测词汇是否是已知词汇和检测是否有第二个词时返沪bool值。
 *
 * @标注者 杨晨
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
     * 设置相邻房间
     * @param 前往相邻房间neighbor所需去往的方向direction
     * */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }


    /** 
     * @return 房间描述
     * */
    public String getShortDescription()
    {
        return description;
    }

    /** 
     * @return 文字串，描述操作者所在地与可以去往的方向
     * */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /** 
     * @return 文字串，描述操作者可以去往的方向
     * */
    private String getExitString()
    {
        String returnString = "Exits:";
        // 遍历房间的地图，找到可以去的方向，合并成一个字符串
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /** 
     * @return 地图exits中方向direction对应的Room
     * */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


