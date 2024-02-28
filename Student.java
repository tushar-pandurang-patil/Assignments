class Student{
	String name;
	int subjectA;
	int subjectB;
	int subjectC;
	int average;

	void initialValues(String n, int A, int B, int C){
		name=n;
		subjectA=A;
		subjectB=B;
		subjectC=C;
	}

	int totalAverage(){
		int avg=(subjectA+subjectB+subjectC)/2;
		average=avg;
		return avg;
	}

	void displayMarks(){
		System.out.println("Student's name: "+name);
		System.out.println("Total marks: "+average);
	}

	public static void main(String args[]) {
		Student s=new Student();
		s.initialValues("ABC",20,30,40);
		s.totalAverage();
		s.displayMarks();
	}
	
}