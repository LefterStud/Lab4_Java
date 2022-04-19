package com.company;

public class Products {
    private Stock[] products;
    private int currentProductsNumber;

    public Products(final int productNumber) {
        this.products = new Stock[productNumber];
        currentProductsNumber = -1;
    }

    public void addProduct(final Stock product) {
        if (++currentProductsNumber < products.length) {
            products[currentProductsNumber] = product;
        }
    }

    public void deleteProduct(final int number) {
        final Products tempProducts = new Products(currentProductsNumber);
        tempProducts.currentProductsNumber = currentProductsNumber;
        int newIndex = 0;
        for (int i = 0; i <= currentProductsNumber; i++) {
            if (i == number) continue;
            tempProducts.products[newIndex++] = products[i];
        }
        products = tempProducts.products;
        currentProductsNumber--;
    }

    public Stock findMaxPriceProduct() {
        Stock maxPriceProduct = products[0];
        for (final Stock product : products) {
            if (product.getPrice() >= maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct;
    }

    @Override
    public String toString() {
        String result = "Stock: " + System.lineSeparator();
        for (final Stock product : products) {
            result += product + System.lineSeparator();
        }
        return result;
    }
}
