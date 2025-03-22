import main.java.com.semicolon.africa.model.Shop;
import main.java.com.semicolon.africa.model.Store;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
@Test
    public void test_that_add_items_to_store(){
    Store store = new Store("Coke",500);
    Shop shop = new Shop();
    shop.addItems(store);
    assertEquals(1,shop.viewAllItems().size());
}
@Test
public void test_that_get_items(){
    Store store = new Store("Coke",500);
    Shop shop = new Shop();
    shop.addItems(store);
    assertEquals("Coke",shop.viewAllItems().get(0).getItem());
}

@Test
    public void test_that_add_more_than_one_items_to_store(){
    Shop shop = new Shop();
    shop.addItems(new Store("Bread",700));
    shop.addItems(new Store("Cake",10000));
    shop.addItems(new Store("Bama",100));
    assertEquals(3,shop.viewAllItems().size());
}
}
