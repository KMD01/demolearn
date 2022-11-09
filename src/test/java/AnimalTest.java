import app.Animal;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@ExtendWith(SpringExtension.class)
public class AnimalTest {

    Animal animal;

    @BeforeEach
    public void setUp() {
        animal = new Animal();
        log.info("Before test");
    }


    @AfterEach
    public void closeUp(){
        log.info("After test");
    }

    @Test
    void givenEvenNumber_whenCheckingIsNumberEven_thenTrue() {
        boolean result = this.animal.isAnimalAgeEven(8);
        assertTrue(result);
    }

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();
        log.info(exception.getMessage());

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
