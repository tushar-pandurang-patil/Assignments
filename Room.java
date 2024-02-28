class Room{
	double height;
	double width;
	double breadth;

	void volume(double height, double width, double breadth){
		double vol=(height*width*breadth);
		System.out.println("Volume of Room: "+vol);
	}

	public static void main(String args[]) {
	Room r1=new Room();
	r1.volume(10.2,20.2,30.4);
	}

}