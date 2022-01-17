package pro.sky.java.course2.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.shoppingcart.service.CartService;

import java.util.List;

@RestController
@RequestMapping("store/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addItemToCart(@RequestParam List<Integer> idList) {
        cartService.addItemToCart(idList);
    }

    @GetMapping("/get")
    public List<Integer> getItemsFromCart() {
        return cartService.getItemsFromCart();
    }
}

