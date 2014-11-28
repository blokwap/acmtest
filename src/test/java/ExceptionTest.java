/**
 * 
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 *
 */
public class ExceptionTest {
  private static Logger logger = LoggerFactory.getLogger(ExceptionTest.class);
  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {}

  @Test
  public void testException1() {
    int[] ints = new int[] { 1, 2, 3, 4 };
    System.out.println("异常出现前");
    try {
        System.out.println(ints[4]);
        System.out.println("我还有幸执行到吗");// 发生异常以后，后面的代码不能被执行
    } catch (IndexOutOfBoundsException e) {
        System.out.println("数组越界错误");
        throw e;
        
    }
    System.out.println("异常出现后");
  }
 
  @Test
  public void testException2() {
    int[] ints = new int[] { 1, 2, 3, 4 };
    System.out.println("异常出现前");
    System.out.println(ints[4]);
    System.out.println("我还有幸执行到吗");// 发生异常以后，他后面的代码不能被执行
  }
}
