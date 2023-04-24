public class Trader {
    public double fiatBalance;
    Wallet wallet;
    String name, email;
    public Trader(String name, String email) {
        fiatBalance = 10000;
        wallet = new Wallet();
        this.name = name;
        this.email = email;

    }
    public void notifyPriceChanges(double newPrice, Pool pool) {
        wallet.updatePrices(pool);
    }
}
