import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

    @Test
    public void test_buy_exception(){
        Computer sameComp = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        try{
            shop.buy(sameComp);
            shop.buy(sameComp);
            fail("buy() should have thrown an exception for repeat computers.");
        } catch (Exception e){
            
        }
    }

    @Test
    public void test_buy() throws Exception{
        Computer newComp = new Computer("2018 MacBook Pro", "Intel", 256, 32, "High Sierra", 2020, 5000);
        ResaleShop shop = new ResaleShop();
        shop.buy(newComp);
        assertEquals(newComp, shop.inventory.get(1));
    }

    @Test
    public void test_sell_exception(){
        ResaleShop shop = new ResaleShop();
        Computer newComp = new Computer("2019 MacBook Pro", "Intel", 256, 32, "High Sierra", 2020, 5000);
        try{
            shop.sell(newComp); 
            fail("sell() should have thrown an exception since newComp is not in the inventory");
        } catch (Exception e){
            
        }
    }

    @Test
    public void test_ResaleShop_Constructor(){
        ResaleShop shop = new ResaleShop();
        assertEquals(null, shop.inventory.get(0));
    }

    @Test
    public void test_setOS(){
        Computer newComp = new Computer("2018 MacBook Pro", "Intel", 256, 32, "Low Sierra", 2020, 5000);
        newComp.setOS("Low Sierra");
        assertEquals("Low Sierra", newComp.operatingSystem);
    }

    @Test
    public void test_Computer_price(){
        Computer newComp = new Computer("2018 MacBook Pro", "Intel", 256, 32, "High Sierra", 2020, 5000);
        assertEquals(5000, newComp.price);
    }

    @Test
    public void test_Computer_memory(){
        Computer comp = new Computer("2018 MacBook Pro", "Intel", 256, 64, "High Sierra", 2020, 5000);
        assertEquals(64, comp.memory); 
    }

    @Test
    public void test_printInventory(){
        ResaleShop shop = new ResaleShop();
        try{
            shop.printInventory();
        } catch (Exception IndexOutOfBounds){
            fail("Tries printing an extra index of computer / out of bounds");
        }
    }

    @Test
    public void test_refurbish() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer comp = new Computer("2018 MacBook Pro", "Intel", 256, 64, "High Sierra", 2020, 5000);
        shop.refurbish(comp, "New OS");
        assertEquals("New OS", comp.operatingSystem);                 
    }

    @Test
    public void test_refurbish_price() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer comp = new Computer("2010 MacBook Pro", "Intel", 256, 64, "High Sierra", 2010, 5000);
        shop.refurbish(comp, "OS");
        assertEquals(250, comp.price);
    }   
       
}
