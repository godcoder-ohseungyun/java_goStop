/**
 * 
 * @author user
 *
 */
public class Card {
	int[] card = new int[48];// "0"으로 자동 초기화
	
	public Card(int num) throws Exception {
		if(num<=0 || num>48) throw new Exception("카드 생성 실패");
		
		else card[num] = 1; //해당 카드를 생성하면 "1"로 값을 변경한다 
	}
}
