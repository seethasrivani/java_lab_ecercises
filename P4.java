package Patern;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <=4; j++) {
			if(i==1&&j==4) {
				System.out.print("*");
			}
			else if(i==2&&j==3) {
				System.out.print('$');
			}
			else
			System.out.print('0');
			}
System.out.println(' ');
}
	}

}
