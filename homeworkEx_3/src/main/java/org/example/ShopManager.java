package org.example;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity)  {
        try {
            Product product = ProductDatabase.getProduct(productId);
            product.setAvailableQuantity(product.getAvailableQuantity() - quantity);
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;

        } catch (NullPointerException e) {
            System.out.println("Нет такого товара!");
        } catch (NotEnoughQuantityException e) {
            System.out.println("Нет такого количества на складе!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
