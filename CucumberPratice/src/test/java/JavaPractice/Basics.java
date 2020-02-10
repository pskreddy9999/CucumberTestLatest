package JavaPractice;

public class Basics {
	
	public static void main(String[] args) {
		
		Class cl = Basics.class;
		System.out.println(cl.getClassLoader());
		System.out.println(cl.getDeclaredClasses());

		System.out.println(String.class.getClassLoader());
	}
      
}
