package Day3Programs;
class student{
	public String name = "Ansh";
	private int age = 21;
	protected String grade ="A+";
	String school = "CMS School";
	
	public void display() {
			System.out.println("NAME: "+name);
			System.out.println("Age: "+age);
			System.out.println("Marks: "+grade);
			System.out.println("School: "+school);
	}
}
public class AccessModifiers {
	public static void main(String[] args) {
		student s1 = new student();
		s1.display();
	
		
	}
}
