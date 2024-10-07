package Maven_Testng_Project;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
//Maven_Testng_Project.Testng_Demo
public class Testng_Demo {
  @Test
  public void f() {
	  
	  System.out.println("This is my test area");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("This is my precondition area");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This is my postcondition area");
  }

}
