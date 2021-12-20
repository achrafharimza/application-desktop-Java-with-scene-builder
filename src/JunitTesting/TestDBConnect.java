package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import DAO.DataBConnect;

class TestDBConnect {

	@Test
	void testGetConnection() {
		
		DataBConnect DataBConnect =new DataBConnect();
		Connection flag = DataBConnect.getConnection();
		assertNotNull(flag);
		
		
		
	}

}
