package Test;

import org.junit.Test;

import main.RestService;

class UnitTest {

	@Test
	void test() {
		RestService rest = new RestService();
		String respo = rest.message(5,5,5).getEntity().toString();
		//assertEquals(respo, "XS")
		System.out.println(respo);
	}

}
