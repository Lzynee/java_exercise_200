package com.exercise.oop1;

public class Student {
    // 필드 선언
    String name;  // 학생 이름
    int ban;  // 반
    int no;  // 번호
    int kor;  // 국어 점수
    int eng;  // 영어 점수
    int math;  // 수학 점수

    // 생성자 선언


    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 메소드 선언
    // 국어, 영어, 수학의 점수를 모두 더해서 반환한다.
    int getTotal(){
        return kor + eng + math;
    }
    // 총점(국어, 영어, 수학 점수의 총합)을 과목수로 나눈 평균을 구한다.
    float getAverage(){
        return (int)(getTotal() / 3f*10 + 0.5f) / 10f;
    }
    // 학생의 정보를 출력한다.
    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}
