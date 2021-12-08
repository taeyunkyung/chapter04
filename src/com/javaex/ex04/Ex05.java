package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {

		Point p01 = new Point(5, 15); // 강동원
		Point p02 = new Point(6, 16); // 이정재
		Point p03 = new Point(9, 19); // 정우성

		Map<String, Point> pMap = new HashMap<String, Point>(); // key를 무엇으로 지정할 것인지

		pMap.put("강동원", p01);
		pMap.put("이정재", p02);
		// pMap.put("강동원", p03); 나중에 입력한 값으로 수정
		pMap.put("정우성", p03);

		System.out.println(pMap.toString());

		// System.out.println(pMap.get("강동원").getX());
		// System.out.println(pMap.size());

		// 키셋 구하기
		Set<String> kyes = pMap.keySet();
		for (String key : kyes) {
			System.out.println(pMap.get(key).getX());
		}
		
		// 게시판 만들기
		Map<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("regDate", "2021-12-08");
		boardMap.put("contents", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
	}

}
