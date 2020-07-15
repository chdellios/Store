package gr.codehub.myapp;

public class SimpleRetailStoreImpl implements Store {
    private double totalBuyBalance;
    private double totalSellBalance;


    public SimpleRetailStoreImpl() {
        totalBuyBalance = 0;
        totalSellBalance = 0;
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }


}
