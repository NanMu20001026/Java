package 实验报告.实验一.约瑟夫问题;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2022/3/25-03-25-21:46
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
public class Josephproblem {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        //打印
        System.out.print("输入总人数：");
        int m = zs.nextInt();
        //打印
        System.out.print("输入剔除的序号：");
        int n = zs.nextInt();
        josephus(m, n);
    }

    public static void josephus(int n, int m) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 1;
        while (arrayList.size() >= 1) {
            if (count == m) {
                count = 1;
                arr.add(arrayList.remove(0));
            } else {
                arrayList.add(arrayList.remove(0));
                count++;
            }
        }
        //打印
        System.out.print("输出的约瑟夫数是：" + arr.toString());
    }
}