/**
 * 코드의 문제점을 수정하기
 * */

public class FixErrors {
    public static void main(String[] args) {
/*        // 수정 전
        byte a = 10;
        byte b = 20;
        byte c = a + b;
        char ch = 'A';
        ch = ch + 2;
        float f = 3 / 2;
        long l = 3000 * 3000 * 3000;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = d==f2;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);*/

        // 수정 후
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        char ch = 'A';
        ch = (char)(ch + 2);
        float f = (float)3 / 2;
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;
        double d = (float)0.1;
        boolean result = d==f2;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}
