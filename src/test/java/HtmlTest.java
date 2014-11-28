/**
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 *
 */
public class HtmlTest {
  private static Logger logger = LoggerFactory.getLogger(HtmlTest.class);

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {}

  @Test
  public void testGet() {
    String strServer = "222.212.254.74:8088"; // 取得第一个参数
    String strPage = "/index_jnfddd.jsp"; // 取得第二个参数
    Socket socket = null;
    try {
      int port = 8088;
      socket = new Socket("222.212.254.74", port); // 建立一个Socket

      // 发送命令
      BufferedWriter wr = new BufferedWriter(new OutputStreamWriter

      (socket.getOutputStream(), "UTF8"));
      wr.write("GET " + strPage + " HTTP/1.0\r\n");
      wr.write("HOST:" + strServer + "\r\n");
      wr.write("\r\n");
      wr.flush();

      // 接收返回的结果
      BufferedReader rd = new BufferedReader(new InputStreamReader

      (socket.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
        System.out.println(line);
      }
      wr.close();
      rd.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
