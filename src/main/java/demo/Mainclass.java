package demo;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m=new Mobile();
		m.setBrand("oneplus");
        m.setRam(16);
        m.setColor("black");
        m.setPrice(56000);
        m.setSim(new Airtle());
       
        System.out.println(m);
	}

}
