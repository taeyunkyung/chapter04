package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		Point p01 = new Point(3, 13);
		Point p02 = new Point(7, 17);
		Point p03 = new Point(5, 15);

		List<Point> pList = new ArrayList<Point>();
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		// 갯수출력
		System.out.println(pList.size());

		// 관리되고 있는 Point에 접근
		System.out.println(pList.get(1).getY());

		// 전체출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println("==========================");

		// 데이터 지우기
		pList.remove(1);
		// pList.remove(p02);
		System.out.println(pList.size());
		System.out.println(pList.get(1).toString());

		System.out.println("==========================");

		// 원하는 위치에 입력
		pList.add(1, p02);
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println("==========================");

		// ArrayList의 toString (재정의 됨)
		System.out.println(pList.toString());

		System.out.println("==========================");

		// 향상된 for문 (처음부터 끝까지 돌릴 때만)
		for (Point p : pList) { // 하나 담을 그릇 : 전체
			System.out.println(p.getX());
		}
	}

}
