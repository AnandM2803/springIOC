package demo;

public class Car {

String brand;
String color;
double price;

JblmusicSystem jbl;

public JblmusicSystem getJbl() {
	return jbl;
}
public void setJbl(JblmusicSystem jbl) {
	this.jbl = jbl;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", jbl=" + jbl + "]";
}




}
