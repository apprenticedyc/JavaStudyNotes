import java.util.Random;
import java.util.Scanner;

public class MoraGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //测试次数
        System.out.println("您要玩几次:");
        int round = input.nextInt();


        //生成一个玩家对象
        Tom t = new Tom();


        //用来记录胜场
        int wincount = 0;

        // 创建一个二维数组，用来接收局数，Tom出拳情况以及电脑出拳情况
        int[][] arr = new int[round][3];


        // 创建一个一维数组，用来接收输赢情况
        String[] arr2 = new String[round];


        //测试
        for (int i = 0; i < round; i++) {
            //获取玩家出的拳
            System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）：");
            int num = input.nextInt();
            arr[i][1] = num;
            //对玩家输入的数进行判定看是否符合
            t.setTomGuss(num);
            int tomGussNum = t.tomGussNum;


            //获取电脑出的拳
            int comGussNum = t.computerGuss();
            arr[i][2] = comGussNum;


            //获取局数
            arr[i][0] = t.count;


            //将玩家出的拳和电脑做比较
            String iswin = t.isWIn();
            arr2[i] = t.isWIn();


            //输出每局结果
            System.out.println("===========================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t结果");
            System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + "\t" + arr[i][2] + "\t\t" + arr2[i]);
            System.out.println("===========================");
            System.out.println("\n\n");
            t.count++;


            //记录胜场
            wincount = t.wincount(iswin);

        }

        //输出整体结果
        System.out.println("=========================================");
        System.out.println("局数\t\t\t玩家的出拳\t电脑的出拳\t输赢情况");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t\t\t");
            }
            System.out.println(arr2[i]);
        }
        System.out.println("你一共赢了" + wincount + "次");
        System.out.println("=========================================");
    }
}


class Tom {
    int tomGussNum;
    int comGussNum;
    int count = 1;
    int winnedcount = 0;

    //对输入的数进行判定
    public void setTomGuss(int tomGussNum) {
        if (tomGussNum > 2 || tomGussNum < 0) {
            //抛出一个异常
            throw new IllegalArgumentException("数字输入错误");
        }
        this.tomGussNum = tomGussNum;
    }


    //生成电脑出拳的方法
    public int computerGuss() {
        Random r = new Random();//Random是个类;
        comGussNum = r.nextInt(3);//bound表示区间0-2
        return comGussNum;
    }

    //判断输赢并返回结果的方法
    public String isWIn() {
        //0-石头 1-剪刀 2-布
        if (tomGussNum == 0 && comGussNum == 1) {
            return "你赢了";
        } else if (tomGussNum == 1 && comGussNum == 2) {
            return "你赢了";
        } else if (tomGussNum == 2 && comGussNum == 0) {
            return "你赢了";
        } else if (tomGussNum == comGussNum) {
            return "平手";
        }
        return "你输了";
    }

    //每局结束后重新统计总胜场
    public int wincount(String n) {
        if (n.equals("你赢了")) {
            winnedcount++;
        }
        return winnedcount;
    }
}



