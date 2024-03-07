import java.util.*;

class Assignment5{
/*
	void question1(){
		for (int i=1; i<=5;i++) {
			for (int j=1; j<=i;j++){
				System.out.print(j+" ");
			}
		System.out.println();
		}
	} 

	void question2(){
		for (int i=5; i>=1;i--) {
			for (int j=5; j>=i;j--){
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}


	void question4(){
		int[] array=new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values for Array: ");
		for (int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}

		for (int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("Sum of all elements: "+sum);
	}
	
	void printSpace(int n){
    		if(n > 0){
        		System.out.print(" ");
        		printSpace(n-1);
    		}
	}
	void question3(){
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int spaceCount=num-1;
		for (int i=1; i<=num;i++) {
			printSpace(spaceCount);
			for (int j=1; j<=i;j++){
				System.out.print(i+" ");
			}
		System.out.println();
		spaceCount--;
		}
	} 

	void question5(){
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int[] array=new int[5];
		for (int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		int largestElement=array[0];
		for (int j=0;j<array.length;j++){
			if (array[j] > array[0]) largestElement=array[j];
		}
		int secondLargestElement=array[0];
		for (int j=0;j<array.length;j++){
			if (array[j] > array[0] && array[j]!=largestElement) secondLargestElement=array[j];
		}
		System.out.println("Second Largest element is: "+secondLargestElement);
		
	}
	


	void question6(){
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int[] array=new int[5];
		for (int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Entered Array: ");
		for (int k=0;k<array.length;k++){
			System.out.print(array[k]+" ");
		}
		System.out.println("");

		int[] reverseArray=new int[5];
		int count=reverseArray.length-1;
		for (int j=0;j<reverseArray.length;j++){
			reverseArray[j]=array[count];
			count--;
		}
		System.out.println("Reverse of entered array: ");
		for (int l=0;l<reverseArray.length;l++){
			System.out.print(reverseArray[l]+" ");
		}
	}	

	void question7(){
		System.out.println("Enter numbers for first array: ");
		Scanner sc = new Scanner(System.in);
		int[] firstArray=new int[5];
		for (int i=0;i<firstArray.length;i++){
			firstArray[i]=sc.nextInt();
		}
		
		System.out.println("Enter numbers for second array: ");
		int[] secondArray=new int[5];
		for (int a=0;a<secondArray.length;a++){
			secondArray[a]=sc.nextInt();
		}

		System.out.println("First Array: ");
		for (int k=0;k<firstArray.length;k++){
			System.out.print(firstArray[k]+" ");
		}
		System.out.println("");

		System.out.println("Second Array: ");
		for (int b=0;b<secondArray.length;b++){
			System.out.print(secondArray[b]+" ");
		}
		System.out.println("");
		
		System.out.println("Common elements: ");
		for (int m=0;m<firstArray.length;m++){
			for (int n=0;n<firstArray.length;n++){
				if (firstArray[m]==secondArray[n])System.out.print(firstArray[m]+ " ");
			}
		}
	}
*/
	void question8(){
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int[] array=new int[7];
		for (int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for (int k=0;k<array.length;k++){
			System.out.print(array[k]+" ");
		}
		System.out.println("");

		
		int[] newArray=new int[7];

		for (int j=0;j<newArray.length;j++){
			for (int m=0;m<newArray.length;m++)
				if (array[j] != array[m]) newArray[j]=array[j];
		}
		System.out.println("Array without duplicates: ");
		for (int n=0;n<newArray.length;n++){
			System.out.print(newArray[n]+" ");
		}
		
		
	}
	
	public static void main(String args[]){
	Assignment5 ans=new Assignment5();
	//ans.question1();
	//ans.question2();
	//ans.question3();
	//ans.question4();
	//ans.question5();
	//ans.question6();
	//ans.question7();
	ans.question8();
	}
	
}

