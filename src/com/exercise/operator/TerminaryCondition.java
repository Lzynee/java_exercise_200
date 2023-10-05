/**
 * 변수 num의 값에 따라 '양수', '음수', '0'을 출력
 * 조건: 삼항 연산자를 두 번 사용할 것
 * */

public class TerminaryCondition {
    public static void main(String[] args) {
        // 변수 설정
        int num = 10;
        String result = "";  // 출력할 결과

        result = num > 0 ? "양수" : (num == 0 ? "0" : "음수");  // num이 0보다 크면 "양수", 0이면 "0", 0보다 작으면 "음수"

        // 결과 출력
        System.out.println(result);
    }
}
