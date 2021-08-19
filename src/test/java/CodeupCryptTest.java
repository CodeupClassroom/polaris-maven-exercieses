import maven.CodeupCrypt;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testVersion() {
        CodeupCrypt.version = 0.0;
        assertEquals(0.0, CodeupCrypt.version, 0);
    }


    @Test
    public void testHashPassword() {
        assertEquals("s4m", CodeupCrypt.hashPassword("sam"));
        assertEquals("y1shm43l", CodeupCrypt.hashPassword("yishmael"));
    }


    @Test
    public void testCheckPassword() {
        assertTrue(CodeupCrypt.checkPassword("sam", "s4m"));
    }


}
