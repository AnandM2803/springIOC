package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext context=new ClassPathXmlApplicationContext("xyz.xml");

		ApplicationContext context=new ClassPathXmlApplicationContext("abc.xml");
		
		
		Cat cat=(Cat) context.getBean("cat");
		System.out.println(cat);
		
		Dog dog=(Dog) context.getBean("dog");
		System.out.println(dog);
		
		
		
	}

}
