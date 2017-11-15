package cn.mldn.mldnflume;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFlume {
	// 创建了一个日志组件的对象
	private static final Logger LOG = LoggerFactory.getLogger(TestFlume.class);
	@Test
	public void test() {
		System.out.println("测试一下");
		LOG.info("[*********liaohuan *********]");  // 日志信息
	}
}
