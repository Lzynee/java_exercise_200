/**
 * 피보나치수열의 10번째 수를 계산하는 프로그램
 * */

public class TenthFibonnaci {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;  // 세 번째 값
        System.out.print(num1+", "+num2);

        for (int i = 0; i < 8; i++) {
            num3 = num1 + num2;  // num3에 num1과 num2의 값을 저장
            System.out.print(", "+num3);

            num1 = num2;  // num1에 num2의 값을 새로 저장
            num2 = num3;  // num2에 num3의 값을 새로 저장
        }
    }  // end of main
}  // end of class
