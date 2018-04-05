import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class testrunner {
	   public static void main(String[] args) {
		      Result result = JUnitCore.runClasses(TestAssertions.class);
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println(result.wasSuccessful());
		   }
}
