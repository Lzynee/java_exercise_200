package com.exercise.oop2.robotact;

import java.awt.*;

public class RobotArr {
    public static void action(Robot r) {
        /* 주어진 객체의 메서드를 호출하는 메서드 */
        if (r instanceof DanceRobot) {
            ((DanceRobot) r).dance();
        } else {
            if (r instanceof SingRobot) {
                ((SingRobot) r).sing();
            } else {
                ((DrawRobot) r).draw();
            }
        }

    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }  // main
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
