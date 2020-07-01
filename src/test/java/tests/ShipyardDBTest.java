package tests;

import logic.users.db_yk.dao_yk.ShipyardDAO_YKImpl;
import logic.users.db_yk.enity_yk.Shipyard;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class ShipyardDBTest {

    @BeforeTest
    public void install(){

    }

    @AfterClass
    public void clean(){

    }

    /*@Test
    public void test01_GetShipyardsListTest(){
        assertThat(new ShipyardDAO_YKImpl().getShipyardsList().size(), greaterThan(0));
    }

    @Test
    public void test02_addShipyardTest(){
        Shipyard shipyard = new Shipyard("Ocean", "131", "15");
        assertThat(new ShipyardDAO_YKImpl().addShipyard(shipyard), is(true));
    }

    @Test
    public void test03_updateShipyardTest(){
        Shipyard shipyard = new Shipyard("Ocean", "131", "15");
        assertThat(new ShipyardDAO_YKImpl().updateShipyard(shipyard), is(true));
    }

    @Test
    public void test04_deleteShipyardTest(){
        Shipyard shipyard = new Shipyard("Ocean", "131", "15");
        assertThat(new ShipyardDAO_YKImpl().deleteShipyard(shipyard), is(false));
    }*/
}
