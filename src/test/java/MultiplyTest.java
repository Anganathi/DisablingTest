import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {
    @Ignore
    @Test
    public void multiplyTest(){
        int a = 5;
        int b = 8;
        int result = Multiply.multiply(a, b);

        Assert.assertEquals(30, result);
    }

}