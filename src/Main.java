import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Pool pool = new Pool(20000, 25);

        Trader t = new Trader("t", "t");
        Trader t2 = new Trader("g", "g");

        System.out.println(t.wallet);
        System.out.println(t2.wallet);

        t.wallet.transferAsset(new Asset("bitcoin", "btc"), 0.5, t2);

        System.out.println(t.wallet);
        System.out.println(t2.wallet);


    }
}