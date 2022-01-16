package houserent.service;

import houserent.domain.House;


public class HouseService {

    private House[] houses; //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长到哪个值

    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，   先初始化一个House对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //change方法,修改对应房屋信息
    public boolean change(int changeID) {
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == changeID) {
                return true;
            }
        }
        return false;
    }

    //search方法,返回对应的房屋信息
    public House search(int searchID) {
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == searchID) {
                return houses[i];
            }
        }
        return null;
    }

    //del方法,删除对应ID的房屋
    public boolean del(int delID) {
        //应当先找到要删除的房屋对应的下标
        //设置一个index判断是否找到
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == delID) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("该编号房屋不存在");
            return false;
        }
        //如果找到则删除该元素,数组元素前移一位,覆盖house[index]
        else {
            for (int i = index; i < houseNums - 1; i++) {
                houses[i] = houses[i + 1];
            }
            houseNums--;
            houses[houseNums] = null;//把原来存在的最后一个房屋对应元素置空
        }
        return true;
    }


    //add方法，添加新对象,返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(我们暂时不考虑数组扩容的问题) => 能否自己加入数组扩容机制(~~)
        if (houseNums == houses.length) {//不能再添加
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        //把newHouse对象加入到，新增加了一个房屋
        houses[houseNums++] = newHouse;
        //我们程序员需要设计一个id自增长的机制, 然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }
}



