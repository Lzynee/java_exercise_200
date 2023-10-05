/**
 * num의 값 중에서 일의 자리를 1로 바꾸는 코드
 * num = 333 -> result = 331
 * num = 777 -> result = 771
 * */

public class EndByOne {
    public static void main(String[] args) {
        // 변수 설정
        int num = 333;
        int digitOne = num % 10;  // num의 일의 자리

        int convertLastOne = num - digitOne + 1;  // num의 일의 자리를 1로 바꾸기

        // 결과 출력
        System.out.println(convertLastOne);
    }
}
