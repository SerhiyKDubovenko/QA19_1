package tests;

import logic.users.example.dao.ActorDAO;
import logic.users.example.dao.ActorDAOImpl;
import logic.users.example.enity.Actor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
public class ActorDBTest {



    @BeforeTest
    public void install(){

    }

    @AfterClass
    public void clean(){

    }

    @Test
    public void test01_GetActorsListTest(){
        assertThat(new ActorDAOImpl().getActorsList().size(), greaterThan(0));
    }

    @Test
    public void test02_addActorTest(){
        Actor actor = new Actor("Carlos", "Ray (Chuck)", "Norris", "1940", "150");
        assertThat(new ActorDAOImpl().addActor(actor), is(true));
    }

    @Test
    public void test03_updateActorTest(){
        Actor actor = new Actor("Carlos", "Ray 'Chuck'", "Norris", "1940", "150");
        assertThat(new ActorDAOImpl().updateActor(actor), is(true));
    }

    @Test
    public void test04_deleteActorTest(){
        Actor actor = new Actor("Carlos", "Ray 'Chuck'", "Norris", "1940", "150");
        assertThat(new ActorDAOImpl().deleteActor(actor), is(false));
    }
}
