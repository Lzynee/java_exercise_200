/**
 * 가능한 한 적은 수의 동전을 사용하여
 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 프로그램
 * */

package com.exercise.array;

public class CalcCoins {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};  // 동전의 종류

        int money = 2680;  // 거스름돈
        System.out.println("money = " + money);

        // 필요한 동전의 종류와 개수를 계산한다.
        int[] coinNeeded = new int[4];  // 필요한 동전의 개수를 저장할 배열
        coinNeeded[0] = money / coinUnit[0];  // 500원 동전의 개수
        System.out.println("500원: " + coinNeeded[0]);
        //100원, 50원, 10원 동전의 개수
        for (int i = 1; i < coinUnit.length; i++) {
            coinNeeded[i] = (money % coinUnit[i-1]) / coinUnit[i];
            System.out.printf("%d원: %d%n", coinUnit[i], coinNeeded[i]);
        }
    }  // main
}  // class
