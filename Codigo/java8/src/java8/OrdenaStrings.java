package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> personagens = new ArrayList<>();

		personagens.add("Xiangling");
		personagens.add("Xingqiu");
		personagens.add("Sucrose");
		personagens.add("Bennett");

		personagens.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		personagens.forEach(personagem -> System.out.println(personagem));

		System.out.println(personagens);

	}

}
