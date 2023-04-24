import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Pool pool = new Pool(20000, 25);
        pool.startPriceSimulator(100000000);
    Asset a = new Asset("bitcoin", "btc");
        Trader t = new Trader("t", "t");
        Trader t2 = new Trader("g", "g");
        t.wallet.assetMap.put(a,  1.0);

        t2.wallet.assetMap.put(a, 1.0);
        System.out.println(pool.getCurrentPrice());

        System.out.println(t.wallet);
        System.out.println(t2.wallet);

        System.out.println(pool.getCurrentPrice());
        t.wallet.transferAsset(a, 0.5, t2);

        System.out.println(t.wallet);
        System.out.println(t2.wallet);


        t2.wallet.transferAsset(a, 1.2, t);

        System.out.println(t.wallet);
        System.out.println(t2.wallet);

    }
}