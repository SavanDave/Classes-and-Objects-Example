
public class PlayWithClasses {

	public static void main(String[] args) {
	/*	int month, day, year;
		int anniversaryDay, anniversaryMonth, anniversaryYear;*/

		Date birthday = new Date (11, 16, 1960);	
		Date anniversary = new Date (3, 25, 1989);
		
/*		birthday.month = 19;
		birthday.day = 16;
		birthday.year = 1980;*/
		
		birthday.setMonth(11);
		
		System.out.println(birthday.toString());

		
	}

}
