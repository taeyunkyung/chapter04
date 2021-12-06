package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		// point 관리
		Point p01 = new Point(4, 7);
		Point p02 = new Point(8, 16);

		MyList<Point> plist = new MyList<Point>();
		plist.add(p01);
		plist.add(p02);
		// System.out.println(plist.get(0).toString());
		System.out.println(plist.toString());

		// circle 관리
		Circle c01 = new Circle(5);
		
		
		MyList<Circle> clist = new MyList<Circle>();
		clist.add(c01);
		// clist.add(p01);
		System.out.println(clist.get(0).getRadius()); // 다운캐스팅 불필요
		System.out.println(clist.toString());
	}

}
