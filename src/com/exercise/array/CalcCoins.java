/**
 * 가능한 한 적은 수의 동전을 사용하여
 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 프로그램
 * */

package com.exercise.array;

import java.awt.print.Printable;

public class CalcCoins {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};  // 동전의 종류

        int money = 2680;  // 거스름돈
        System.out.println("money = " + money);

        // 필요한 동전의 종류와 개수를 계산한다.
        // 500원: (money / 500)개, 100원: ((money%500) / 100)개,
        // 50원: ((money%100) / 50)개, 10원: ((money%50) / 10)개 필요
        for (int i = 0; i < coinUnit.length; i++) {
            if (i == 0) {  // 필요한 500원 동전의 개수
                System.out.println("500원: " + (money / coinUnit[0]) );
            } else {  // 필요한 100원, 50원, 10원 동전의 개수를 차례로 출력
                System.out.printf("%d원: %d%n", coinUnit[i], (money % coinUnit[i-1])/coinUnit[i]);
            }
        }
    }  // main
}  // class
