/**
 * 
 * @author user
 *
 */
public class Card {
	static int[] card = new int[48];// "0"으로 자동 초기화 //생성한 객체 각각 에서 변경된 사안이공통으로 변경되어야한다. 그러므로 static
	
	public Card(int num){
		try 
		{
			
		if(num<1 || num>48) throw new Exception("카드 생성 실패");
		
		else card[num-1] = 1; //해당 카드를 생성하면 "1"로 값을 변경한다 [배열은 0부터 시작임으로 num-1로 위치를 지정해야한다]
		
		}catch(Exception e) {System.out.println("존재하지 않는 카드입니다.");}
    }	
}