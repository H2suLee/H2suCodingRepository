package _220426_2;
// 구현 클래스
public class PortableNotebook implements Tablet, Notebook {
	
	// 필드
	int mode;
	String document;
	String internet;
	String video;
	String app;
	
	
	public PortableNotebook(String document, String internet, String video, String app) {
		super();
		this.mode = Notebook.NOTEBOOK_MODE;
		this.document = document;
		this.internet = internet;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}

	@Override
	public void writeDocmentation() {
		System.out.println(this.document +"를 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(this.internet+"를 이용하여 인터넷을 검색.");
	}

	@Override
	public void watchVideo() {
		System.out.println(this.video+"를 시청.");
	}

	@Override
	public void useApp() {
		if(this.mode==Notebook.NOTEBOOK_MODE) {
			changeMode();
		} 
		System.out.println(this.app+"를 실행");
	}
	
	public void changeMode() {
		if(this.mode==Notebook.NOTEBOOK_MODE) {
			this.mode=Tablet.TABLET_MODE;
			System.out.println("TABLET_MODE");
		} else if(this.mode==Tablet.TABLET_MODE) {
			this.mode=Notebook.NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}  
	}

}
