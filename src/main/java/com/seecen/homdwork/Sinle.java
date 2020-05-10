package com.seecen.homdwork;

public enum Sinle {

    /*jdk.1.5以上才有*/
    singleton;

    int  num=0;

    void say(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        int arr[]={1,5,6,0,2};

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                int tem=0;
                if (arr[i]>arr[i1]){
                    tem=arr[i];
                    arr[i]=arr[i1];
                    arr[i1]=tem;

                }
            }
            System.out.println(arr[i]);
        }




    }






}
