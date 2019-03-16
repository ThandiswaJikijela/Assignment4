package objectorientedprogrammingtesting;

//Using TDD to test then create a program that will correspond with the testing of make the testing correct

import objectorientedprogramming.Inheritance.Car;
import objectorientedprogramming.Polymorphism.Food;
import objectorientedprogramming.Polymorphism.Meat;
import objectorientedprogramming.Polymorphism.Pasta;
import objectorientedprogramming.Encapsulation.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testObjectOriented {

    private Student s1;
    private Food f1;

    @Before
    public void setUp() throws Exception {
       s1 = new Student();
       f1 = new Food();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void Encapsulation() {
        int StudNo = s1.getStudentNo(6376374);
        Assert.assertEquals(6376374,StudNo);

        String Name = s1.getName("Zitha");
        Assert.assertEquals("Zitha",Name);
    }

    @Test
    public void Polymorphism()
    {
        Assert.assertEquals("cook now",f1.cook());
        Assert.assertEquals("eat now",f1.eat());

        Pasta p1 = new Pasta();
        Assert.assertEquals("Cook Tomorrow",p1.cook());
        Assert.assertEquals("Eat Tomorrow",p1.eat());

        Meat m1 = new Meat();
        Assert.assertEquals("Cook meat for 30minuets",m1.cook());
        Assert.assertEquals("Eat after 2 hours",m1.eat());
    }

    @Test
    public void Inheritance()
    {
        Car c1 = new Car();
        //c1.getBrand();
        Assert.assertEquals("BMW",c1.getBrand());
        Assert.assertEquals("5series",c1.getModelName());

    }
}
