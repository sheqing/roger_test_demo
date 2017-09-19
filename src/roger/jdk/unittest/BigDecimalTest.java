package roger.jdk.unittest;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    /**
     * 加法测试
     */
    public void testAdd(){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        Assert.assertEquals(BigDecimal.valueOf(3),a.add(b));
    }

    @Test
    /**
     * 减法测试
     */
    public void testSubtract(){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        Assert.assertEquals(BigDecimal.valueOf(1),b.subtract(a));

    }

}
