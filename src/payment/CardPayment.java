package payment;

public class CardPayment implements Payment {
    @Override
    public String doPayment() {
        return "Спасибо за оплату картой";
    }
}
