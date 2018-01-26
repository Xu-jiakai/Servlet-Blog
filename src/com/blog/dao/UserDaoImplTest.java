package com.blog.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserDaoImplTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testHasUsername() {
		boolean a=new UserDaoImpl().hasUsername("xujiakai");
		assertEquals(true,a);
	}
	
	

}
