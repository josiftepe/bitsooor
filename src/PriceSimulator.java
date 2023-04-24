import java.util.List;
import java.util.Random;

public class PriceSimulator implements Runnable{
    int interval;
    Random random;
    Pool pool;
    List<Trader> traders;
    public PriceSimulator(Pool pool) {
        this.pool = pool;
    }
    @Override
    public void run() {
        try {
            while (true) {
                double oldPrice = pool.getCurrentPrice();
                double newPrice = generateNewPrice(oldPrice);
                pool.setCurrentPrice(newPrice);

                for (Trader t : traders) {
                    t.notifyPriceChanges(newPrice, pool);
                }

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    double generateNewPrice(double oldPrice) {
        double min = oldPrice * 0.9;
        double max = oldPrice * 1.2;
        return min + (max - min) * (random.nextDouble() + 0.05);
    }
}
