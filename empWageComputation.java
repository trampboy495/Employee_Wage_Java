public class empWageComputation{
	public static void checkAttendance(){
		int isPresent=1;
		int isAbsent=0;
		int r=(int)(Math.random()/2);
		if(r==isPresent){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
	public static void main(String[]args){
		System.out.println("welcome to employee wage computation");
		empWageComputation obj=new empWageComputation();
		obj.checkAttendance();
	}

}
