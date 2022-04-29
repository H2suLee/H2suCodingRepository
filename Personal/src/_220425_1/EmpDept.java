package _220425_1;

public class EmpDept extends Employee{

	// 필드
	String dept;
	
	// 생성자
	public EmpDept(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}
	
	// 메소드
	@Override
	public void getInformation() {
		System.out.print("이름 : " + this.name + " 연봉 : " + this.salary + "  부서: " + this.dept + "\n" );
	}
	
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	

	

}
