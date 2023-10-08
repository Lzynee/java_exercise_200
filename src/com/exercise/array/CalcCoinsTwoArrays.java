/**
 * 가능한 한 적은 수의 동전을 사용하여
 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 프로그램
 * CalcCoins와 동일한 프로그램이지만,
 * 필요한 동전의 개수를 저장하는 배열을 새로 생성하여
 * 총 두 개의 배열을 사용
 * */

package com.exercise.array;

public class CalcCoinsTwoArrays {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};  // 동전의 종류

        int money = 2680;  // 거스름돈
        System.out.println("money = " + money);

        // 필요한 동전의 종류와 개수를 계산한다.
        // 500원: (money / 500)개, 100원: ((money%500) / 100)개,
        // 50원: ((money%100) / 50)개, 10원: ((money%50) / 10)개 필요
        int[] coinNeeded = new int[4];  // 새로운 배열에 [500원, 100원, 50원, 10원]의 순서로 필요한 동전의 개수를 저장
        coinNeeded[0] = money / 500;  // 500원 동전의 개수
        System.out.println("500원: " + coinNeeded[0]);

        for (int i = 1; i < coinUnit.length; i++) {  // 100원 이하 동전의 개수
            coinNeeded[i] = (money % coinUnit[i-1]) / coinUnit[i];
            System.out.printf("%d원: %d%n", coinUnit[i], coinNeeded[i]);
        }
    }  // main
}  // class
