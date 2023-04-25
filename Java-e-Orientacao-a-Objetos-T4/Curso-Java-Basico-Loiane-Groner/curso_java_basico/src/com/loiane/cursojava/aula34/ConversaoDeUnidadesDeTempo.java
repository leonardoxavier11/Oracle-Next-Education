package com.loiane.cursojava.aula34;

public class ConversaoDeUnidadesDeTempo {

	public static int conveterMinutosParaSegundos(int minutos) {
		return minutos * 60;
	}

	public static int conveterHorasParaMinutos(int horas) {
		return horas * 60;
	}

	public static int conveterDiasParaHoras(int dias) {
		return dias * 24;
	}

	public static int conveterSemanasParaDias(int semanas) {
		return semanas * 7;
	}

	public static int conveterMesesParaDias(int meses) {
		return meses * 30;
	}

	public static double conveterAnosParaDias(int anos) {
		return anos * 365.25;
	}

}
