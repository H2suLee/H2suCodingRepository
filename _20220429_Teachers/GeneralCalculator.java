package _20220429_Teachers;

public class GeneralCalculator extends Calculator {

	@Override
	public void init() {
		numList = new double[2];
		numCount = -1; // = 0 을 해도 됨 대신 아래 input메소드에서는 ++numCount가 아니라 numCount++
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[++numCount] = num;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자는 최대 2개까지 입력가능합니다.");
			numCount--;
		}
	}

	@Override
	public void print() {
		System.out.print("현재까지 입력된 숫자 : ");
		for(int i=0; i <= numCount; i++) {
			System.out.print(numList[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void plus() {
		if(check()) {
			System.out.printf("+ : %.1f\n", numList[0] + numList[1]);
		}
	}

	@Override
	public void subtract() {
		if(check()) {
			System.out.printf("- : %.1f\n", numList[0] - numList[1]);
		}
	}

	@Override
	public void multiply() {
		if(check()) {
			System.out.printf("* : %.1f\n", numList[0] * numList[1]);
		}
	}

	@Override
	public void division() {
		if(check()) {
			System.out.printf("/ : %.1f\n", numList[0] / numList[1]);
		}
	}

	@Override
	public void remain() {
		if(check()) {
			System.out.printf("%% : %.1f\n", numList[0] % numList[1]);
		}
	}

	@Override
	public void delete() {
		try {
			numList[numCount--] = 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("더이상 삭제할 숫자가 없습니다.");
			init(); // numCount++ 로 대체 가능
		}
	}
	
	private boolean check() {
		boolean result = false;
		if((numCount+1) == numList.length) {
			result = true;
		}else {
			System.out.println("숫자를 더 입력해주세요.");
		}
		return result;
	}

}

