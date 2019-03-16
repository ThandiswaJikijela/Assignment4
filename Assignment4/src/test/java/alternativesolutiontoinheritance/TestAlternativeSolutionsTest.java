package alternativesolutiontoinheritance;
//Testing The Alternative Solution of Inheritance
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAlternativeSolutionsTest {

    private Vehicle vehicle;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Inheritance() {
       Car c2 = new Car();
       Assert.assertEquals("5series",c2.getModelName());
       Assert.assertEquals("BMW",c2.getBrand());
    }
}