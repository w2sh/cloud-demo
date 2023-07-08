package cn.itcast.test;

/**
 * author:w2sh
 * time:2023/6/23
 */
public class Solution {
    static long[] arr = new long[21];
    int a = 0;
    public static void main(String[] args) {
        double result = 0;
        fib();
//        for (int i = 0; i < 20; i++) {
//            result = result + arr[i + 1] * 1.0 / arr[i];
//        }
//        System.out.println(result);
        System.out.println(arr[20]);
    }

    public static void fib() {
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < 21; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}