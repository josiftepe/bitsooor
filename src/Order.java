public abstract class Order {

    double price;
    double quantity;
    ORDER_TYPE type;
    Trader fromWho;
    abstract void execute();







}
