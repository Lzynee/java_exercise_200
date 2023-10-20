/**
 * 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 하고,
 * 처리한 배열을 반환하는 shuffle() 메소드를 작성 및 실행한다.
 * */

package com.exercise.oop1;

public class ShuffleArrayElements {
    // 메소드 선언
    // 배열에 담긴 값의 위치를 뒤섞는 메소드
    public static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random()*arr.length);

            // arr[i]와 arr[j]의 값을 서로 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        return arr;
    }  // shuffle()


    // 메소드 실행
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // 기존 배열
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);  // shuffle() 메소드를 실행한 결과
        System.out.println(java.util.Arrays.toString(result));
    }
}
