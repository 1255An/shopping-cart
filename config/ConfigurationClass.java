package pro.sky.java.course2.shoppingcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.shoppingcart.data.Cart;

@Configuration
public class ConfigurationClass {

    @Bean
    @SessionScope
    public Cart createNewCart() {
        return new Cart();
    }
}

