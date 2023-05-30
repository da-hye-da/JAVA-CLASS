package j0522;

//삼각형 - 점이 3개가 필요
public class Triangle extends Shape {
	Point[] p;
	
	Triangle(Point[]p){
		this.p = p;
	}
	Triangle(Point p1, Point p2, Point p3){
		//point[] p = {p1,p2,p3}
		p = new Point[] {p1,p2,p3};
	}
	Triangle t1 = new Triangle(p);
	Triangle t2 = new Triangle(p[0],p[1],p[2]);
	Triangle []t1;
	Triangle(){};
	
	
}
