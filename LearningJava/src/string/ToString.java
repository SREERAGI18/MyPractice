package string;

public class ToString {

	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Sree");
		
		System.out.println(s1);

	}
}
	class Student{
		int rollNo;
		String name;
		public Student(int rollNo, String name) {
			
			this.rollNo = rollNo;
			this.name = name;
		}
//		@Override
//		public String toString() {
//			return "Student [rollNo=" + rollNo + ", name=" + name + "]";
//		}
		
		
	}
