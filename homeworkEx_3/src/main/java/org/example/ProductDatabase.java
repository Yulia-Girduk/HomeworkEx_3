package org.example;

public class ProductDatabase {
    public static Product getProduct(int productId) throws Exception {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product("Product 1", 10, 5.99);
        }
        if(productId == 2) {
            return new Product("Product 2", 20, 7.99);
        }
        return null;
    }
}
