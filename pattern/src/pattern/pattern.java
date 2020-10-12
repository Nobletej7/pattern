package pattern;

public class pattern {
	public static void main(String[] args) {
	for (int j=1;j<=6;j++) {
		for(int k=5;k>=j;k--)
		{
			System.out.print(" ");
		}
	for (int i=6;i>=j;i--) {
		System.out.print("  * ");
	}
	System.out.println(" ");
	}
	
}
}
