/**
 * 변수 num의 값 중에서 백의 자리 이하를 버리는 코드
 * */

public class DropUnderHundred {
    public static void main(String[] args) {
        // 변수 설정
        int num = 400;
        int underHundred = num % 100;  // num의 백의 자리 이하

        // 결과 출력
        System.out.println(num - underHundred);
    }
}
