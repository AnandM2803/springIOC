package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext  context=new ClassPathXmlApplicationContext("/demo/MyConfigFile.xml");
//Car car=(Car)context.getBean("car");
//System.out.println(car);
//
//Bike bike=(Bike)context.getBean("bike");
//System.out.println(bike);

JblmusicSystem jbl=(JblmusicSystem)context.getBean("music");

System.out.println(jbl);
jbl.m2();
	
	
	}

}
