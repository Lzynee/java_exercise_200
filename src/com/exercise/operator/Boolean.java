/**
 * 문자형 변수 ch가 영문자이거나 숫자일 때만
 * 변수 b 값이 true
 * */

public class Boolean {
    public static void main(String[] args) {
        // 변수 설정
        char ch = 'z';

        boolean b = ('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z') || ('0'<=ch && ch<='9');

        // 결과 출력
        System.out.println(b);
    }
}
