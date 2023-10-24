/**
 * 주어진 int형 배열의 값 중에서 제일 큰 값을 반환하는 프로그램
 * 만약 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
 * */
package com.exercise.oop1;

public class MaximumIntElement {
    // 메소드 선언
    public static int max(int[] arr) {
        // 예외 처리
        if (arr.length == 0 || arr == null) { // 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
            return -999999;
        }

        // 주어진 배열에서 최댓값을 찾아 반환한다.
        int maximum = arr[0];  // 배열의 첫 번째 원소를 최댓값으로 초기화

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) maximum = arr[i];  // 더 큰 값을 찾으면 최댓값을 갱신
        }

        return maximum;  // 최댓값 반환
    }  // max()

    // 메소드 실행
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};

        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));  // 최대값: 9
        System.out.println("최대값:"+max(null));  // 최대값: -999999 출력
        System.out.println("최대값:"+max(new int[]{}));  // 크기가 0인 배열. '최대값: -999999' 출력
    }
}
