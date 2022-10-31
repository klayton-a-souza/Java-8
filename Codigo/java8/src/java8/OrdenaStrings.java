package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> personagens = new ArrayList<>();

		personagens.add("Xiangling");
		personagens.add("Xingqiu");
		personagens.add("Sucrose");
		personagens.add("Bennett");

//		personagens.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));		
//		Codigo abaixo e similar ao codigo da linha 18
//		personagens.sort(Comparator.comparing(p -> p.length()));
//		personagens.sort(Comparator.comparing(String::length));

//		Codigo 3.6: Mudando o critério de comparação
		personagens.sort(String.CASE_INSENSITIVE_ORDER); // Ordem alfabetica

//		personagens.forEach(personagem -> System.out.println(personagem));
		
//		Codigo 3.7: Tirando proveito de method reference no forEach
		personagens.forEach(String::length);

		System.out.println(personagens);

	}

}
