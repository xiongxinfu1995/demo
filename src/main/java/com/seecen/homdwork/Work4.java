package com.seecen.homdwork;

public class Work4 {

    /*默写选择排序，二分查找法
     * 默写抽象工厂方法
     * */
    public static void main(String[] args) {
        /*选择排序开始*/
       /* int[] arr = new int[]{5, 3, 6, 2, 10, 2, 1};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        /*选择排序结束*/
        /*二分查找开始*/
        System.out.println("-------------------");
        int arr1[] = {12, 34, 56, 76, 87, 89, 90};
        int key = 89;
        System.out.println(arr1);

        System.out.println("-------------------");
        System.out.println("------------" + bsearchWithoutRecursion(arr1, key));
        /*二分查找结束*/
    }

    /*public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                    // 交换当前索引 i 和最小值索引 minIndex 两处的值
                    if (i != minIndex) {
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;
                    }
                    // 执行完一次循环，当前索引 i 处的值为最小值，
                    // 直到循环结束即可完成排序
                }
            }
        }
    }*/
    //选择排序  外层循环 n-1
    //内层循环 n-i
    //内层循环打擂台
    //外层循环换位置，初始化
    public static void selectSort(int[] arr) {
        int max = 0;//定义一个最大值
        int index = 0;//要交换位置的索引
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            //把最大值的位置移到最后去
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[index] = temp;

            max = 0;//初始化最大值，和要交换索引的位置
            index = 0;
        }
    }

    public static int bsearchWithoutRecursion(int a[], int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (high + low) >> 1;//中间位置+结束位置除以2
            if (key > a[mid]) {

                low = mid + 1;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

