package com.jbuelow.robotskeleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("noHardware,noCamera")
public class RobotSkeletonApplicationTests {

	@Test
	public void contextLoads() {
	}

}
