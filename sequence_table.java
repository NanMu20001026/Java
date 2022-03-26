package 实验报告.实验一.约瑟夫问题;

import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2022/3/25-03-25-23:14
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
//顺序表实现约瑟夫数
public class sequence_table {
    private int initcapacity = 10;//初始容量
    private int size;//顺序表元素的长度
    private Object[] data;//存储数据
    Scanner zs = new Scanner(System.in);

    //重载构造器
    public sequence_table() {
        data = new Object[initcapacity];
        this.size = 0;
    }

    //扩容
    public void expansion(int new_capacity) {
        Object[] date1 = new Object[new_capacity];//定义新的顺序表存储数据
        //拷贝数据到原顺序表中
        for (int i = 0; i < size; i++) {
            date1[i] = data[i];
        }
        //重新定义容量
        initcapacity = new_capacity;
        //把新顺序表赋给原顺序表
        data = date1;
    }

    //添加元素
    public void add() {
        //打印
        System.out.print("输入总人数：");
        int n = zs.nextInt();
        //打印
        System.out.print("原来排序的序号：");
        for (int i = 0; i < n; i++) {
            if (size == initcapacity) {
                expansion(size * 2);
            }
            data[size++] = i + 1;
            System.out.print(data[i] + " ");
        }
        //打印
        System.out.println();
    }

    //判断约瑟夫数
    public void josephus() {
        int t = 0, m = 0;//t 为数组下标，m是需要出列的数字，比如数到3出列，
        //输入需要出列的数字
        //打印
        System.out.print("输入要求出列的序号：");
        m = zs.nextInt();
        if (m > size) {
            throw new IllegalArgumentException("要求出列的序号不在总人数内！");//提示错误！
        } else {
            System.out.print("出列顺序为: ");
            for (int k = size; k >= 1; k--) {
                t = (t + m - 1) % k; //通过数组下标查找出列的元素
                //打印
                System.out.print(data[t] + " ");//输出出队的元素
                for (int j = t + 1; j <= k - 1; j++)//顺序表删除操作
                    data[j - 1] = data[j];
            }
        }
    }
}
//测试类
class Test {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        sequence_table l = new sequence_table();
        l.add();
        l.josephus();
    }
}
