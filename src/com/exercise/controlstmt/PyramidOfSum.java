/**
 * 1 + (1+2) + (1+2+3) + ... + (1 + 2 + 3 + ... + 10)의 결과 구하기
*/
public class PyramidOfSum {
    public static void main(String[] args) {
        int i = 1, j = 1, sumToI = 0, sumToEnd = 0;

        for (; i <= 10; i++) {
            for (; j <= i; j++) {
                sumToI += j;  // sumToI = 1, (1+2), (1+2+3), ... (1+2+3+ ... +10)
            }  // end of for j
            sumToEnd += sumToI;  // sumToEnd = 1+(1+2)+(1+2+3)+ ... + (1+2+3+ ... + 10)
        }  // end of for i
        System.out.println(sumToEnd);
    }  // end of main
}
