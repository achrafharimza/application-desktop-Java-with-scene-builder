package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import DAO.DBoperation;

class TestRegister {

	@Test
	void testRegistreF() {
		 DBoperation DBoperation = new DBoperation();
	     boolean flag = DBoperation.registerF("JUNIT", "JUNIT", "JU1234567", "063456789", "JUNIT@GMAIL.COM", "JUNIT", "JUNIT");
		
		assertEquals(true,flag);
		
	}

}
