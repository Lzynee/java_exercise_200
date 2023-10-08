/**
 * 커맨드라인으로부터 입력 받은 거스름돈을
 * 지불하는 데 필요한 동전의 개수를 계산하고,
 * 현재 가진 동전으로 지불한 후 남은 동전의 개수를 출력하는 프로그램
 * 거스름돈이 소지금보다 크면 "거스름돈이 부족합니다." 메시지를 출력한다.
 * */

package com.exercise.array;

public class CalcRemainingCoins {
    public static void main(String[] args) {
        // 입력 안내 메시지 출력
        if(args.length!=1) {
            System.out.println("USAGE: java CalcRemainingCoins 3120");
            System.exit(0);
        }

        // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);

        // 보유한 동전의 단위와 개수
        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        // 거스름돈을 지불하는 데 필요한 동전의 개수를 계산한다.
        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;  // 필요한 동전의 개수

            // 필요한 동전의 단위별 개수를 구한다.
            coinNum = money / coinUnit[i];
            if (coinNum > coin[i]) coinNum = coin[i];  // 필요한 개수가 가진 수보다 많으면 있는 만큼만 사용한다.

            coin[i] -= coinNum;  // 지불하고 남은 동전의 개수
            money -= coinUnit[i] * coinNum;  // 더 지불해야 하는 거스름돈의 금액

            System.out.println(coinUnit[i]+"원: "+coinNum);
        }  // for

        if(money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // 프로그램을 종료한다.
        }
        System.out.println("=남은 동전의 개수 =");
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원:"+coin[i]);
        }
    }  // main
}  // class
