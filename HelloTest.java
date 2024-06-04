import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class HelloTest {
    Hello h;
    @Before
    public void setUp() throws Exception {
        h = new Hello();
    }
    @Test
    public void testReturnsAnswer() {
        Assert.assertEquals(42, Hello.returnAnswerToEverything());
    }
}