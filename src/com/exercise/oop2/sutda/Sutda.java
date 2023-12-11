/**
 * 섯다카드 20장을 담는 SutdaCard 배열을 초기화한다.
 * 조건:
 * 1. 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있다.
 * 2. 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
 * */

package com.exercise.oop2.sutda;

class SutdaDeck {
    final int CARD_NUM = 20;
    com.exercise.oop2.sutda.SutdaCard[] cards = new com.exercise.oop2.sutda.SutdaCard[CARD_NUM];

    SutdaDeck() {
        /* 배열 SutdaCard를 초기화하는 코드 */
        for (int i = 0; i < cards.length; i++) {

            int num = i%10 + 1;
            boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);

            cards[i] = new com.exercise.oop2.sutda.SutdaCard(num, isKwang);
        }

    }
}

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

class Sutda {
    public static void main(String[] args) {
        com.exercise.oop2.sutda.SutdaDeck deck = new com.exercise.oop2.sutda.SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}
