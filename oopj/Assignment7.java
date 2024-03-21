package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {


	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};                 //question1
		System.out.print("Array 1: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");  
		}
		System.out.println();
		int[] arr1={1,2,3,4,5,6};
		System.out.print("Array 2: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Array 1 == Array 2 ? "+Arrays.equals(arr,arr1)); //question2
		
		
		
		System.out.println();     
		int[] arr2= {1,5,3,8,3,6,0,4,2,9,12};        //question3
		int sum=8;
		System.out.println("Integer Array: ");
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();					
		System.out.println("Pairs of elements in an integer array whose sum is equal to "+sum);
		for (int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if((i+j)==sum) {
					System.out.print("("+i+", "+j+") ");
				}
			}
		}
		

		System.out.println("\nReversed Array: ");  //question4
		int[] temp=new int[arr2.length];
		int index=0;
		for (int i=arr2.length-1;i>=0;i--) {
			temp[index]=arr2[i];
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		int min=arr2[0];      //question5
		int max=arr2[0];
		for (int i=0;i<arr2.length;i++) {
			if(arr2[i]<min) {
				min=arr2[i];
			}
			else if(arr2[i]>max) {
				max=arr2[i];
			}
		}
		System.out.println("\nSmallest Number: "+min);
		System.out.println("Largest Number: "+max);
		
		
		int secondMax=arr[0];    //question6
		int thirdMax=arr[0];
		for (int i=0;i<arr2.length;i++) {
			if(arr2[i]>secondMax && arr2[i]<max) {
				secondMax=arr2[i];
			}
		}
		for (int i=0;i<arr2.length;i++) {
			if(arr2[i]>thirdMax && arr2[i]<secondMax) {
				thirdMax=arr2[i];
			}
		}
		System.out.println("2nd Largest Number: "+secondMax);
		System.out.println("3rd Largest Number: "+thirdMax);
		System.out.println();
		
		
		
		
		int[] firstarr={23,60,94,3,102};   //question7
		int[] secondarr={42,16,74};
		int[] mergedarr= new int[firstarr.length+secondarr.length];
		System.out.println("First Array: ");
		for (int i=0;i<firstarr.length;i++) {
			System.out.print(firstarr[i]+" ");
		}
		System.out.println();
		System.out.println("Second Array: ");
		for (int i=0;i<secondarr.length;i++) {
			System.out.print(secondarr[i]+" ");
		}
		System.out.println();
		int index1=0;
		for(int i=1;i<mergedarr.length;i+=2) {
			mergedarr[i]=secondarr[index1];
			index1++;
			if(index1==secondarr.length)break;
		}
		int index2=0;
		for(int i=0;i<mergedarr.length;i+=2) {
			mergedarr[i]=firstarr[index2];
			index2++;
			if(index2==secondarr.length)break;
		}
		int index3=secondarr.length;
		for (int i=secondarr.length*2;i<mergedarr.length;i++) {
			mergedarr[i]=firstarr[index3];
			index3++;
		}
		System.out.println("Merged Array: ");
		for (int i=0;i<mergedarr.length;i++) {
			System.out.print(mergedarr[i]+" ");
		}
		System.out.println();
		
		
		
		
		System.out.println();
		System.out.println("Input Array: ");    //question8
		int[] input= {5,14,35,89,140};
		for (int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		int[] output=new int[input.length-2];
		int avg=0;
		for (int i=0;i<output.length;i++) {
			avg=(input[i]+input[i+1]+input[i+2])/3;
			output[i]=avg;
		}
		System.out.println("Running average of 3 consecutive integers: ");
		for (int i=0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		System.out.println();         
		System.out.println("Series: ");       //question9
		int seriesCount=6;
		int[] series=new int[seriesCount];
		for (int i=0;i<series.length;i++) {
			if((i+1)%2==0) {
				series[i]=(i+1)*(i+1);
			}
			else if((i+1)%2!=0) {
				series[i]=(i+1)*(i+1)*(i+1);
			}
		}
		for (int i=0;i<series.length;i++) {
			System.out.print(series[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		System.out.println();
		System.out.println("Input Array: ");       //question10
		Scanner sc =new Scanner(System.in);
		int[] inputArr=new int[5];
		for(int i=0;i<inputArr.length;i++) {
			inputArr[i]=sc.nextInt();
		}
		boolean asc=false;
		boolean desc=false;
		for (int i=0;i<inputArr.length-1;i++) {
			if(inputArr[i]<inputArr[i+1]) asc=true;
			else if(inputArr[i]>inputArr[i+1]) desc=true;
			else if(asc && desc) break;
		}
		if(asc && !desc) System.out.println("Order: Ascending");
		else if(desc && !asc) System.out.println("Order: Descending");
		else System.out.println("Order: Random");
		
		
	}

}
