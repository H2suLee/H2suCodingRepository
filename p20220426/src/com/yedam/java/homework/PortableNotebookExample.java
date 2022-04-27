package com.yedam.java.homework;

public class PortableNotebookExample {

	public static void main(String[] args) {
		PortableNotebook info1 = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		info1.writeDocumentaion();
		info1.watchVideo();
		info1.useApp();
		info1.searchInternet();
		
//		NOTEBOOK_MODE
//		한글2020을 통해 문서를 작성.
//		영화를 시청.
//		TABLET_MODE
//		안드로이드앱을 실행.
//		크롬을 통해 인터넷을 검색.
	}

}
