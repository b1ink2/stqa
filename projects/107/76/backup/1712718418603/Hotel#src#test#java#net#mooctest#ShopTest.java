package net.mooctest;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ShopTest {

    @Test(timeout=4000)
    public void test1() {
        Shop shop =  new Shop();
        shop.addProduct(new Product("water", 2, 5));
        shop.addProduct(new Product("bread", 3, 10));
        shop.addProduct(new Product("milk", 4, 15));

        String info = shop.getAllProductsInfo();
        System.out.println(info);

        shop.deletProduct("milk");
        shop.sellProduct("bread", 4);

        shop.updateProduct("water", 3, 0.9);

        try{
            int indexOfWater = shop.searchProduct("apple");
        } catch (NullPointerException e) {

        }

        Product bread = shop.getProductByName("bread");
    }
}
