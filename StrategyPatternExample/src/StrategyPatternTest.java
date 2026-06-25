public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.makePayment(2500);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.makePayment(1500);
    }
}