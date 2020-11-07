import pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Menue {

    private List<Pizza> menu = new ArrayList();

    public List<Pizza> getMenu() {
        return menu;
    }

    public void setMenu(List<Pizza> menu) {
        this.menu = menu;
    }

    public void addPizza (Pizza pizza) {
        menu.add(pizza);
    }

    public void removePizza (Pizza pizza) {
        menu.remove(pizza);
    }

}
