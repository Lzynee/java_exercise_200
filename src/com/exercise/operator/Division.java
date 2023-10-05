/**
 * num의 값보다 크면서도 가장 가까운 10의 배수에서
 * num의 값을 뺀 나머지를 구하는 코드
 * num = 24 -> result = 6
 * */

public class Division {
    public static void main(String[] args) {
        // 변수 설정
        int num = 24;
        int closestBiggerMultipleOfTen = num/10 + 1;  // num의 값보다 크면서도 가장 가까운 10의 배수
        int result = 10*closestBiggerMultipleOfTen - num;  // 결과를 저장할 변수

        // 결과 출력
        System.out.println(result);
    }
}
