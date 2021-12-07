package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		// 정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(21);

		Set<Integer> iSet = new HashSet<Integer>(); // <>에 기본자료형은 쓸 수 없음
		// 순서개념이 없어 실제 값으로 꺼내와야 함
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); // 자동 박싱
		iSet.add(i05); // 중복
		iSet.add(i06); // 중복

		iSet.remove(i06);
		iSet.remove(100); // int
		
		System.out.println("갯수: " + iSet.size());

		for (Integer no : iSet) {
			System.out.println(no.toString());
		}

		System.out.println(iSet.toString());
		
		System.out.println("=========================");
		// Point 관리
		Point p01 = new Point(4, 15);
		Point p02 = new Point(3, 12);
		Point p03 = new Point(6, 19);
		Point p04 = new Point(8, 28);

		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		pSet.remove(p04);

		System.out.println("갯수: " + pSet.size());

		for (Point p : pSet) {
			System.out.println(p.getX());
		}
		
		System.out.println(pSet.toString());
	}

}
