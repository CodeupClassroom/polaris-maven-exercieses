import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;
public class MyFirstTest {


    // MORE EXAMPLES OF BASIC ASSERTS
    @Test
    public void companyNameEquals() {
        String company = "Codeup";
        String codeup = "CodeUp";
        assertEquals(company.toLowerCase(), codeup.toLowerCase());
    }

    @Test
    public void arrayListsAreNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);

    }

    @Test
    public void languagesContain() {
        String language = "Java";
        assertFalse(language.contains("H")); // use assertTrue for this statement
// use assertFalse for this statement
        assertTrue(language.contains("J"));
    }









}
