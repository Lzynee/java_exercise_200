/**
 * 인스턴스 메소드를 사용해
 * 두 점 (x, y)와 (x1, y1) 간의 거리를 구한다.
 * */

package com.exercise.oop1;

class MyPoint {
//    필드 선언
    int x;
    int y;

//    생성자 선언
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    메소드 선언
    public double getDistance(int x1, int y1) {
        return Math.sqrt((x1 - x)*(x1 - x) + (y1 - y)*(y1 - y));
    }

//    코드 실행
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

//      p와 (2, 2)의 거리를 구한다.
        System.out.println(p.getDistance(2, 2));
    }
}
