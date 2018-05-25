package com.ju.japro.structalg.two.app;

import com.ju.japro.structalg.two.ClassDataArray;
import com.ju.japro.structalg.two.Person;
import static com.ju.japro.structalg.two.util.Util.print;
import static com.ju.japro.structalg.two.util.Util.println;
public class ClassDataArrayApp {
	public static void main(String[] args) {
		int maxSize = 1000;
		ClassDataArray arr = new ClassDataArray(maxSize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("yee", "Tom", 43);
		arr.insert("Adams", "Henry", 63);
		arr.insert("Hashimoto", "Sat0", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Winh", 22);
		arr.insert("Creswell", "Lucinda", 18);
		
		arr.display();
		println("\n\n\n");
		String searchKey = "Stimson";
		Person found;
		found = arr.find(searchKey);
		if (found != null) {
			print("Found");
			found.displayPerson();
		} else 
			println("Can't find " + searchKey);
		println("Deleting Smith,Yee,and Creswell");
		
		arr.delete("yee");
		arr.delete("Stimson");
		arr.delete("Vang");
		
		arr.display();
	}
}