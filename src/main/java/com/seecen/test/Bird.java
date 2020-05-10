package com.seecen.test;

import com.seecen.model.Course;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Bird{



    public static void main(String[] args) {
       int arr[]={12,23,34,6,45};

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length-1-i; k++) {
                if (arr[k] > arr[k+1]) {        // 相邻元素两两对比
                    int temp = arr[k];        // 元素交换
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(feibonaqi(7));
//1 1 2 3 5 8 13
    }

    public static int feibonaqi(int a){
        if (a<1){
            return 1;
        }
        if (a==1 || a==2){
            return 1;
        }

        return feibonaqi(a-1) + feibonaqi(a-2);
    }

}
