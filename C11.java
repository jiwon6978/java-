package CH01;



class Buyer{
	private int myMoney;
	private int appleCnt;
	
	
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;}

	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";}
	
	public void payment (Seller 사과장수 ,int money) {
		myMoney -= money;
		int cnt = 사과장수.receive(money);
		this.appleCnt +=cnt;
	}
		
		
}

class Seller{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	public Seller(int myMoney, int appleCnt,int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;}

	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}

	//사과개수
	public int receive(int money) {
		myMoney += money;
		int cnt = money / price;   
		appleCnt -= cnt;
		return cnt;
	}
	
}




public class C11 {

	public static void main(String[] args) {
		//객체 생성
		Buyer 홍길동 = new Buyer(10000,0);
		Buyer 티모 = new Buyer(20000,0);
		Seller 사과장수1 = new Seller(50000,100,1000);
		
		//함수실행
		홍길동.payment(사과장수1, 3000);
		티모.payment(사과장수1, 8000);
		
		System.out.println(홍길동);
		System.out.println(티모);
	}

	
	
	
	
	
	
	
	
	
}
