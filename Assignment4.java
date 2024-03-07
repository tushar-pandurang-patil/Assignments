import java.util.*;

class Assignment4{
	
	void question1(){
		int array[]={5,4,3,9,1,7,9};
		double sum=0;
		for (double element:array)
			sum+=element;
		double avg=(sum/array.length);
		System.out.println("Average: "+avg);
	}
	

	void question2(){
		int array[]={5,4,3,9,1,7,9};
		int min=array[0];
		int max=array[0];
		int num;
		for (int element:array){
				if(element>max)max=element;
			}
		for (int element:array){
				if(element<min)min=element;
			}
		

		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}

	void question3(){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if (n>0){
			int sum=0;
			int arr[]=new int[n/2];
			for (int a=0;a<(n/2);a++){
				arr[a]=a*2;
			}
			int t=0;
			for (int i=0;i<arr.length;i++){
				t=2*(i-1);
				if (t%3==0)sum+=t;
			}
			System.out.println(sum);
		}
		else{System.out.println("Please enter a positive integer");}
	}

	void question4(){
		int[][] matrix1= new int[3][3];
		int[][] matrix2= new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values for Matrix 1: ");
		for (int i=0;i<matrix1.length;i++){
			for (int j=0;j < matrix1[i].length; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter values for Matrix 2: ");
		for (int i=0;i<matrix2.length;i++){
			for (int j=0;j < matrix2[i].length; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		int[][] result= new int[3][3];
		for (int i=0;i<result.length;i++){
			for (int j=0;j < result[i].length; j++){
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}

		for (int i=0;i<result.length;i++){
			for (int j=0;j < result[i].length; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void question5(){
		int[][] matrix1= new int[2][2];
		int[][] matrix2= new int[2][2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values for Matrix 1: ");
		for (int i=0;i<matrix1.length;i++){
			for (int j=0;j < matrix1[i].length; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter values for Matrix 2: ");
		for (int i=0;i<matrix2.length;i++){
			for (int j=0;j < matrix2[i].length; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		outerLoop:
		for (int i=0;i<matrix2.length;i++){
			for (int j=0;j < matrix2[i].length; j++){
				if (matrix1[i][j]!=matrix2[i][j]) 
					{System.out.println("Matrices are not equal");
					break outerLoop;}
				else continue;
			}
		}
		


	}

	public static void main(String args[]){
		Assignment4 ans=new Assignment4();
		ans.question1();
		ans.question2();
		ans.question3();
		ans.question4();
		ans.question5();
		
	}

}