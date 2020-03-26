import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import professional.lesson6.Lesson6MainClass;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArray {
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1,7}, new int[]{1,2,0,0,2,3,4,1,7}},
                {new int[]{}, new int[]{-1,0,40,555,4}},
        });
    }

    Lesson6MainClass mainClass;

    private int[] expected;
    private int[] actuals;

    private int[] expectedRunTimeExcept = {};
    private int[] actualsRunTimeEx = {-1,0,40,555};

    public TestArray(int[] expected, int[] actuals) {
        this.expected = expected;
        this.actuals = actuals;
    }

    @Before
    public void init() {
        mainClass = new Lesson6MainClass();
    }


    @Test
    public void testArray1() {
        Assert.assertArrayEquals(expected,mainClass.array(actuals));
    }

    @Test
    public void testArray3(){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertArrayEquals(expectedRunTimeExcept,mainClass.array(actualsRunTimeEx));
    }

    @After
    public void end() {
        System.out.println("END");
    }
}
