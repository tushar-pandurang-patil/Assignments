class Box{
	double height;
	double width;
	double breadth;
	
	Box(){
		height=1;
		width=2;
		breadth=3;
	}

	Box(double h, double w, double b){
		height=h;
		width=w;
		breadth=b;
	}
	
	double getVolume(){
		double volume=(height*width*breadth);
		return volume;
	}

	double getArea(){
		double area=(width*breadth);
		return area;
	}

	public static void main(String args[]) {
		Box b1=new Box();
		Box b2=new Box(12,34,56);
		System.out.println("Box 1 Volume: "+b1.getVolume());
		System.out.println("Box 1 Area: "+b1.getArea());
		System.out.println("Box 2 Volume: "+ b2.getVolume());
		System.out.println("Box 2 Area: "+b2.getArea());
	}
}