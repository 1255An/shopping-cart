package pro.sky.java.course2.shoppingcart.data;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Integer> getItems() {
        return items;
    }

    public void addItem(Integer item) {
        if (getItems().contains(new Cart())) {
           Cart itemsInCart = new Cart();
        }
    }
}
