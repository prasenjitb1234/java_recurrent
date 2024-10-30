package in.pb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pb.bean.Student;

public class Main {
	public static void main(String[] args) {
		
		String config_loc = "/in/pb/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
		System.out.println("-------------------");
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
		
		
	}
}

// steps - need to download 
// 1. spring-beans-xxx.jar
// 2. spring-core-xxx.jar
// 3. spring.context-xxx.jar
// 4 common-loggin-xxx.jar
// 5. spring-expression-xxx.jar
