package 实验报告.实验一.约瑟夫问题;

import java.util.Scanner;

class ListArray {
    Scanner s = new Scanner(System.in);
    private int capacity;
    private int size;
    private Object[] a;

    ListArray(int capacity) {
        this.capacity = capacity;
        size = 0;
        a = new Object[capacity];
    }

    int getSize() {
        return size;
    }

    void people() {
        System.out.print("请输入人数:");
        size = s.nextInt();
        System.out.print("原始排序为:");
        int b = 1;
        for (int i = 0; i < size; i++) {
            a[i] = b;
            b++;
            System.out.print(a[i] + "  ");
        }
    }

    public void josephus() {
        int t = 0;
        //打印
        System.out.println();
        System.out.print("输入需要出列的数字:");
        int m = s.nextInt();
        if (m > size) {
            System.out.println("输入的数不可超过总人数！");
        } else {
            System.out.print("出列顺序为: ");
            for (int k = size; k >= 1; k--) {
                t = (t + m - 1) % k;
                System.out.print(a[t] + "  ");
                for (int j = t + 1; j <= k - 1; j++) {
                    a[j - 1] = a[j];
                }
            }
        }
    }
}

class yuesefu {
    public static void main(String[] args) {
        ListArray l = new ListArray(100);
        l.people();
        l.josephus();
    }
}