package Day3Programs;
import java.util.*;
class Car{
	String Brand;
	Car(){
		Brand="Aadi";
	}
	void mycar() {
		System.out.println("My Car Brand is:"+Brand);
	}
}
public class Constructor {
	public static void main(String[] agrs) {
		Car c1=new Car();
		c1.mycar();
	}

}
