package org.app.helper;

public final class d {

	private static Long start;

	public static void time(Integer pos) {
		if (pos == 0) {
			start = System.currentTimeMillis();
			System.out.printf("--- start: 0%n");
		} else {
			System.out.printf("--- point" + pos + ": %d%n", System.currentTimeMillis() - start);
		}
	}

}
