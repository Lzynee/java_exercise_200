/**
 *  주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다.
 *  모두 숫자로만 이루어져 있으면 true를 반환하고,
 *  그렇지 않으면 false를 반환한다.
 * */


package com.exercise.oop1;

public class TypeCheck {
    // 메소드 선언
    public static boolean isNumber(String str) {
        boolean result;

        if (str == null || str.isEmpty()) result = false;  // 주어진 문자열이 null이거나 빈문자열이면 false를 반환

        for (int i = 0; i < str.length(); i++) {  // 주어진 문자열에 숫자가 아닌 문자가 있으면 false를 반환
            char ch = str.charAt(i);

            if(ch < '0' || ch > '9') return false;
        }

        return true;
    }

    // 메소드 실행
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
