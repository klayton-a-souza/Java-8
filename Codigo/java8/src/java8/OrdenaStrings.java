package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		// Maneira antiga
		List<String> personagens = new ArrayList<>();

		personagens.add("Xiangling");
		personagens.add("Xingqiu");
		personagens.add("Sucrose");
		personagens.add("Bennett");

		// Codigo 1.4: Ordenando com o método sort
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(personagens, comparador);

		// Nova maneira
		// Codigo 1.4: Ordenando com o método sort
		personagens.sort(comparador);
		
		// Maneira antiga
//		for (String nome : personagens) {
//			System.out.println(nome);
//		}
		
		// Maneira nova
		personagens.forEach(personagem -> {System.out.println(personagem);});
		
		System.out.println(personagens);

	}

}
