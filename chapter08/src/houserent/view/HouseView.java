package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utils.Utility;


/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择
    private HouseService houseService = new HouseService(10);//设置数组的大小为2

    //编写修改房源信息功能
    public void changeHouse() {
        System.out.println("=============修改房屋============");
        System.out.println("请输入待修改房屋编号");
        int changeID = Utility.readInt();
        House house = houseService.search(changeID);
        if (house == null) {
            System.out.println("你要修改的房屋编号不存在");
            return;
        }
        System.out.print("修改后的姓名:");
        String name = Utility.readString(8, "");//用户直接回车表示不修改信息,默认空串
        if (!"".equals(name)) {//如果不是空串
            house.setName(name);//那么去修改
        }//否则名字将变成空串

        System.out.print("修改后的电话:");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)) {
            house.setTelephone(phone);
        }

        System.out.print("修改后的地址");
        String address = Utility.readString(18,"");//不加后面的" "会提示你一直输入
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("修改后的租金:");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("修改后的状态(已出租/未出租):");
        String state = Utility.readString(3,"");
        if (!"".equals(state)) {
            house.setAddress(state);
        }
    }


    //编写查找房源信息功能
    public void searchHouse() {
        System.out.println("=============查找房屋============");
        System.out.println("请输入待查找房屋编号");
        int searchID = Utility.readInt();
        System.out.println(houseService.search(searchID));
    }

    //编写退出机制
    public void exit() {
        System.out.println("你确定要退出吗?Y--Yes N--No");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            loop = false;
        }
    }

    //编写delHouse() 接受用户输入ID
    public void delHouse() {
        System.out.println("=============删除房屋============");
        System.out.println("请输入待删除房屋编号(-1退出)");
        int delID = Utility.readInt();
        if (delID == -1) {
            System.out.println("取消删除");
            return;
        }
        System.out.println("确认是否删除Y--Yes N--No");
        if (Utility.readConfirmSelection() == 'Y') {

            if (houseService.del(delID)) {
                System.out.println(delID + "号房屋删除成功");
            }
        } else {
            System.out.println("取消删除");
            return;
        }
    }


    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("================添加房屋===============");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //创建一个新的House对象, 注意id 是系统分配的，
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("==============添加房屋成功=============");
        } else {
            System.out.println("==============添加房屋失败=============");
        }

    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("================房屋列表===============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {//大家想想，这里老韩有什么？雷,坑
            if (houses[i] == null) {//如果为null,就不用再显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕============");

    }

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("\n=============房屋出租系统菜单===========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    changeHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}




