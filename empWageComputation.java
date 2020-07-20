import java.util.Random;
public class empWageComputation{
	static int Wageper_Hr=20;
	public static void checkAttendance(){
		int isPresent=1;
		int isAbsent=0;
		Random rand=new Random();
		int r=rand.nextInt(2);
		if(r==isPresent){
			System.out.println("Employee is present");
			System.out.println("Employee daily wage is "+ getDailyWage());
			System.out.println("Employee Part Time wage is "+getPartTimeWage());
		}
		else{
			System.out.println("Employee is absent");
		}
	}
	public static int getDailyWage(){
		int Fullday_Hr=8;
		int dailyWage=Wageper_Hr*Fullday_Hr;
		return dailyWage;
	}
	public static int getPartTimeWage(){
		int Partday_Hr=4;
		int PartTimeWage=Wageper_Hr*Partday_Hr;
		return PartTimeWage;
	}
	public static void main(String[]args){
		System.out.println("welcome to employee wage computation");
		empWageComputation obj=new empWageComputation();
		obj.checkAttendance();
	}

}
