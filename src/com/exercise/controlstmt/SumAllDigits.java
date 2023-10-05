/**
 * int타입의 변수 num이 있을 때,
 * 각 자리의 합을 더한 결과를 출력하는 코드를 완성하기
 * 조건: 문자열로 변환하지 말고 숫자로만 처리할 것
 */
public class SumAllDigits {
    public static void main(String[] args) {
        // 변수 설정
        int num = 12345;
        int sum = 0;

        while(num > 0) {
            int lastDigit = num % 10;  // num의 일의 자리를 저장하는 변수

            sum += lastDigit;  // 일의 자리 수를 저장
            num /= 10;  // num에는 십의 자리까지의 수를 새로 저장
        }

        System.out.println("sum="+sum);
    }
}
