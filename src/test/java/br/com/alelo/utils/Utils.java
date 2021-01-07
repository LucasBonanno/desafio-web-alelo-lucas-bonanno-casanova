package br.com.alelo.utils;

public class Utils {

	public static boolean isWindows() {
		return System.getProperty("os.name").startsWith("Windows");
	}

	public static boolean isUnix() {
		return System.getProperty("os.name").startsWith("Linux");
	}

}
