/**
 * @class GoStop_Main
 * @name 컴공 2017136064 오승윤
 * @project go-stop
 * @detail Testcode 
 */
public class GoStop_Main {

	public static void main(String[] args) {
		Obtained_Card obtainedCard = new Obtained_Card() ;
		
		int [] numbers = {1,9,45,2,6,10};//획득한 카드 =>비광,홍단
		for (int num: numbers) {
		obtainedCard.add(new Card(num));//매번 객체를 생성하는 것 이유는?? static맴버면수로 모든객체에서 변경된 값이 공통으로 저장되도록한다. 
		}
		System.out.println("보유 카드: ");
		
		for(int i=0;i<48;i++)
		{
			if(obtainedCard.card[i]==1) System.out.println((i+1)+" 번 카드");//보유카드가 몇번째 카드인지 출력
		}
		
		System.out.println("획득점수: "+obtainedCard.computeScore());//산출 점수

	}

}
