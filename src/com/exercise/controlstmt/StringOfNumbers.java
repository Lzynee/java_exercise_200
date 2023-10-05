/**
 * 숫자로 이루어진 문자열 str이 있을 때,
 * 각 자리의 합을 더한 결과를 출력하는 코드
 * 예시: str = "12345" --> 15를 출력
 * */

public class StringOfNumbers {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += num;
        }  // end of for i
        System.out.println("sum="+sum);
    }  // end of main
}  // end of class
