package com.javaex.ex04;

import java.util.Objects;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return x + y; // 더 복잡하게 만들면 1단계에서 거를 수 있음, 이클립스에서 정의한 것
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		} else {
			return false;
		}
	}

}
