package _20220429_Teachers;

public class EngineeringCalculator extends Calculator {

	private String[] operatorList; // 입력받은 연산자 저장하는 배열
	private int operatorCount; // 입력받은 연산자 갯수

	@Override
	public void init() {
		numList = new double[5];
		numCount = -1;
		operatorList = new String[numList.length - 1];
		operatorCount = -1;
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[++numCount] = num;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자는 최대 5개까지 입력가능합니다.");
			numCount--;
		}
	}

	@Override
	public void print() {
		if(check()) {
			System.out.println("계산결과 : " + getCalResult());
		}
	}
	
	private boolean check() { // 숫자가 무조건 연산자보다 최소 1개 더 많아야 된다
		boolean result = false;
		if((operatorCount + 1) == numCount) {
			result = true;
		}else {
			System.out.println("현재까지 입력된 연산식을 확인해주세요.");
		}
		return result;
	}
	
	private double getCalResult() {
		double result = numList[0];
		for(int i=0; i<=operatorCount; i++) {
			switch(operatorList[i]) {
			case "+":
				result += numList[i+1];
				break;
			case "-":
				result -= numList[i+1];
				break;
			case "*":
				result *= numList[i+1];
				break;
			case "/":
				result /= numList[i+1];
				break;
			case "%":
				result %= numList[i+1];
				break;
			}
		}
		return result;
	}

	@Override
	public void plus() {
		try {
			operatorList[++operatorCount] = "+";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void subtract() {
		try {
			operatorList[++operatorCount] = "-";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void multiply() {
		try {
			operatorList[++operatorCount] = "*";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void division() {
		try {
			operatorList[++operatorCount] = "/";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void remain() {
		try {
			operatorList[++operatorCount] = "%";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void delete() {
		try {
			if (numCount > operatorCount) {
				numList[numCount--] = 0;
			} else {
				operatorList[operatorCount--] = null;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("더이상 삭제할 값이 없습니다.");
			init();
		}

	}
	
	@Override
	public void printMenu() {
		super.printMenu();
		getExpression();
	}
	
	private void getExpression() {
		String result = "";
		for(int i=0; i < numList.length; i++) {
			if(i<=numCount) {
				result += String.valueOf(numList[i]);
			}
			
			if(i<=operatorCount) {
				result += operatorList[i];
			}
		}
		
		System.out.println("현재 연산식 : " + result);
	}
}
