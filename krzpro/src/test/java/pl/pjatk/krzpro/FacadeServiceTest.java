package pl.pjatk.krzpro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FacadeServiceTest {

    @Autowired
    private FacadeService facadeService;

    @BeforeEach
    public void setUp() {
        System.clearProperty("APP_ENV");
    }

    @Test
    public void testGetMessageForDevEnvironment() {
        String message = facadeService.getMessage();
        assertNotNull(message);
        assertEquals("Hello from Dev", message);
    }

    @Test
    public void testGetMessageForProdEnvironment() {
        String message = facadeService.getMessage();
        assertNotNull(message);
        assertNotEquals("Hello from Prod", message);
    }

    @Test
    public void testGetMessageForQaEnvironment() {
        String message = facadeService.getMessage();
        assertNotNull(message);
        assertNotEquals("Hello from QA", message);
    }

    @Test
    public void testGetMessageForStagingEnvironment() {
        String message = facadeService.getMessage();
        assertNotNull(message);
        assertNotEquals("Hello from Staging", message);
    }

    @Test
    public void testGetMessageForUnknownEnvironment() {
        String message = facadeService.getMessage();
        assertNotNull(message);
        assertEquals("Hello from Dev", message);
    }
}
