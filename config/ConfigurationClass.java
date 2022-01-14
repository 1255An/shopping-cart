package pro.sky.java.course2.shoppingcart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

public class ConfigurationClass {
    @Configuration
    public class Cart {
        @SessionScope
        public Cart createNewCart (){
            return new Cart();
        }
    }
}
