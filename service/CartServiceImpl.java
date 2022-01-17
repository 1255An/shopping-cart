package pro.sky.java.course2.shoppingcart.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.shoppingcart.data.Cart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItemToCart(List<Integer> items) {
        for (Integer item : items) {
            if (!cart.getItems().contains(items)) {
                cart.getItems().add(item);
            }
        }
    }

    @Override
    public List<Integer> getItemsFromCart() {
        return cart.getItems();
    }
}
