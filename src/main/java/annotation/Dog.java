package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {

	@Value("husky")
	String name;
	@Value("Black")
	String color;
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}
}
