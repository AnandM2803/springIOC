package demo;

public class Bike {

	String company;
	int cc;
	String color;
	
	JblmusicSystem jbl;

	public Bike(String company, int cc, String color, JblmusicSystem jbl) {
		super();
		this.company = company;
		this.cc = cc;
		this.color = color;
		this.jbl = jbl;
	}
public Bike()
{
	
}
@Override
public String toString() {
	return "Bike [company=" + company + ", cc=" + cc + ", color=" + color + ", jbl=" + jbl + "]";
}

}
