import maven.AssessmentReview;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestAssessment {

    // EXAMPLES OF TESTS FOR THE ASSESSMENT REVIEW METHODS
    @Test
    public void testCubedMethod() {
        assertEquals(8, AssessmentReview.cubed(2));
    }

    @Test
    public void testMultiplyMethod() {
        assertEquals(35.75, AssessmentReview.multiply(5.5, 6.5), 0);
    }
}
