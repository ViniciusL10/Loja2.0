package atividades;

public class Atividade1 {
	public static byte tipoByte;
	public static short tipoShort;
	public static char tipoChar;
	public static float tipoFloat;
	public static double tipoDouble;
	public static long tipoLong;
	public static int tipoInt;
	public static boolean tipoBoolean;

	public static void main(String[] args) {
		tipoByte = 127;
		tipoShort = 32767;
		tipoChar = 'c';
		tipoFloat = 2.6f;
		tipoDouble = 3.59;
		tipoInt = 2147483647;
		tipoLong = 9223372036854775807L;
		tipoBoolean = true;
		System.out.println("Valor do tipoByte � = " + tipoByte);
		System.out.println("Valor do tipoShort � = " + tipoShort);
		System.out.println("Valor do tipoChar � = " + tipoChar);
		System.out.println("Valor do tipoFloat � = " + tipoFloat);
		System.out.println("Valor do tipoDouble � = " + tipoDouble);
		System.out.println("Valor do tipoInt � = " + tipoInt);
		System.out.println("Valor do tipoLong � = " + tipoLong);
		System.out.println("Valor do tipoBoolean � = " + tipoBoolean);
	}
}
