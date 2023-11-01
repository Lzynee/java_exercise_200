/**
 * 물건을 구입하는 사람을 정의한 클래스
 * 멤버변수: money와 cart
 * buy 메서드: 제품을 구입하는 기능
 * add 메서드: 장바구니에 구입한 물건을 추가하는 기능
 * summary 메서드: 구입한 물건의 목록과 사용금액, 남은 금액을 출력하는 기능
 * */

package com.exercise.oop2;

import java.util.Arrays;

class MyCart {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product배열 cart에 사용될 index

    void buy(Product p) {
        if (money < p.price) return;  // 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
        else {
            money -= p.price;
            p.add();
        }
    }  // buy()

    void add(Product p) {
        if(i >= cart.length) {
            Product[] newCart = Arrays.copyOf(cart, (cart.length)*2);
            cart = newCart;
            cart[i] = p;
            i++;
        }
    }

    void summary(Product p) {

    }
}  // class Buyer

class Product {
    int price;  // 제품의 가격

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv(int price) {
        super(100);
    }

    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer(int price) {
        super(200);
    }

    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio(int price) {
        super(50);
    }

    public String toString() {return "Audio";}
}


