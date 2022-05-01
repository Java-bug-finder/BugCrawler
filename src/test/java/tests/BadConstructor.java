package tests;
import example.ConstructorTest;
import example.Loops;
import org.apache.tools.ant.types.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;




public class BadConstructor {

    ConstructorTest c;


    @Before
    public void setup(){
        c = new ConstructorTest();
    }


    @Test
    @Category(BadConstructor.class)
    public void BadConstructorTest(){

    }
 

}
