package com.ravi.cal.RaviCalculator;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
   
    public void twoAndThreeIsFive() throws Exception {
        final long result = new Calculator().addFucn(2, 3);
        assertThat(result, is(5L));
    }

    
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subFucn(2, 3);
        assertThat(result, is(1L));
    }
    

    public void threeXThreeIsNine() throws Exception {
        final long result = new Calculator().mulFucn(3, 3);
        assertThat(result, is(9L));
    }
   
}

