
import java.util.Random;
import java.util.Scanner;
public class EmpWageComputation{
	static Scanner in=new Scanner(System.in);
	public static int getDailyWage(int wageper_Hr){
		int fullday_Hr=8;
		int dailyWage=wageper_Hr*fullday_Hr;
		return dailyWage;
	}
	public static int getPartTimeWage(int wageper_Hr){
		int partday_Hr=4;
		int partTimeWage=wageper_Hr*partday_Hr;
		return partTimeWage;

	}
	public static int checkEmployee(int ch,int wageper_Hr){
		final int isPartTime=2;
		final int isFullTime=1;
		switch(ch){
		case isPartTime :
			return getPartTimeWage(wageper_Hr);
		case isFullTime :
			return getDailyWage(wageper_Hr);
		default:
			return 0;
		}
	}
	public static void monthlyWage(String companyName,int wageper_Hr,int monthlyWorkingDays,int totalWorkingHrs){
		Random rand=new Random();
		int monthlyWage=0;
		int wage=0;
		int count=0;
		int workingHrs=0;
		while(count!=monthlyWorkingDays && workingHrs!=totalWorkingHrs){
			wage=checkEmployee(rand.nextInt(3),wageper_Hr);
			monthlyWage+=wage;
			count++;
		}
		System.out.println("monthly wage of "+companyName+" is "+monthlyWage);

	}
	public static void calculateEmpWage(){
		System.out.println("How many no of companies wages you want to calculate");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			in.nextLine();
			System.out.println("which company wage you want to calculate");
			String companyName=in.nextLine();
			System.out.println("Enter wage per hr");
			int wageper_Hr=in.nextInt();
			System.out.println("Enter total monthly days");
			int monthlyWorkingDays=in.nextInt();
			System.out.println("Enter total working hrs");
			int totalWorkingHrs=in.nextInt();
			monthlyWage(companyName,wageper_Hr,monthlyWorkingDays,totalWorkingHrs);
		}
	}
	public static void main(String[]args){
		calculateEmpWage();
		in.close();
	}

}
