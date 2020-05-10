package com.seecen.homdwork;

public class Work {


    // 1. 默写单例模式.  恶汉式,懒汉式,枚举式. 三种

    /*饿汉式*/
   /* private Work() {
    }

    private static Work work = new Work();

    public static Work getWork() {

        return work;
    }*/
    /*懒汉式*/
    private Work() {

    }

    private volatile static Work work = null;

    public static Work getWork() {

        if (work == null) {
            synchronized (Work.class) {
                if (work == null) {
                    work = new Work();
                }
            }


        }
        return work;
    }


    //2. 默写冒泡排序.
   /* public static void main(String[] args) {
        int arr[] = {4, 19, 10, 67, 54};
        for (int i = 0; i < arr.length; i++) {
            int tem = 0;
            // 内层for循环控制相邻的两个元素进行比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
            System.out.println(arr[i]);
        }

        String s1 = new String("xyz");

        String s2 = new String("xyz");

        String s3 = "xyz";

        Boolean b1 = s1.equals(s2);
        Boolean b2 = (s1 == s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.print(b1 + "-----" + b2);
    }*/


    public static void main(String[] args) {
        Sinle.singleton.say();

    }

}
