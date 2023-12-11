package day54_java_ecommerce_project.src.checkout;


import day54_java_ecommerce_project.src.Customer;

public interface CheckoutService {
    boolean checkout(Customer customer, Double totalAmount);
}