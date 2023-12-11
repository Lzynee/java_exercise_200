/**
 * Sutda.java 파일에 새로운 메서드를 추가한다.
 * shuffle() : 배열 cards에 담긴 카드의 위치를 뒤섞는다.
 * pick() : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 * pick() : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
 * */

package com.exercise.oop2.sutda2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        /* 배열 SutdaCard를 초기화하는 코드 */
        for (int i = 0; i < cards.length; i++) {

            int num = i%10 + 1;
            boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);

            cards[i] = new SutdaCard(num, isKwang);
        }

    }

    /* SutdaDeck 클래스 내의 메소드 */
    public void shuffle() {  // 배열 cards에 담긴 카드의 위치를 뒤섞는다.
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);

            // cards[i]와 cards[j]의 값을 서로 바꾼다.
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    public SutdaCard pick(int index) {  // 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.

        if (index < 0 || index >= CARD_NUM) return null;  // index의 유효성 검사
        return cards[index];
    }

    public SutdaCard pick() {  // 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.

        int i = (int) (Math.random() * cards.length);
        return pick(i);  // pick(int index)를 호출한다.
    }

}  // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Sutda2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
