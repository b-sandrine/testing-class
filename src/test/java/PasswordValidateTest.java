
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;

@Test
public class PasswordValidateTest {
	PasswordValidate pv = new PasswordValidate("sandrine");
	
	public void shouldHaveEightCharactersInLength() {
		assertEquals(pv.validate(),true, "The password must be 8 characters long");
	}
	
	public void shouldHaveUnderscore() {
		assertEquals(pv.validate(),true, "The password should have an underscore");
	}
}
