package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// HashSet을 이용하여 로또 자동 생성
		
		/* Set<Integer> lotto = new HashSet<Integer>(); 
		 * for (int i = 0; i < 6; i++) {
		 * 		lotto.add((int) (Math.random() * 45) + 1); 
		 * }
		 * System.out.println(lotto.toString());
		 */

		Set<Integer> minilotto = new HashSet<Integer>();
		while (true) {

			if (minilotto.size() >= 6) {
				break;
			}

			int num = (int) (Math.random() * 45) + 1;
			System.out.println("생성된 숫자: " + num); // 실험
			minilotto.add(num);

		}

		for (int i : minilotto) {
			System.out.print(i + "  ");
		}
	}

}
