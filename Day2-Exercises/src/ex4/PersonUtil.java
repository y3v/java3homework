package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonUtil {
	
	private static List<Person> people = 
			Arrays.asList(new Person("Cay", "Hornstrom"),new Person("David", "Geary"),new Person("Marty", "Hall"));
	
	
	public static Person getPerson(String first) {
		Person ret = null;
		//System.out.println(first);
		for (Person person : people) {
			//System.out.println(person.getName());
			if (person.getName().equals(first)) {
				ret = person;
			}
		}
		return ret;
	}
	
}
