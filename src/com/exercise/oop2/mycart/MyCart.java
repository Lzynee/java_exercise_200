package com.exercise.oop2.mycart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyCart {
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
    int i  = 0;  // Product 배열 cart에 사용될 index

    void buy(Product p) {  // 지정된 물건을 구입한다.

        if (money < p.price) {
            System.out.printf("잔액이 부족하여 %s을/를 살 수 없습니다. %n", p);
            return;  // 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.

        } else {

            money -= p.price;  // 가진 돈이 충분하면, 가진 돈에서 물건의 가격을 뺀다.
            add(p);  // 장바구니에 구입한 물건을 담는다. (add메서드 호출)
        }

    }  // buy(Product p)

    void add(Product p) {  // 지정된 물건을 장바구니에 담는다.

        if (i >= cart.length) {  // i의 값이 장바구니의 크기보다 같거나 크면
            // 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
            Product[] tmp = new Product[cart.length * 2];
            // 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//            Product[] tmp = Arrays.copyOf(cart, cart.length * 2);
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            // 새로운 장바구니와 기존의 장바구니를 바꾼다.
            cart = tmp;
        }

            // 물건을 장바구니에 저장하고 i의 값을 1 증가시킨다.
            cart[i++] = p;


    }  // add(Product p)

    void summary() {  // 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
        String itemList = "";
        int totalPrice = 0;

        for (int i = 0; i < cart.length; i++) {

            if (cart[i] == null) break;  // 유효성 검사 : 장바구니에 물건이 없으면 반복문 종료

            else {  // 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
                itemList += cart[i] + ",";
                // 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
                totalPrice += cart[i].price;
            }
        }

        // 물건을 사고 남은 금액(money)를 출력한다.
        System.out.println("구입한 물건 : " + itemList);
        System.out.println("사용한 금액 : " + totalPrice);
        System.out.println("남은 금액 : " + money);

    }  // summary()

}  // Buyer

class Product {
    int price;  // 제품의 가격

    public Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
