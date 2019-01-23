
public class Notendurchschnitt {
	public static void main (String [] args) {
		int deutschnote = 8;
		int englishnote = 1;
		int fremdsprachennote = 1;
		int mathenote = 1;
		System.out.print("Deutsch: ");
		System.out.println(deutschnote);
		System.out.print("English: ");
		System.out.println(englishnote);
		System.out.print("Fremdsprache: ");
		System.out.println(fremdsprachennote);
		System.out.print("Mathe: ");
		System.out.println(mathenote);
		int plus = deutschnote + englishnote + fremdsprachennote + mathenote;
		int durchschnitt = plus / 4;
		System.out.print("Durchschnitt: ");
		System.out.println(durchschnitt);
	}

}

