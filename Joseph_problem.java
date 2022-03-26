package 实验报告.实验一.约瑟夫问题;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2022/3/21-03-21-16:13
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
public class Joseph_problem {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        //打印
        System.out.print("输入总人数：");
        int m = zs.nextInt();//
        //打印
        System.out.print("输入剔除的序号：");
        int n = zs.nextInt();
        josephus(m, n);
    }

    //判断是否为约瑟夫数
    public static void josephus(int m, int n) {
        //创建list集合存放人数的序号
        LinkedList list = new LinkedList();
        //创建list1集合存放约瑟夫数
        LinkedList list1 = new LinkedList();
        //把序号添加到list集合中
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int count = 1;//报数，1开始报数
        //循环list集合是否还有元素
        while (list.size() >= 1) {
            if (count == n) {   //判断count==n时，做出记录操作
                count = 1;    //等于时就重新赋值为1
                list1.add(list.removeFirst()); //移除并返回此列表中的第一个元素，并且添加带辛几何中
//                continue;
            } else {
                list.add(list.removeFirst());///把不是约瑟夫数的序号往后添加
                count++;//报数加1
            }
        }
        //打印，约瑟夫数
        System.out.print("输出的约瑟夫数是：" + list1);
    }
}