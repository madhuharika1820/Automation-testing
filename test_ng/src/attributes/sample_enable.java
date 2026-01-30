package attributes;
import org.testng.annotations.Test;

public class sample_enable {


  @Test(enabled=false)
  public void f() {
	  System.out.println(" first testcase");
  }
  @Test
  public void f1() {
	  System.out.println("second testcase");
  }}