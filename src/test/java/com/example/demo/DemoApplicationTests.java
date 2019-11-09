package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.ScheduledService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	ScheduledService scheduledService;
	
    @SuppressWarnings("deprecation")
	@Test
    public void contextLoads() {
    	
    	Assert.assertNotNull(scheduledService);
    	
    }

}
