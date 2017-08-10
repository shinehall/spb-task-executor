package tech.chauncy.demo.spbtaskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Async
	public void doSomethingAsync1(int i){
		System.out.println("设备1目前执行任务编号：" + i);
	}
	
	@Async
	public void doSomethingAsync2(int i){
		System.out.println("设备2目前执行任务编号：" + i);
	}
	
}
