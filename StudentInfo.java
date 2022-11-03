
public class StudentInfo {
	private String name;
	private int age;
	private String major;
	private String hobby;
	private double expected_GPA;
	private int spent_time_learn_JAVA;
	
	//Constructor
	public StudentInfo(String name, int age, String major, String hobby, 
			double expected_GPA, int spent_time_learn_JAVA) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.hobby = hobby;
		this.expected_GPA = expected_GPA;
		this.spent_time_learn_JAVA = spent_time_learn_JAVA;
	}
	
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public double getGPA() {
		return expected_GPA;
	}
	
	public int getTime() {
		return spent_time_learn_JAVA;
	}
	
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void setGPA(double expected_GPA) {
		this.expected_GPA = expected_GPA;
	}
	
	public void setTime(int spent_time_learn_JAVA) {
		this.spent_time_learn_JAVA = spent_time_learn_JAVA;
	}
	
	
	//Function
	public boolean HonorsEligible() {
		if (expected_GPA >= 3.5) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student = new StudentInfo ("Ethan", 18, "CS", 
				"Pixel art", 3.0, 2);
		
		System.out.println("Student");
		System.out.println("name: " + student.name);
		System.out.println("age: " + student.age);
		System.out.println("major: " + student.major);
		System.out.println("hobby: " + student.hobby);
		System.out.println("expected GPA: " + student.expected_GPA);
		System.out.println("time spent learning JAVA: " +
		student.spent_time_learn_JAVA);
		
		System.out.println("honors eligible: " + student.HonorsEligible());
	}

}
