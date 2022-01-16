package pro.sky.java.course2.shoppingcart.service;
import java.util.*;

public interface CartService {
    void addItemToCart (ArrayList<Integer> items);
    List<Integer> getItemsFromCart ();


}
