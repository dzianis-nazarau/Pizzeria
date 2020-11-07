import pizza.MeatPizza;
import pizza.Pizza;
import pizza.VegetarianPizza;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

    List<Pizza> allPizza;

    public List<Pizza> getAllPizza() {
        return allPizza;
    }

    public void setAllPizza(List<Pizza> allPizza) {
        this.allPizza = allPizza;
    }

    public Kitchen() {
        allPizza = new ArrayList<>();
        allPizza.add(new MeatPizza(14.99, "Pepperoni"));
        allPizza.add(new MeatPizza(8.99, "Hawain"));
        allPizza.add(new VegetarianPizza(10.99, "Margarita"));
    }

    public void addPizza (Pizza pizza) {
        allPizza.add(pizza);
    }

    public void removePizza (Pizza pizza) {
        allPizza.remove(pizza);
    }

    public void cookPizza () throws InterruptedException {
        System.out.println("Кухня: Пицца будет готова через 3 секунды");
        Thread.sleep(3000);
        System.out.println("Кухня: Касса, заберите пиццу");
    }

}
