package co.micol.miniprj.draft2_1;

public class Ending {
	public static void summary() {
		System.out.println(Puppy.p[0].name + "의 하루가 끝났습니다.");
		System.out.println(Puppy.p[0].name + "는 귀엽지만" + stateSummary() + "강아지네요.");
	}
	
	public static String stateSummary() {
		String sum = null;
		if(State.happy ==0) {
			sum = "불행한 ";
		} 
		if(State.clean == 0) {
			sum = "지저분한 ";
		}
		if(State.hp == 0) {
			sum = "피곤한 ";
		}
		if(State.hunger == 0) {
			sum = "배고픈 ";
		}
		return sum;
		
	}
}
