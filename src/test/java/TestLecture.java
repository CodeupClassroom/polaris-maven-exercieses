import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestLecture {

    private List<String> names;

    // BEFORE WILL RUN THE SETUP METHOD BEFORE THE TESTS
    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    // We can verify that the names list is no longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    // TESTING IF WE CAN ADD TO THE ARRAYLIST INITIALIZED IN setUp()
    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }



    // EXAMPLE OF ASSERT EQUALS
    // CHECKS TO SEE IF EXPECTED AND ACTUAL VALUES ARE EQUAL
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }


    // EXAMPLE OF ASSERT EQUALS AND NOT EQUALS
    // THIRD PARAMETER DELTA DEFINES A MARGIN OF ERROR or DIFFERENCE BETWEEN EXPECTED AND ACTUAL
    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        int intPrice = 10;
        int intDiscount = 4;

        assertEquals(6, intPrice - intDiscount);
        assertNotEquals(5, intPrice - intDiscount);

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }


    // EXAMPLE OF ASSERT SAME AND NOT SAME
    // DOG AND SHEEP ARE TWO DIFFERENT OBJECTS
    // CLONED SHEEP IS ANOTHER REFERENCE FOR ORIGINAL SHEEP OBJECT SO THEY ARE THE SAME
    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        System.out.println("Dog to string: " + dog.toString());
        System.out.println("Sheep to string: " + sheep.toString());
        System.out.println("Cloned Sheep to string: " + clonedSheep.toString());

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }


    // TESTING BOOLEAN EXPRESSIONS/VALUES USING ASSERT TRUE AND FALSE
    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = false;

        assertFalse(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    // CHECKING FOR NULL USING ASSERT NULL AND NOT NULL
    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(laptop);
        assertNotNull(phone);
    }


    // EXAMPLE OF ARRAY EQUALS (NOT SAME BUT ARE ALL THE ELEMENTS THE SAME)
    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }


}
