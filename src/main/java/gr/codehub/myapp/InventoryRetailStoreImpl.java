package gr.codehub.myapp;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStoreImpl implements Store {


    private List<Product> products;

    private double revenue;


    public InventoryRetailStoreImpl() {
        products = new ArrayList<>();
        revenue = 0;

    }

    public List<Product> getInventory() {
        return new ArrayList<>(products);
    }

    public void reset() {
        products.clear();
}


    @Override
    public void buy(Product product) {
        products.add(product);
        revenue -= product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        products.remove(product);
        revenue += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return revenue;
    }
}
