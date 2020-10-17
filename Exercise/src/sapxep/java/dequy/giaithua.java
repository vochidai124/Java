package sapxep.java.dequy;

public class giaithua {
	public static void main(String[] args) {
		int a = 5;
//		System.out.println("Giai thừa của " + a + " là: " + tinhGiaithua(a));
		for(int i=0;i<10;i++){
			System.out.print(fibonacci(i)+" ");
		}
		int n=1234;
		System.out.println(daonguoc(n));
//		System.out.println(tongso(n));
		
	}
	public static int daonguoc(int n){
		int result=0;
		do{
			result=result*10+(n%10);
			n=n/10;
		}while(n>0);
		return result;
	}
	public static int tongso(int n){
		int total=0;
		do{
			total=total+(n%10);
			n=n/10;
		}while(n>0);
		return total;
	}
	public static int fibonacci(int n){
		if(n<0){
			return -1;
		}else if(n==0||n==1){
			return n;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static long tinhGiaithua(int n) {
		if(n>0){
			return n*tinhGiaithua(n-1);
		}else{
			return 1;
		}
	}
}
