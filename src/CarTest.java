
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car mycar;
	@Before
	public void setUp() throws Exception {
		mycar= new Car(20);
	}

	@Test
	public void test() {
		mycar.addcap(30);
		assertEquals(50,mycar.getCapacity());
	}

}
