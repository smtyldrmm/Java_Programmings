package day54_java_ecommerce_project.src.balance;

import java.util.UUID;

public class CustomerBalance extends Balance {  public CustomerBalance(UUID customerId, Double balance) {
    super(customerId, balance);
}
    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance()+additionalBalance);
        return getBalance();
    }
}