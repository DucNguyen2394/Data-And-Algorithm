package myHashTable.studentManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Options {

	public void addStudent(
			ArrayList<Student> students,
			String name,
			String classes,
			Double math,
			Double chemistry,
			Double physical) 
	{
		students.add(new Student(name,classes,math,chemistry,physical));
	}
	
	public void display(ArrayList<Student> students) {
		for(Student std : students) {
			int i = 1;
			System.out.println("========Student" + i++ + "infomation========");
			System.out.println("Name " + std.getName());
			System.out.println("Class name " + std.getClassName());
			System.out.println("Math " + std.getMath());
			System.out.println("Physical " + std.getPhysical());
			System.out.println("Chemistry " + std.getChemistry());
		}
	}
	
	public HashMap<String, Double> getPercentTypeStudent(ArrayList<Student> students){
		HashMap<String, Double> hashMap = new HashMap<>();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int totalStudent = students.size();
		
		for(Student std : students) {
			if(std.getAvg() > 7.5 ) {
				countA ++;
			}else if(std.getAvg() >= 6) {
				countB ++;
			}else if(std.getAvg() >= 4) {
				countC ++;
			}else {
				countD ++;
			}
		}
		System.out.println("========Percent Student's Point========");
		hashMap.put("A",countA/totalStudent  * 100.0);
		hashMap.put("B",countB/totalStudent  * 100.0);
		hashMap.put("C",countC/totalStudent  * 100.0);
		hashMap.put("D",countD/totalStudent  * 100.0);
		return hashMap;
	}
}
