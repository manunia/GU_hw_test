package professional.lesson7;

public class TestSimpleClass {

    @BeforeSuite
    public static void init() {
        System.out.println("Start");
    }

    @MyTestAnnotation
    public static void test1() {
        System.out.println("testing ...");
    }

    @MyTestAnnotation(priority = 2)
    public static void test2() {
        System.out.println("testing...");
    }

    @AfterSuite
    public static void end() {
        System.out.println("End");
    }
}
