package tech.chauncy.demo.spbtaskexecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpbTaskExecutorApplicationTests {

	@Autowired
	private TaskService taskService;
	
	@Test
	public void contextLoads() {
		for(int i = 0; i <20; i++){
			taskService.doSomethingAsync1(i);
			taskService.doSomethingAsync2(i);
		}
	}

}
