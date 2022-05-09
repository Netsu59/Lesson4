package lesson4.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value ={
            "'lower border-zero, upper border-zero',0,0,1",
            "'lower border zero, upper border-one',0,1,2",
            "'lower border-zero, upper border-ten',0,10,4",
            "'lower border-ten, upper border-hundred',10,100,7",
            "'lower border-hundred, upper border-four hundred',100,400,11",
            "'lower border-four hundred, upper border-huge number',1000,400000000,37263308",
            "'lower border-one, upper border-one',1,1,1",
            "'lower border-one, upper border-zero',1,0,0",
            "'lower border-four huge number, upper border-zero',400000000,0,0",
            "'lower border-four zero, upper border-minus five',0,-5,1",
            "'lower border-four minus one, upper border-minus five',-1,-5,0"
            },
            delimiter = ','
    )
    void shouldCalculateSqrNumberInBorders(String test, int lower, int upper, int expected) {

        SQRService service = new SQRService();
        int value = service.calculateSqrNumberInBorders(lower, upper);

        assertEquals(expected,value);
    }

}
