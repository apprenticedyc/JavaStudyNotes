import java.util.Random;
import java.util.Scanner;

public class MoraGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //���Դ���
        System.out.println("��Ҫ�漸��:");
        int round = input.nextInt();


        //����һ����Ҷ���
        Tom t = new Tom();


        //������¼ʤ��
        int wincount = 0;

        // ����һ����ά���飬�������վ�����Tom��ȭ����Լ����Գ�ȭ���
        int[][] arr = new int[round][3];


        // ����һ��һά���飬����������Ӯ���
        String[] arr2 = new String[round];


        //����
        for (int i = 0; i < round; i++) {
            //��ȡ��ҳ���ȭ
            System.out.println("��������Ҫ����ȭ��0-ȭͷ��1-������2-������");
            int num = input.nextInt();
            arr[i][1] = num;
            //�����������������ж����Ƿ����
            t.setTomGuss(num);
            int tomGussNum = t.tomGussNum;


            //��ȡ���Գ���ȭ
            int comGussNum = t.computerGuss();
            arr[i][2] = comGussNum;


            //��ȡ����
            arr[i][0] = t.count;


            //����ҳ���ȭ�͵������Ƚ�
            String iswin = t.isWIn();
            arr2[i] = t.isWIn();


            //���ÿ�ֽ��
            System.out.println("===========================");
            System.out.println("����\t��ҳ�ȭ\t���Գ�ȭ\t���");
            System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + "\t" + arr[i][2] + "\t\t" + arr2[i]);
            System.out.println("===========================");
            System.out.println("\n\n");
            t.count++;


            //��¼ʤ��
            wincount = t.wincount(iswin);

        }

        //���������
        System.out.println("=========================================");
        System.out.println("����\t\t\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t\t\t");
            }
            System.out.println(arr2[i]);
        }
        System.out.println("��һ��Ӯ��" + wincount + "��");
        System.out.println("=========================================");
    }
}


class Tom {
    int tomGussNum;
    int comGussNum;
    int count = 1;
    int winnedcount = 0;

    //��������������ж�
    public void setTomGuss(int tomGussNum) {
        if (tomGussNum > 2 || tomGussNum < 0) {
            //�׳�һ���쳣
            throw new IllegalArgumentException("�����������");
        }
        this.tomGussNum = tomGussNum;
    }


    //���ɵ��Գ�ȭ�ķ���
    public int computerGuss() {
        Random r = new Random();//Random�Ǹ���;
        comGussNum = r.nextInt(3);//bound��ʾ����0-2
        return comGussNum;
    }

    //�ж���Ӯ�����ؽ���ķ���
    public String isWIn() {
        //0-ʯͷ 1-���� 2-��
        if (tomGussNum == 0 && comGussNum == 1) {
            return "��Ӯ��";
        } else if (tomGussNum == 1 && comGussNum == 2) {
            return "��Ӯ��";
        } else if (tomGussNum == 2 && comGussNum == 0) {
            return "��Ӯ��";
        } else if (tomGussNum == comGussNum) {
            return "ƽ��";
        }
        return "������";
    }

    //ÿ�ֽ���������ͳ����ʤ��
    public int wincount(String n) {
        if (n.equals("��Ӯ��")) {
            winnedcount++;
        }
        return winnedcount;
    }
}



