package roger.jdk.unittest;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    public void testAdd(){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        Assert.assertEquals(BigDecimal.valueOf(3),a.add(b));
    }

}
