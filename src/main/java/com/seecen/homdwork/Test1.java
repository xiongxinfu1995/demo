package com.seecen.homdwork;

import com.seecen.model.Teacher;

public class Test1 {


    /* static  int sum5=0;
     static int sum6=0;
 */
    static int sum11 = -1;

    public static void main(String[] args) {
        String s = "Example";
int u=s.length();
s=s+10;
        System.out.println(u);
        System.out.println(s);
        int x=4;
        System.out.println("value is"+ ((x>4) ? 99.9 :9));

        try {
            System.out.println("-----------" + "递归求1到n的和" + "--------------");
            int sum = Test1.duigui(100);
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------" + "递归斐波那契数列" + "--------------");

        int num = 7;

        long num1 = fibonacci(num);
        System.out.println(num1 + "");

        System.out.println("------------" + "递归求阶乘" + "--------------");

        System.out.println(jiecheng(5));


//每个后面的数值= 前面1 + 前面2的和.

//传入  7   返回 13
        int i = 12;
        System.out.println(i += i -= i *= i);

        Test1 test1 = new Test1();
        System.out.println("和是：" + test1.add(9, 34));
        test1.method();

        System.out.println(new Integer(1).equals(new Long(1)));

        test1.test5(100);

        System.out.println("-------"+getValue(2)+"-------");
    }

    //1. 使用递归算法完成   1 + 2.... + 100  = ?
    public static int duigui(int num) {
        if (num == 0) {
            return num;
        } else
            return num + duigui(num - 1);
    }

    //2. 使用递归算法完成   斐波那契数,指的是这样一个数列:1、1、2、3、5、8、13、21
    public static long fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //3.使用递归求1到n的阶乘1*2*3*4*5*6
    public static int jiecheng(int a) {

        if (a == 1) {
            return 1;
        }
        return a * jiecheng(a - 1);
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch语句块");
        } finally {
            System.out.println("finally语句块");
        }
        return 0;
    }

    public void method()

    {

        for (int i = 0; i < 3; i++)

        {

            System.out.print(i);

        }
    }

    public void test5(int num) {
        // 编程实现输出1+2-3+4……-99+100的结果。
        int sum2 = 1;
        for (int i = 2; i <= 100; i++) {


            if (i / 2 == 0) {
                sum2 = sum2 + i;
            }
                sum2 = sum2 - i;


        }
        System.out.println("sum2---" + sum2);


    }
    public static int getValue(int i){
        int result =0 ;
        switch(i){
            case 1:
                result = result +i;
            case 2:
                result = result+i*2;
            case 3:
                result = result+i*3;
        }
        return result;
    }

}
