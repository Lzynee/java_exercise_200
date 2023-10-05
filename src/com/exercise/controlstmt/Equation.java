/**
 * 방정식 2x + 4y = 10의 모든 해를 구하기
 * 조건: x와 y는 정수, 0 <= x <= 10, 0 <= y <= 10
 * */

public class Equation {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (2*x + 4*y == 10) {
                    System.out.printf("x=%d, y=%d%n", x, y);
                }
            }
        }
    }
}
