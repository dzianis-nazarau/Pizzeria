public class Pizzeria {

    private Menue menue;
    private Cashbox cashbox;
    private Customer customer;
    private Kitchen kitchen;

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Cashbox getCashbox() {
        return cashbox;
    }

    public void setCashbox(Cashbox cashbox) {
        this.cashbox = cashbox;
    }

    public Menue getMenue() {
        return menue;
    }

    public void setMenue(Menue menue) {
        this.menue = menue;
        menue.setMenu(kitchen.allPizza);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void doPurchase(String pizzaName) {

        customer.chosePizza(menue, pizzaName);
        cashbox.getOrderPizza(customer, kitchen);

    }
}
