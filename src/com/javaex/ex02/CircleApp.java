package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		CircleList clist = new CircleList();
		clist.add(c01);
		clist.add(c02);
		System.out.println(clist.toString());
		
		System.out.println(clist.get(0).toString());
		System.out.println(clist.get(1).toString());
		System.out.println(clist.size());
		
		Circle c03 = new Circle(7);
		clist.add(c03);
		System.out.println(clist.size());

	}

}
