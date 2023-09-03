import OOPS.Calculator;
import org.junit.*;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * JUnit is a popular testing framework for Java that simplifies and automates the process of writing and executing unit tests. It provides a set of annotations, assertions, and test runners to help developers ensure the correctness of their code. Here are the key concepts and features of JUnit:
 *
 * 1. **Test Case**: A test case is a unit of testing that focuses on a specific aspect of your code. It's usually defined as a method in a test class that exercises a particular piece of functionality.
 *
 * 2. **Test Fixture**: A test fixture is the set of conditions or objects that a test case relies on to execute correctly. JUnit provides annotations to set up and tear down the test fixture before and after each test case.
 *
 * 3. **Annotations**:
 *    - `@Test`: Marks a method as a test case that should be executed.
 *    - `@Before`: Specifies a method to be run before each test method to set up the test fixture.
 *    - `@After`: Specifies a method to be run after each test method to clean up the test fixture.
 *    - `@BeforeClass`: Specifies a method to be run once before all test methods in the class.
 *    - `@AfterClass`: Specifies a method to be run once after all test methods in the class.
 *
 * 4. **Assertions**: JUnit provides various static methods in the `Assertions` class to perform assertions for validating expected outcomes. Common assertion methods include:
 *    - `assertEquals(expected, actual)`: Checks if two values are equal.
 *    - `assertTrue(condition)`: Checks if a condition is `true`.
 *    - `assertFalse(condition)`: Checks if a condition is `false`.
 *    - `assertNull(object)`: Checks if an object is `null`.
 *    - `assertNotNull(object)`: Checks if an object is not `null`.
 *    - `assertSame(expected, actual)`: Checks if two references point to the same object.
 *    - `assertNotSame(expected, actual)`: Checks if two references do not point to the same object.
 *
 * 5. **Test Runners**: Test runners are responsible for discovering and executing test cases. JUnit provides several test runners, including:
 *    - `JUnit4`: The default test runner for JUnit 4.
 *    - `JUnit5`: The test runner for JUnit 5 (also known as JUnit Jupiter).
 *    - `Suite`: Allows grouping multiple test classes and executing them together.
 *    - `Parameterized`: Allows running the same test case with different inputs.
 *
 * 6. **Test Suites**: A test suite is a collection of test cases that can be executed together. JUnit supports creating test suites using the `@RunWith` and `@Suite` annotations.
 *
 * 7. **Parameterized Tests**: JUnit allows you to run the same test case with different inputs by using parameterized tests. This is useful for testing multiple scenarios using the same test logic.
 *
 * 8. **Assertions in Exception Testing**: JUnit allows you to expect exceptions and define assertions about the expected exception types and messages.
 *
 * 9. **Test Life Cycle Hooks**: JUnit provides annotations to define methods that are executed before and after specific phases of the test life cycle. These include `@BeforeEach`, `@AfterEach`, `@BeforeAll`, and `@AfterAll` in JUnit 5.
 *
 * 10. **Testing Annotations**: JUnit 5 introduces additional testing annotations like `@DisplayName`, `@Tag`, and `@Disabled` to improve test documentation and organization.
 *
 * 11. **JUnit Categories (Tagging)**: JUnit 4 supports categorizing tests using tags (categories). You can define and execute tests based on their categories using the `@Category` annotation.
 *
 * JUnit makes it easier to write and manage unit tests, facilitating faster development cycles and more reliable code. It promotes the practice of test-driven development (TDD) by encouraging developers to write tests before writing code.
 */

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(4,3);
        assertEquals("Multiplying restult : "+result,16,result);
    }

    @Test
    public void testName() {
        String result = calculator.calculatorName();
        assertEquals("Megha", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }




    @BeforeClass
    public static void tearDownBefore() {
        System.out.println("BeforeClass is here instance.");
    }
    @Before
    public void setUp() {
        calculator = new Calculator("Megha");
        System.out.println("Setting up the calculator instance.");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down the calculator instance.");
    }
    @AfterClass
    public static void afterClassCal() {
        System.out.println("AfterClass is here instance.");
    }

//    @Test
//    @Parameters
//    public void testAddWithParameters(int a, int b, int expected) {
//        int result = calculator.add(a, b);
//        assertEquals(expected, result);
//    }
//
//    @SuppressWarnings("unused")
//    private static Collection<Object[]> parameters() {
//        return Arrays.asList(new Object[][] {
//                { 3, 5, 8 },
//                { 10, 2, 12 },
//                { 0, 0, 0 }
//        });
//    }

    @Ignore("Skipping this test for now")
    @Test
    public void testDisabled() {
        // This test will be skipped
    }
}
