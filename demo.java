class box{
	double width;
	double height;
	double depth;

box(double w, double h,double d){
	width=w;
	height=h;
	depth=d;
}
double volume(){
	return width*height*depth;	
	}
}
class demo{
	public static void main(String[] args) {
		box mybox1=new box(10,20,30);
		box mybox2=new box(3,6,9);
		double vol;
		vol=mybox1.volume();
		System.out.println(vol);
		vol=mybox2.volume();
		System.out.println(vol);
	}
}