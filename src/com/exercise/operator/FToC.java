/**
* 화씨를 섭씨로 변환하는 코드
 * 변환 공식: C = 5/9 * (F - 32)
 * 조건 1: 변환 결과값은 소수점 셋째 자리에서 반올림 할 것
 * 조건 2: Math.round()를 사용하지 않고 처리할 것
 * */

public class FToC {
    public static void main(String[] args) {
        // 변수 설정
        int fahrenheit = 100;
        float celcius = (float)5/9 * (fahrenheit - 32);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.printf("Celcius:%.2f", celcius);
    }
}
