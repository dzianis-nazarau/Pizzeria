import pizza.Pizza;

import java.util.List;

public class Cashbox {

    private String name;


    public Cashbox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getOrderPizza(Customer customer, Kitchen kitchen) {

        System.out.println("Кассир: Здравствуйте, Вас обслуживает " + name);

        List<Pizza> order = customer.getOrder();

        if (!order.isEmpty()) {

            String ord = "";
            for (Pizza pizza : order) {
                ord += pizza.getName();
            }

            double sum = 0;
            for (Pizza pizza : order) {
                sum += pizza.getPrice();
            }

            System.out.println("Кассир: Ваш заказ " + ord);
            System.out.println("Кассир: C вас " + sum + " рублей");

            System.out.println("Кассир: " + customer.doPayment());

            try {
                kitchen.cookPizza();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Касир: Держите ваш заказ: вкуснейшая " + ord);


        } else {
            System.out.println("Кассир: Жаль, что вы ничего не выбрали. Приходите еще");
        }
    }

}
