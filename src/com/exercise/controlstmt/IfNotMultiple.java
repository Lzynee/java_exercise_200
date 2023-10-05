/**
 * 1부터 20까지의 정수 중에서
 * 2 또는 3의 배수가 아닌 수의 총합
*/
public class IfNotMultiple {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 20; i++) {  // 1 <= i <= 20
            if (i%2 != 0 || i%3 != 0) {  // i가 2의 배수나 3의 배수가 아닌 경우 합을 구하기
                sum += i;
            }
        }  // end of for i

      System.out.println("총합: " +sum);
    }  // end of main


}
