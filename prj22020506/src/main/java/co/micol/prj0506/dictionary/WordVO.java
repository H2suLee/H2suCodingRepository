package co.micol.prj0506.dictionary;

public class WordVO {

	private String eng;
	private String kor;

	public WordVO() {

	}

	public WordVO(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {

		System.out.println(this.kor);
		return null;
	}

}
