public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();
        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 3850.50);

        stockMarket.deregisterObserver(webUser);

        System.out.println("\nBob unsubscribed from notifications.");
        stockMarket.setStockPrice("Cognizant", 1620.75);
    }
}