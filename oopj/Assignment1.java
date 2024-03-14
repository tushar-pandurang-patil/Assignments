import java.util.Scanner;
import java.lang.String;
class Assignment1{

    void question1(){
        System.out.println("Enter numerical grade out of 1,2,3,4,5: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num==1){
            System.out.println("Letter grade: A");
        }
        else if (num==2){
            System.out.println("Letter grade: B");
        }
        else if (num==3){
            System.out.println("Letter grade: C");
        }
        else if (num==4){
            System.out.println("Letter grade: D");
        }
        else if (num==5){
            System.out.println("Letter grade: E");
        }
        else{
            System.out.println("Incorrect numerical grade entered");
        }
    }


    void question2(){
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        int leapYear=1;
        if (year%4==0){
            leapYear=2;
            if (year%100==0){
                if(year%400==0){
                    leapYear=2;
                }
                else{
                    leapYear=1;
                }
            }
        }
        switch(leapYear){
            case 1:
                System.out.println("Entered year is not a leap year");
                break;
            case 2:
                System.out.println("Entered year is a leap year");
                break;
        }
    }

    void question3(){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
        int firstNum=sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum=sc.nextInt();
        System.out.println("Choose an operator: \n \"+\" for Addition \n \"-\" for Subtraction \n \"*\" for Multiplication \n \"\\\" for Division \n Enter your Choice: ");
        char operator=sc.next().charAt(0);
        
		switch(operator){
		case '+':
			System.out.println("Result: "+firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
			break;

		case '-':
			System.out.println("Result: "+firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
			break;

		case '*':
			System.out.println("Result: "+firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
			break;

		case '/':
			System.out.println("Result: "+firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
			break;
		default:
			System.out.println("Choose correct operation out of (+, -, *, /) ");
		}


	}


void question4(){
        System.out.println("Enter weekday in number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        switch(num){
        case 1:
            System.out.println("Sunday");
            break;

        case 2:
            System.out.println("Monday");
            break;

        case 3:
            System.out.println("Tuesday");
            break;

        case 4:
            System.out.println("Wednesday");
            break;

        case 5:
            System.out.println("Thursday");
            break;

        case 6:
            System.out.println("Friday");
            break;

        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Please enter number between 1 to 7");
            break;
        }
    }


    void question5(){
        System.out.println("Enter a character: ");
        Scanner in = new Scanner(System.in);
        String input = in.next().toLowerCase();
        int num=(int)input.charAt(0);
        char c=input.charAt(0);
        if (input.length() == 1 && num > 64 && num < 90 || num > 96 && num < 123){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
            || c == 'u') 
            System.out.println("Vowel"); 
            else
            System.out.println("Consonant");
        }
        else {
            System.out.println("Enter a character between a and z or A and Z");
        }
    }

    void question6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in meters: ");
        float height=sc.nextFloat();
        System.out.println("Enter weight in kilograms: ");
        float weight=sc.nextFloat();
        float bmi=weight/(height*height);
        System.out.println("BMI: "+bmi);
        if (bmi<18.5f){
            System.out.println("Underweight");
        }
        else if (bmi>=18.5f && bmi<=24.9f){
            System.out.println("Normal weight");
        }
        else if (bmi>=25.0f && bmi<=29.9f){
            System.out.println("Overweight");
        }
        else if (bmi>=31.0f){
            System.out.println("Obese");
        }
    }

    
    public static void main(String[] args){
        Assignment1 ans=new Assignment1();
        ans.question1();
        ans.question2();
        ans.question3();
        ans.question4();
        ans.question5();
        ans.question6();

    }
}