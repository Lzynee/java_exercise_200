/**
 * 대문자를 소문자로 변경하는 코드
 * 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경
 * 소문자 = 대문자 + 32
 * */

public class CapitalToSmall {
    public static void main(String[] args) {
        // 변수 설정
        char ch = 'A';
        char lowerCase = (65<='A' && 'A'<=90) ? (char)(ch+32) : ch;

        // 결과 출력
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
