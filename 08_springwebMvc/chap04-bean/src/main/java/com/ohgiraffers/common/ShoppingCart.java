package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;
    // 자기 클래스 내부에서만 접근이 가능하다.
    // 직접 참조할 수 없게 만든다
    // 캡슐화 : 내가 정해놓은 룰을 벗어나는 것을 방지한다


    public ShoppingCart() {

        this.items = new ArrayList<Product>();
    }


//    public ShoppingCart(List<Product> items) {
//        this.items = items;
//    }

    public void addItem(Product Item) {
        items.add(Item);
    }

    public List<Product> getItems() {
        return items;
    }


}
