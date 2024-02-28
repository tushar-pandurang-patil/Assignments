class Condition{
	public static void main(String args[]) {
	int result=41;
	if (result > 40){
		System.out.println("passed");
		}
	else{
		System.out.println("failed");
		}



	for (int number=10; number<15;number++){
		System.out.println("*");
		}



	int i=10;
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
}