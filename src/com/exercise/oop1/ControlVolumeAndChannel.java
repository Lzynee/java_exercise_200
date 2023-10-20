/**
 * 조건에 따라 볼륨을 조절하고 채널을 변경하는 메소드를 선언하고, 실행한다.
 * */

package com.exercise.oop1;

class MyTv {
    // 필드 선언
    // 변수 선언
    boolean isPowerOn;
    int channel;
    int volume;

    // 상수 선언
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // 메소드 선언
    void turnOnOff() {
        // isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        if (isPowerOn == true) isPowerOn = false;
        else isPowerOn = true;
    }

    void volumeUp() {
        // volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        while(volume < MAX_VOLUME) volume++;
    }

    void volumeDown() {
        // volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        while(volume > MIN_VOLUME) volume--;
    }

    void channelUp() {
        // channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.

        if(channel == MAX_CHANNEL) channel = MIN_CHANNEL;
        else channel++;
    }

    void channelDown() {
        // channel의 값을 1 감소시킨다.
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.

        if(channel == MIN_CHANNEL) channel = MAX_CHANNEL;
        else channel--;
    }
}  // class MyTv

// 메소드 실행
public class ControlVolumeAndChannel {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        // 조절하기 전 채널과 볼륨의 설정값
        t.channel = 100;
        t.volume = 0;
        System.out.printf("CH: %d, VOL: %d%n", t.channel, t.volume);

        // 채널은 최대값, 볼륨은 최소값인 상태에서 채널과 볼륨을 1씩 내린 결과를 확인
        t.channelDown();
        t.volumeDown();
        System.out.printf("CH: %d, VOL: %d%n", t.channel, t.volume);

        // 볼륨이 최대, 채널이 최소값인 상태에서 채널과 볼륨을 1씩 올린 결과 확인
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.printf("CH: %d, VOL: %d%n", t.channel, t.volume);
    }
}
