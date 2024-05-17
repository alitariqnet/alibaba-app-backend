package com.AlHassanElectronics.Software;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void reflectionUtilsTest(){
		System.out.println(ReflectionTestUtils.getField(Application.class, "number"));
	}
}
