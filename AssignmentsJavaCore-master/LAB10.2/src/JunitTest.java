
import org.junit.Assert;
import org.junit.Test;


public class JunitTest {
   @Test
   public void testGetFirstName(){
		Person per = new Person("Ankush","bathla", 'M');
		Assert.assertEquals("Ankush",per.getFirstName());
	}
  @Test
   public void testGetLastName(){
		Person per = new Person("Vikram","bathla", 'M');
		Assert.assertEquals("bathla",per.getLastName());
   }
  @Test
  public void testGetGender(){
		Person per = new Person("Vikram","bathla",'M');
		Assert.assertEquals('M',per.getGender());
  }
  public void testToString(){
		Person per = new Person("Vikram","bathla",'M');
		Assert.assertEquals("Person [firstName= Vikram  , lastName= bathla , gender= M ]",per.toString());
}
	}


