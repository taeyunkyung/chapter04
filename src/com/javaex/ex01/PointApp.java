package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(5, 3);
		Point p02 = new Point(3, 7);

		// System.out.println(p01.toString());
		// System.out.println(p02.toString());

		PointList plist = new PointList();
		plist.add(p01);
		plist.add(p02);

		System.out.println(plist.get(0).getX());
		System.out.println(plist.get(0).toString());

		System.out.println(plist.get(1).getY());
		System.out.println(plist.get(1).toString());
		System.out.println(plist.size());

		Point p03 = new Point(100, 155);
		plist.add(p03);
		System.out.println(plist.size());
	}

}
