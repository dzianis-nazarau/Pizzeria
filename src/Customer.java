import payment.Payment;
import pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Payment {

    private String name;
    private ArrayList<Pizza> order = new ArrayList<>();
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pizza> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Pizza> order) {
        this.order = order;
    }

    public void addPizzaToOrder (Pizza pizza) {
        order.add(pizza);
    }

    public void removePizzaFromOrder (Pizza pizza) {
        order.remove(pizza);
    }

    @Override
    public String doPayment() {
        return payment.doPayment();
    }

    public List<Pizza> chosePizza(Menue menue, String name) {
        List<Pizza> customerOrder = new ArrayList<>();
        boolean flag = false;
        for (Pizza pizza : menue.getMenu()) {
            if(name.equals(pizza.getName())) {
                order.add(pizza);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Покупатель: Такой пиццы нет, я ухожу");
        }
        String sum = "";
        for (Pizza pizza : order) {
            sum += pizza.getName();
        }
        return customerOrder;
    }
}
