/**
 * 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해 나갔을 때
 * 몇 까지 더해야 총합 100 이상이 되는지 구하기
*/
public class HowMuchStepsToHundred {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (true) {
            if (i % 2 != 0) {  // 홀수이면 더하기
                sum += i;
            } else {  // 짝수이면 빼기
                sum -= i;
            }

            if (sum >= 100) {
                break;  // 총합이 100 이상이 되면 반복문 종료
            } else {
                i++;  // 총합이 100 미만이면 i를 1 증가시키고 반복
            }
        }  // end of while
        System.out.printf("총합 100 이상이 되려면 %d까지 더해야 함.%n", i);
    }  // end of main
}
