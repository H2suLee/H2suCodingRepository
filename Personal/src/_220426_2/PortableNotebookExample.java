package _220426_2;

public class PortableNotebookExample {

	public static void main(String[] args) {
		PortableNotebook portable = new PortableNotebook("한글 2020", "크롬", "영화", "안드로이드앱");
		portable.writeDocmentation();
		portable.watchVideo();
		portable.useApp();
		portable.searchInternet();
	}

}
