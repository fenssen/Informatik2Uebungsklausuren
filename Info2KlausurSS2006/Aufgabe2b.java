
public class Aufgabe2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1234;
		long b = 987;
		System.out.println( Skalarprodukt( a, b) );
	}

	public static boolean Skalarprodukt( long a, long b) {
		boolean ergebnis = false;
		for(int i = 0; i < 64; i++) {
			ergebnis = ergebnis ^ 											// ^ is binary addition ( 'Halfadder' )
					(( a >> i) % 2 == 1) 									// returns true if bit is set at the i-th position of a
					& ( (b >> i) % 2 == 1);									// & is binary multiplikation
		}
		return ergebnis;
	}
}