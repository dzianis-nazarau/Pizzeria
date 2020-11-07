import payment.CardPayment;

public class Run {

    public static void main(String[] args) {

        Pizzeria dominosPizza = new Pizzeria();

        Kitchen kitchen = new Kitchen();
        Menue menue = new Menue();
        Cashbox cashbox = new Cashbox("Анастасия");
        Customer customer = new Customer("Иван");
        customer.setPayment(new CardPayment());

        dominosPizza.setKitchen(kitchen);
        dominosPizza.setMenue(menue);
        dominosPizza.setCashbox(cashbox);
        dominosPizza.setCustomer(customer);

        dominosPizza.doPurchase("Pepperoni");

    }

}
