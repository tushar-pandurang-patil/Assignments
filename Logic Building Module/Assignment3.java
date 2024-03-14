class Assignment3{

	void question2(int result){
		if (result > 40){
			System.out.println("Result for "+(result)+" marks is passed \n");
		}
		else{
			System.out.println("Result for "+(result)+" marks is failed \n");
		}
	}

	void question4(){
		int number=10;
		for (number=10; number<15;number++){
		System.out.println("*");
		}
	}

	void question6(int i){
	System.out.println("Marks: "+i);
	switch(i){
		case 10:
			System.out.println("Congratulations you have full marks");
			break;

		case 9:
			System.out.println("Congratulations you have almost full marks");
			break;

		case 8:
			System.out.println("Congratulations you have done very well");
			break;

		case 7:
			System.out.println("Congratulations you have done well");
			break;

		case 6:
			System.out.println("You are doing alright but could study more");
			break;

		case 5:
			System.out.println("You only got half marks, you need to do more");
			break;

		case 4:
			System.out.println("You got less than half marks, you need to do more");
			break;

		case 3:
			System.out.println("You have got low marks, see a teacher");
			break;

		case 2:
			System.out.println("You have got very low marks, see a teacher");
			break;

		case 1:
			System.out.println("You only got 1 mark, see a teacher");
			break;

		default:
			System.out.println("You have failed abysmally");
			break;
		}
	}


	void question9(){
		for (int num=10; num<=20;num++){
		System.out.println(num);
		}
	}

	void question11(int userNumber){
		do {System.out.println("Number: "+userNumber);
			} while (userNumber!=0);
	}

	void question13(int num){
		for(int mul=1;mul<=10;mul++){
			System.out.println(num+" x "+mul+" = "+(mul*num)+"\n");
		}
	}

	void question14(int num){
		if(num==1) System.out.println("Factorial of 1 is 1 \n");
		else{	
			int fact=1;
			int n=num;
			while(n>0){
				fact*=n;
				n--;
				}
			System.out.println("Factorial of "+num+" is "+fact+"\n");
		}
	}

	void question15(int num){
		int digit,sum=0;
		int n=num;
		do{digit=n%10;
		sum+=digit;
		n/=10;
		}while(n>0);
		System.out.println("Sum of digits of number "+num+" is "+sum+"\n");
	}

	void question16(int num){
		if (num==1){
			System.out.println("1 is neither a prime number nor a composite number");
		}
		else if(num>=2){
			for (int n=2; n<num;n++){
				if (num%n==0) {System.out.println(num + " is not a prime number"); break;}
				else {System.out.println(num + " is a prime number");break;}
			}
		}
	}


	void question17(int num){
		switch(num){
		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;

		case 8:
			System.out.println("August");
			break;

		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;
		
		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Please enter number between 1 to 12");
			break;
		}
	}
	

	
	void question18(int firstNum, int secondNum, int operation){
		System.out.println("\n Simple Calculator \n -------------------------- \n Enter first number: "+firstNum+"\n Enter second number: "+secondNum+
		"\n \n Choose an operation: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n Enter your Choice: "+operation);
		
		switch(operation){
		case 1:
			System.out.println("Result: "+firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
			break;

		case 2:
			System.out.println("Result: "+firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
			break;

		case 3:
			System.out.println("Result: "+firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
			break;

		case 4:
			System.out.println("Result: "+firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
			break;
		default:
			System.out.println("Choose correct operation out of 1 to 4");
		}
	}


	public static void main(String args[]) {
	
		Assignment3 ans=new Assignment3();
		ans.question2(41);
		ans.question4();
		ans.question6(6);
		ans.question9();
		ans.question11(0);
		ans.question13(6);
		ans.question14(5);
		ans.question15(1234);
		ans.question16(10);
		ans.question17(3);
		ans.question18(5,7,3);
	}

}
