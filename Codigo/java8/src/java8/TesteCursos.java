package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TesteCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));

//		Lambda
//		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
//		cursos.forEach(c -> System.out.println(c));

//		Method reference
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(System.out::println);

//		Stream
//		Pegando cursos que tem 50 alunos ou mais e depois exibindo utilizando o forEach
//		Codigo 4.3: Filtrando cursos com mais de 50 alunos
//		cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(c -> System.out.println(c.getNome()));;

//		Pegando cursos que tem 100 alunos ou mais e depois exibindo a quantidade de alunos de cada um
		// Codigo 4.4: Utilizando o método map
//		cursos.stream().filter(curso -> curso.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);

//		int somaDeAlunosEmCursosComMaisDe100Alunos = cursos.stream().filter(curso -> curso.getAlunos() >= 100)
//				.mapToInt(Curso::getAlunos).sum();

//		List<Curso> cursosOrdenado = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

//		Codigo 5.6: Calculando média de quantidade de alunos
//		System.out.println(cursos.stream().mapToInt(curso -> curso.getAlunos()).average());
//		
//		Codigo 5.7: Coletando o resultado do stream em uma List
		int quantidadeDeAluno = 50;
		cursos.stream().filter(curso -> curso.getAlunos() > quantidadeDeAluno).collect(Collectors.toList())
				.forEach(curso -> System.out.println(curso.getNome()));

	}

}
