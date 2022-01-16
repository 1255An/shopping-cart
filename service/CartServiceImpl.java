package pro.sky.java.course2.shoppingcart.service;

import pro.sky.java.course2.shoppingcart.data.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartServiceImpl implements CartService {

    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItemToCart(ArrayList<Integer> items) {
        for (Integer item : items) {
            cart.addItem(item);
        }
    }

    @Override
    public List<Integer> getItemsFromCart() {
        return cart.getItems();
    }
}
