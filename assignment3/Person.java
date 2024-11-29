package assignment3;

public class Person {
	String name;
	int age;
	
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		Person p = new Person("nithin",22);
		Person p1 = new Person("deeks",12);
	}

}
