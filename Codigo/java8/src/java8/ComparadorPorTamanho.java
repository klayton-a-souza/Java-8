package java8;

import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String personagem1, String personagem2) {
		if ((personagem1.length()) < (personagem2.length())) {
			return -1;
		}

		if ((personagem1.length()) > (personagem2.length())) {
			return 1;
		}

		return 0;
	}

}
