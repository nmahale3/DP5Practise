package day22.arrayofobject;


public class MyDate3 {
	
	int day, month, year;

	public MyDate3(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date d" + day + ", month=" + month + ", year=" + year + " ";
	}

}
