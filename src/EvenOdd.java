
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 6;
System.out.println(EvenOdd(a));
int b = 3;
System.out.println(EvenOdd(b));
int c = 8;
System.out.println(EvenOdd(c));
int d = 1;
System.out.println(EvenOdd(d));
	}
	
	public static boolean EvenOdd(int s){
		if(s%2==0){
			return true;
		}else{
			return false;
		}
	}

}

