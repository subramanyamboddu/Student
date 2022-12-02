public class Student1 {
	private int id;
	private String name;
	private int marks ;
	
	Student1(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void displayDetails () {
		System.out.print("student id:"+id);
		System.out.print("student name:"+name);
		System.out.print("student marks:"+marks);
	}
	


	public static void main(String[] args) {
		Student1 s=new Student1(101, "subbu",100);
		System.out.println(s);
	}
}

