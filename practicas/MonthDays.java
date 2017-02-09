import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public static void main MonthDays(){

String month;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Program that says the number of days in a month when you type the name of the month");
month=String.parseInt(br.readLine());


		switch (month) {
		case "january":
			System.out.println("30");
			break;
			case "january":
			System.out.println("28");
			break;
			case "march":
			System.out.println("30");
			break;
			case "apri":
			System.out.println("31");
			break;
			case "may":
			System.out.println("30");
			break;
			case "june":
			System.out.println("31");
			break;
			case "july":
			System.out.println("30");
			break;
			case "august":
			System.out.println("30");
			break;
			case "september":
			System.out.println("31");
			break;
			case "october":
			System.out.println("30");
			break;
			case "november":
			System.out.println("31");
			break;
		case "december":
			System.out.println("31");
			break;
		default:
			System.out.println("INVALID MONTH CODE");
		}
	}
	
