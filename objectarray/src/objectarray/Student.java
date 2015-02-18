package objectarray;

public class Student 
{

	public static void main(String[] args) 
	{
		
		StudentPojo[] student= new StudentPojo[1];
			
		System.err.println(student.length);
		
		for (int i = 0; i < student.length; i++) 
		{
		
			student[i]=new StudentPojo();
			student[i].setId(123);
			student[i].setName("rahul");
			
			System.out.println("id"+student[0].getId()+"\n name: "+student[0].getName());
			
		}
				
		
	}
	
	
}
