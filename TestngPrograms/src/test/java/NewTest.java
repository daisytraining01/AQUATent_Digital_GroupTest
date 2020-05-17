import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("I am Running from f()");
  }
  @Test
  public void f1() {
	  
	  System.out.println("i am Running from f1");
  }
  @AfterTest
  public void test1() {
	  
	  System.out.println("i am Running after test");
  }
  @BeforeTest
  public void test2() {
	  
	  System.out.println("i am Running before test");
  }
}
