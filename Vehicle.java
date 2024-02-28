class Vehicle{
	double price;
	String color;
	String model;
	
	Vehicle(){
		price=1000000;
		color="White";
		model="ABC";
	}

	Vehicle(double p, String c, String m){
		price=p;
		color=c;
		model=m;
	}
	
	void display(){
		System.out.println("Price of Car: "+price);
		System.out.println("Color of Car: "+color);
		System.out.println("Model of Car: "+model);
	}

	public static void main(String args[]) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle(2000000,"Black","DEF");
		v1.display();
		v2.display();
	}

}