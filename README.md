# *SUMMARY*

자바 및 프로그램 작성에 대한 이해를 높이기 위해, <a href="https://github.com/Lzynee/java_workout.git">java_workout</a> 레포지토리에 작성하는 파일들과는 별도로 자바 프로그래밍을 연습한 내용이다.<br><br>

# *DESCRIPTION*

  본 프로젝트를 생성한 목적은 한정된 소스에 의존하지 않고, 다양한 플랫폼 또는 저자가 제시하는 문제를 해결함으로써 자바 및 자바 프로그램 작성에 대한 이해와 문제 해결 능력을 높이는 것이다.<br>

  문제 해결 능력 향상이 주 목적이므로, 문제 풀이 과정에서 모르는 개념이나 오개념으로 인해 풀이 자체를 방해 받거나 모범 답안을 참고하게 되는 일을 방지하기 위해 풀이 전 되도록 공개 동영상 강의를 찾아 들으며, 이전에 충분히 습득하지 못하고 있었던 관련 개념이나 해당 주제에서 중점이 되는 요소를 중심으로 자습 노트를 작성하였다.<br><br>

### 자습 노트 예시
![image](https://github.com/Lzynee/java_exercise_200/assets/145524819/bc732403-6ccc-4e96-a2b4-624a421b14d8)
![image](https://github.com/Lzynee/java_exercise_200/assets/145524819/92137260-4a78-4e3d-960f-914bd0b6777c)

<br><br><br>
  문제 풀이 단계에서는 개념을 정확히 학습했는지 점검하고, 추후에 코드를 읽을 때에 어떤 논리에 따라 풀이하였는지 확인할 수 있게끔 되도록 자세히 주석을 달았다.
<br><br>

### 작성 코드 예시

```java
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
```
<br><br>
# *REFERENCE*

- 문제 파일: https://github.com/castello/javajungsuk3.git
- 동영상 강의:
    - <a href="https://www.youtube.com/playlist?list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp" style="text-decoration:none">자바의 정석</a>
    - <a href="https://www.youtube.com/playlist?list=PLVsNizTWUw7HZTPU3GpS7nmshXjKKvlbk" style="text-decoration:none">혼자 공부하는 자바</a>
