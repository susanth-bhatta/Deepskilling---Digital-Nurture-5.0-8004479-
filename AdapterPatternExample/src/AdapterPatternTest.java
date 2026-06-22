public class AdapterPatternTest {

    public static void main(String[] args) {

        // PayPal Payment
        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new PayPalGateway());

        paypalProcessor.processPayment(5000);

        // Stripe Payment
        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        stripeProcessor.processPayment(7500);
    }
}