import java.util.Random;
public class empWageComputation{
	public static void checkAttendance(){
		int isPresent=1;
		int isAbsent=0;
		Random rand=new Random();
		int r=rand.nextInt(2);
		if(r==isPresent){
			System.out.println("Employee is present");
			System.out.println("Employee daily wage is"+ getDailyWage());
		}
		else{
			System.out.println("Employee is absent");
		}
	}
	public static int getDailyWage(){
		int Wageper_Hr=20;
		int Fullday_Hr=8;
		int dailyWage=Wageper_Hr*Fullday_Hr;
		return dailyWage;
	}
	public static void main(String[]args){
		System.out.println("welcome to employee wage computation");
		empWageComputation obj=new empWageComputation();
		obj.checkAttendance();
	}

}
