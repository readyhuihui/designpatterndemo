package com.readyhuihui.designpatterndemo;

import com.readyhuihui.designpatterndemo.hander1.Factory;
import com.readyhuihui.designpatterndemo.hander1.Handler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FansApplicationTests {

	@Test
	void noDesign() {
		String name = "张三";

		if (name.equals("张三")) {

			// 业务逻辑A
			System.out.println("张三完成任务AAA");

		} else if (name.equals("李四")) {

			// 业务逻辑A
			System.out.println("李四完成任务AAA");

		} else if (name.equals("王五")) {

			// 业务逻辑A
			System.out.println("王五完成任务AAA");

		} else if (name.equals("赵六")) {

			// 业务逻辑A
			System.out.println("赵六完成任务AAA");

		} else if (name.equals("田七")) {

			// 业务逻辑A
			System.out.println("田七完成任务AAA");

		} else if (name.equals("亢八")) {

			// 业务逻辑A
			System.out.println("亢八完成任务AAA");

		}
	}

	// 工厂 + 策略设计模式
	@Test
	void design() {
		String name = "张三";
		Handler strategy = Factory.getInvokeStrategy(name);
		strategy.AAA(name);
	}

}