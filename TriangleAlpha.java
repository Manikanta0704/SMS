
public class TriangleAlpha {
	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++) {
			for(int j=1;j<6-i;j++) {
				System.out.print((char)(69-i)+" ");
			}
			System.out.println();
		}
	}
}
