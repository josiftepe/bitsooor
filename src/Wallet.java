import java.util.*;
public class Wallet {
    Map<Asset, Double> assetMap = new HashMap<>();
    Map<Asset, Double> assetPrice = new HashMap<>();



    void transferAsset(Asset a, double quantity, Trader trader) {

        if(assetMap.containsKey(a)) {
            System.out.println("DA");
            if(assetMap.get(a) >= quantity) {
                assetMap.put(a, assetMap.get(a) - quantity);
                double initial = 0.0;
                if(trader.wallet.assetMap.containsKey(a)) {
                    initial = trader.wallet.assetMap.get(a);
                }
                initial += quantity;
                trader.wallet.assetMap.put(a, initial);

            }
        }
    }
    double calcPrice(Pool pool) {
        double result = 0.0;
        for(Map.Entry<Asset, Double> entry: assetMap.entrySet()) {
            result += pool.getCurrentPrice() * entry.getValue();
        }
        return result;
    }
    void updatePrices(Pool p) {
        for(Map.Entry<Asset, Double> entry : assetPrice.entrySet()) {
            assetPrice.put(entry.getKey(), p.getCurrentPrice());
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Asset, Double> entry : assetMap.entrySet()) {
            sb.append(entry.getValue());
            sb.append(entry.getKey());
            sb.append(" ");
        }
        return sb.toString();
    }


}
