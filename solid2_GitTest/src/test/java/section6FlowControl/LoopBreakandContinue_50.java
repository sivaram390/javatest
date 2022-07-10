package section6FlowControl;

public class LoopBreakandContinue_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				continue;
			}
		}

	}

}
