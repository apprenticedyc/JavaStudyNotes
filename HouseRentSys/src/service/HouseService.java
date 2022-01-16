package service;

import domain.House;

public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 0; //记录当前有多少个房屋信息
    private int idCounter = 0; //记录当前的id增长到哪个值
    public HouseService(int size) {
        houses = new House[size];
    }


    public House[] list(){
        return houses;
    }

    public boolean addHouse(House newhouse) {
        if (houseNums==houses.length){
            System.out.println("不能再添加了");
            return false;
        }
        //添加一个house顺便使数组下标前移一位
        houses[houseNums++] = newhouse;
        //房屋id自增长
        newhouse.setId(++idCounter);
        return true;
    }
}

