package com.anji.springbootrabbitmq;

import com.anji.springbootrabbitmq.basic.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootrabbitmqApplicationTests {

	@Autowired
	private MessageSender sender;

	@Test
	public void testReceiver(){
		sender.send();
	}

	@Test
	public void contextLoads() {
	}

}
