package JunitTesting;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Controllers.Page2Controller;
import DAO.AddClient;
import DAO.DBoperation;

class TestAjouterClient {

	@Test
	void testAjouter() {
		
		AddClient AddClient =new AddClient();
		
		boolean flag = AddClient.AddC("JUNIT", "JUNIT", "JUNIT@GMAIL.COM", "2030-07-31", "JU1234567", "063456789", "JUNIT", "JUNIT", "JUNIT");
		assertEquals(true,flag);
		
		
		
	}

}
