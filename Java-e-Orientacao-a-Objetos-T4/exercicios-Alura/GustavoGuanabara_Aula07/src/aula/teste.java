package aula;

public class teste {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("lutador01", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("lutador02", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		l[2] = new Lutador("lutador03", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Lutador("lutador04", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Lutador("lutador05", "Brasil", 37, 1.7, 119.3, 5, 4, 3);
		l[5] = new Lutador("lutador06", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[4], l[5]);
		UEC01.lutar();

		
		l[4].status();
		l[5].status();
		

	}

}
