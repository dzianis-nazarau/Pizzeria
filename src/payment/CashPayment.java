package payment;

import payment.Payment;

public class CashPayment implements Payment {
    @Override
    public String doPayment() {
        return "Спасибо за оплату наличными";
    }
}
