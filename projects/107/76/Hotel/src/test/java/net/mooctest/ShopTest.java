package net.mooctest;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ShopTest {

    @Test(timeout=4000)
    public void test01() {
        Shop shop =  new Shop();
        Product pen = new Product("pen", 10, 5);
        shop.addProduct(new Product("water", 4, 5));
        shop.addProduct(new Product("bread", 3, 10));
        shop.addProduct(new Product("milk", 5, 15));
        shop.addProduct(new Product("banana", 5, 11));

        shop.addProduct(pen);
        shop.addProduct(pen);

        String info = shop.getAllProductsInfo();
        
        shop.deletProduct("milk");
        try {
            shop.deletProduct("computer");
        } catch (NullPointerException e) {
            // TODO: handle exception
        }
        shop.sellProduct("bread", 4);

        try {
            shop.sellProduct("computer", 1);
            
            
        } catch (NullPointerException e) {
            // TODO: handle exception
        }

        try {
            shop.sellProduct("pen", 20);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            shop.sellProduct("water", 0);
        } catch (Exception e) {
            // TODO: handle exception
        }

        shop.updateProduct("water", 3, 0.9);

        try {
            shop.updateProduct("computer", 1, 1);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try{
            int indexOfWater = shop.searchProduct("apple");
        } catch (NullPointerException e) {

        }

        Product bread = shop.getProductByName("bread");

        try {
            Product computer = shop.getProductByName("computer");
        } catch (Exception e) {

        }

        Product phone = new Product("phone", 1000, 2);
        try {
            phone.setPrice(0);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            phone.setPrice(10000.1234);
        } catch (IllegalArgumentException e) {

        }

        try {
            phone.setDiscount(0);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        try {
            phone.setDiscount(1.1);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        try {
            phone.setDiscount(0.9999999);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        try {
            phone.setName("???");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        try {
            phone.setName("hahahahhahahahahhahahahahahahahahhahaha");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        try {
            phone.setCount(0);
        } catch (Exception e) {
            // TODO: handle exception
        }


    }

    @Test
    public void test02() { // test order

        OrderItem item1 = new OrderItem("pen", 10, 3);
        item1.PrintOrderItem();
        OrderItem item2 = new OrderItem("water", 4, 2);

        item1.getProductName();
        item1.getCount();
        item1.setProductName("pencail");
        List<OrderItem> items = new ArrayList<>();

        items.add(item1);
        items.add(item2);
        Order order1 = new Order(items);
        order1.setItems(items);


        double amount = order1.totalAmount();
        order1.createOrder(items);
        assertTrue(38==amount); 

        List<OrderItem> items1 = new ArrayList<>();
        OrderItem orderItem1 = new OrderItem("Item1", 1, 1000);
        OrderItem orderItem2 = new OrderItem("Item2", 1, 499);
        OrderItem orderItem3 = new OrderItem("Item3", 1, 500);
        items1.add(orderItem1);
        order1.createOrder(items1);
        double amount1 = order1.totalAmount();
        items1.clear();
        System.out.println("amount:"+ amount1);
        items1.add(orderItem2);        
        order1.createOrder(items1);

        items1.add(orderItem3);
        order1.createOrder(items1);

        
        order1.createOrder(items1);

        order1.printOrders();

        // assertTrue(items1.equals(order1.searchMaxOrder()));
        order1.searchMaxOrder();

        order1.printOrderDetails();

        order1.formatDouble(1234);

        order1.getItems();

        item1.setCount(3);
    }

    @Test(timeout = 4000)
    public void test03() {
        Shop shop =  new Shop();
        Product pen = new Product("pen", 10, 5);
        shop.addProduct(new Product("water", 4, 5));
        shop.addProduct(new Product("bread", 3, 10));
        shop.addProduct(new Product("milk", 5, 15));
        shop.addProduct(new Product("banana", 5, 11));

        shop.addProduct(pen);
        shop.addProduct(pen);

        ShopKeeper sKeeper = new ShopKeeper();
        sKeeper.setShop(shop);
        sKeeper.showAllProducts();
        Map<String, Integer> products = new HashMap<>();
        products.put("pen", 2);
        products.put("bread", 3);

        sKeeper.sellProducts(products);

        products.put("apple", 1);
        
        sKeeper.sellProducts(products);

        products.clear();
        products.put("banana", 0);

        sKeeper.sellProducts(products);
    }
}
