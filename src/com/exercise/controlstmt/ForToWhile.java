/**
 * 주어진 for문을 while문으로 변경하기
*/
public class ForToWhile {
    public static void main(String[] args) {
//        // 기존 for문
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        // for문을 while문으로 고치기
        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
             }
            System.out.println();
            i++;
        }
    }  // end of main
}
