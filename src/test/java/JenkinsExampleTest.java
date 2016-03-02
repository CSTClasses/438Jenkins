import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsExampleTest {

	@Test
	public void verifyNonActionableRequest() {
		assertSame(new JenkinsExample().isActionable("not"),false);
	}
	@Test
	public void verifyActionableRequest() {
		assertSame(new JenkinsExample().isActionable("checkStatus"),true);
	}
	
	/*@Test
	public void verifyFalseEqualsTrue() {
		assertSame(false,true);
	}*/

}
