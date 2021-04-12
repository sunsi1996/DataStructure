package com.zgx;

import java.util.Arrays;

/**
 * @author sunsi
 * @version 1.0
 * @date 2021/4/7 8:44
 */
public class chaper02 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,10,8};
//        int[] arr = {2,5,1,3,8,5,7,4,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static  void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {   // 这里说明为什么需要-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
