import java.util.Scanner;
class Lesson15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		if(first.equals(second)){
			System.out.println("同じ値です");
		}else{
			System.out.println("違う値です");
		}
	}
}