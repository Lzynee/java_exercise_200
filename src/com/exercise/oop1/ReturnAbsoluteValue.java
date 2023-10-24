/**
 * 주어진 값의 절대값을 반환하는 프로그램
 * */

package com.exercise.oop1;

public class ReturnAbsoluteValue {
    /* abs 메소드 작성*/
    // 주어진 값이 양수인지 음수인지를 판단하여,
    // 음수일 경우 -1을 곱한 값을,
    // 양수 또는 0일 경우 본래의 값을 그대로 반환한다.
    private static int abs(int value) {
        if (value < 0) return -1 * value;
        else return value;
    }

    // 메소드를 호출하여 주어진 값의 절대값을 출력한다.
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));

        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}
