package JunitTesting;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;


import org.junit.jupiter.api.Test;

import DAO.DBoperation;
import helpers.bcrypt;

class TestLogin {

//	DBoperation DBlogin ;
//	
//	@Before
//	public void init() {
//		
//		DBlogin =new DBoperation();
//		
//	}
//	@Test
//	public void testlogin()       {
//	
//		try {
//			assertEquals(true, DBlogin.validateLogin("admin@gmail.com", "admin"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	@Test
	public void testlogin()       {
	 DBoperation DBoperation = new DBoperation();
     try {
    	 
		boolean flag = DBoperation.validateLogin("admin@gmail.com", bcrypt.hashing("admin"));
		
		assertEquals(true,flag);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
	
	
	
	
	
}
