package myHashTable.studentManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Options op = new Options();
		System.out.println("=============Management Student Programing=============");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Name : ");
			String name = sc.nextLine();
			System.out.println("Classes : ");
			String classes = sc.nextLine();
			System.out.println("Math : ");
			double math = Double.parseDouble(sc.nextLine());
			System.out.println("Chemistry : ");
			double chemistry = Double.parseDouble(sc.nextLine());
			System.out.println("Physical : ");
			double physical = Double.parseDouble(sc.nextLine());
			
			op.addStudent(students, name, classes, math, chemistry, physical);
			op.display(students);
			
			HashMap<String, Double> mapStudent = op.getPercentTypeStudent(students);
			for(Map.Entry entry : mapStudent.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue() +"%");
			}
			
			System.out.println("Do you want to enter more sutdent information? Y/N");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N")) {
				System.out.println("BYE!!!");
				break;
			}
		}
	}
}
