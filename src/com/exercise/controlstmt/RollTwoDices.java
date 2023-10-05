/**
 * 두 개의 주사위를 던졌을 때,
 * 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
 */

public class RollTwoDices {
    public static void main(String[] args) {
        System.out.println("두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수: ");
        for (int diceA = 1; diceA <= 6; diceA++) {  // diceA의 눈 수
            for (int diceB = 1; diceB <= 6; diceB++) {  // diceB의 눈 수
                if (diceA + diceB == 6) {  // diceA와 diceB의 눈의 합이 6이면 출력하기
                    System.out.printf("(%d, %d)%n", diceA, diceB);
                }
            }  // end of diceB
        }  // end of diceA
    }  // end of main
}  // end of class
