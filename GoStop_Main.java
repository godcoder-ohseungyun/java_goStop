/**
 * 
 * @author user
 *
 */
public class GoStop_Main {

	public static void main(String[] args) {
		Obtained_Card obtainedCard = new Obtained_Card() ;
		
		int [] numbers = {1,9,45};
		for (int num: numbers) {
		obtainedCard.add(new Card(num));//매번 객체를 생성하는 것 이유는?? static맴버면수로 모든객체에서 변경된 값이 공통으로 저장되도록한다. 
		}
		for(int i=0;i<48;i++)
		{System.out.println(obtainedCard.card[i]);}
		
		System.out.println(obtainedCard.computeScore());

	}

}
