package co.micol.dto;

import java.sql.Date;

//공지사항 클래스 
//
//순번 int
//작성자 string
//제목 string
//내용 stirng
//작성 일자 date
//조회수 int

public class NoticeVO {
	
	private int id;
	private String writer;
	private String title;
	private String content;
	private Date wdate;
	private int hit;
	
	public NoticeVO() {
		
	}
	
	public int getId() {
		return id;
	}
	public String getWriter() {
		return writer;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Date getWdate() {
		return wdate;
	}
	public int getHit() {
		return hit;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	// 출력을 위해 toString 객체 오버라이드
	@Override
	public String toString() {
		System.out.print(this.id + " : ");
		System.out.print(this.writer + " : ");
		System.out.print(this.title + " : ");
		System.out.print(this.content + " : ");
		System.out.print(this.wdate + " : ");
		System.out.println(this.hit);
		return null;
	}
	

}
