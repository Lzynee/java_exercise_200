/**
 * 숫자 1, 2, 3, 4를 중복하여 담은 배열을 읽고,
 * 각 숫자가 중복된 횟수만큼 '*'을 찍어서 그래프를 그리는 프로그램
 * */

package com.exercise.array;

import java.util.Arrays;

public class AsteriskGraph {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};  // 데이터를 읽어 올 배열
        int[] counter = new int[4];  // 각 숫자의 개수를 세어서 저장하는 배열

        // answer에 담긴 각 숫자의 개수를 세고, counter에 담는다.
        // counter[0]에 1의 개수, counter[1]에 2의 개수, ... 를 딤는다.
        for (int k = 0; k < counter.length; k++) {
            int count = 0;  // 각 숫자의 개수를 저장할 변수

            for (int i = 0; i < answer.length; i++) {  // answer에 담긴 각 숫자를 카운트
                if (answer[i] == k+1)
                    count += 1;
            }

            counter[k] = count;
        }

        // counter의 데이터를 그래프로 그린다.
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);  // counter[i]에 저장된 값을 출력

            for (int k = 0; k < counter[i]; k++) {  // counter[i]에 저장된 수만큼 별을 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }  // main
}  // class
