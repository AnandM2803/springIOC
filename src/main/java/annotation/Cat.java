package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	@Value("tommy")
	String name;
	@Value("balck")
	String color;
	
	
	@Autowired
	Chain chain;

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", chain=" + chain + "]";
	}
	
	

	
}
