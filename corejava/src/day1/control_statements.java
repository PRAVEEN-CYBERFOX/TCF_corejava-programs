package day1;

public class control_statements {

	public static void main(String[] args) {
		//1.If , If Else , Else If Ladder
		int Number = 15;
		if(Number>0) {
			System.out.println("The Number is Positive");
		}
		else if(Number<0) {
			System.out.println("The Number is Negative");
		}
		else {
			System.out.println("The Number is Zero");
		}
		
		
		//2.Switch Statement 
		int Day=5;
		switch(Day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		}
		
		//3.For Loop
		int Even=0;
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				Even+=i;
			}
		}
		System.out.println(Even);
		int Number2=2;
		int Sum=0;
		while(Number2<8) {
			Sum+=Number2;
			Number++;
		}
		int Number1=5,Add=0;
		do{
			Add+=Number1;
			Number1--;
		}while(Number1>0);
			int n=10;
		for(int i=0; true ;i++) {
			if(i>n) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
		}
	}