/**
 * @class Card
 * @name 컴공 2017136064 오승윤
 * @project go-stop
 * @detail 해당하는 카드를 생성하는 클래스
 * - 1~48장의 카드중 해당하는 카드를 생성하고 범위에 벗어나는 요청은 예외처리한다.
 * - 맴버변수는 static으로 생성하여 모든 객체가 공통의 변수를 같도록한다.
 * - 생성한 카드는 맴버변수의 값을 1로 변경한다
 */
public class Card {
	static int[] card = new int[48];// "0"으로 자동 초기화 //생성한 객체 각각 에서 변경된 사안이 공통으로 변경되어야한다. 그러므로 static
	
	public Card(int num){
		try 
		{
			
		if(num<1 || num>48) throw new Exception("카드 생성 실패");//예외 고의 발생
		
		else card[num-1] = 1; //해당 카드를 생성하면 "1"로 값을 변경한다 [배열은 0부터 시작임으로 num-1로 위치를 지정해야한다]
		
		}catch(Exception e) {System.out.println("존재하지 않는 카드입니다.");}//예외 처리
    }	
}