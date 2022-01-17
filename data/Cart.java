package pro.sky.java.course2.shoppingcart.data;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> getItems() {
        return items;
    }
}
