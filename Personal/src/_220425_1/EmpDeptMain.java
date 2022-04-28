package _220425_1;

public class EmpDeptMain {
	public static void main(String[] args) {
		EmpDept employee = new EmpDept("이지나", 3000, "교육부");
		//Employee empInfo = new EmpDept("이지나", "교육부", 3000); //처럼 자동 변환 방식으로 해도 됨
		employee.getInformation();
		employee.print();
	}

}
