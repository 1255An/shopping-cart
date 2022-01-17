package pro.sky.java.course2.shoppingcart.service;

import java.util.*;

public interface CartService {
    void addItemToCart(List<Integer> items);

    List<Integer> getItemsFromCart();


}
