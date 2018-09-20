
public class Student {
 
	public String name;
	public int age ;
	public void information (String name , int age ) {
		this.name = name ;
		this .age= age ;
		
		
	}
	public static void main(String[] args) {
		Student Thibault = new Student();
		Thibault.age=15;
		Thibault.name= "Thibault" ;
		Thibault.information("Thibault",15);
		
		System.out.println(Thibault.age+ "    "+Thibault.name );

	}

}
