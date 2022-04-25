package tests;


import example.Loops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.experimental.categories.Category;

public class LoopTests {

    public Loops loop;

    @Before
    public void setup(){
        loop = new Loops();
    }

    @Test
    @Category(LoopTests.class)
    public void everloopTest(){
       //Assert.assertTrue(loop.everLooping(loop::everloopTest));

    }








}
