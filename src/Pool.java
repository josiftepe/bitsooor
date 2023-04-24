public class Pool  {
    // TODO: create new thread
    public static double COIN_SUPPLY;
   Bitcoin bitcoin;
   public static double currentPrice;
   PriceSimulator priceSimulator;


    public Bitcoin getBitcoin() {

        return bitcoin;
    }

    public Pool(double price, double supply) {
        currentPrice =  price;
        COIN_SUPPLY = supply;
        this.priceSimulator = new PriceSimulator(this);
    }


    public void setBitcoin(Bitcoin bitcoin) {
        this.bitcoin = bitcoin;
    }

    public  double getCurrentPrice() {
        return currentPrice;
    }

    public  void setCurrentPrice(double currentPrice) {
        Pool.currentPrice = currentPrice;
    }

    public  double getCoinSupply() {
        return COIN_SUPPLY;
    }

    public static void setCoinSupply(double coinSupply) {
        COIN_SUPPLY = coinSupply;
    }
    public void startPriceSimulator(int interval) {
        priceSimulator = new PriceSimulator(this);
        Thread thread = new Thread(priceSimulator);
        thread.start();
    }
}
