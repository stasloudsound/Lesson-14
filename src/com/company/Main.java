package com.company;

import java.util.Arrays;

public class Main {

    static int[] arr = new int[]{0, 1, 0, 3, 5, 6, 0, 12, 0, 1};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapZiroRight(arr)));
    }


    private static int[] swapZiroRight(int[] a) {
        int[] newArr = new int[a.length];
        int count = 0;
        for (int num : a) {
            if (num != 0) {
                newArr[count] = num;
                count++;
            }
        }
        return newArr;
    }
}
