package myHashTable.studentManagement;

public class Student {

	private String name;
	private String className;
	private double math;
	private double physical;
	private double chemistry;
	
	public Student() {}

	public Student(String name, String className, double math, double physical, double chemistry) {
		super();
		this.name = name;
		this.className = className;
		this.math = math;
		this.physical = physical;
		this.chemistry = chemistry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysical() {
		return physical;
	}

	public void setPhysical(double physical) {
		this.physical = physical;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	
	public String getType(double avg) {
		if(avg > 7.5) {
			return "A";
		}else if(avg >= 6 && avg <= 7.5) {
			return "B";
		}else if(avg >= 4) {
			return "C";
		}else {
			return "D";
		}
	}
	
	public double getAvg() {
		return (math + chemistry + physical) / 3;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Class name : " + className);
		double avg = (math + physical + chemistry) /3;
		System.out.println("AVG point : " + avg);
		System.out.println("Type : " + getType(avg));
	}
}
