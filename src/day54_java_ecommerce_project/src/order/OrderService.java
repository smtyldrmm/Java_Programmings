package day54_java_ecommerce_project.src.order;

import day54_java_ecommerce_project.src.Cart;

public interface OrderService {
    String placeOrder(Cart cart);
}