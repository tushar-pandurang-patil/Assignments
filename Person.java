class Person{
	int age;
	int height;
	int weight;
	
	Person(){
		age=10;
		height=170;
		weight=70;
	}

	Person(int a, int h, int w){
		age=a;
		height=h;
		weight=w;
	}
	
	void display(){
		System.out.println("Age of person: "+age);
		System.out.println("Height of person: "+height);
		System.out.println("Weight of person: "+weight);
	}
	
	public static void main(String args[]) {
		Person p1=new Person();
		Person p2=new Person(20,150,60);
		p1.display();
		p2.display();
	}
}