package aula6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosStream {

	public static void main(String[] args) {
		criandoStreams();
	}
	
	private static void criandoStreams() {
		//A interface Collection possui o método stream e parallelStream
		final List<String> lista = Arrays.asList("amor", "bola");
		
		System.out.println("\nExemplo com Stream");
		//Criação de stream a partir de uma lista
		lista.stream()
		.forEach(System.out::println);
		
		System.out.println("\nExemplo com parallelStream");
		//O parallelStream é para programação paralela, situações em que não seja necessário que o fluxo de processamento seja linear
		lista.parallelStream()
			.forEach(System.out::println);	
		
		//Também é possível criar streams a partir de arrays
		String[] nomes = new String[] {"Ana", "Beatriz", "Clara", "Diana", "Eliane"};
		System.out.println("\nStream a partir de array usando a classe java.util.Arrays");
		
		//como é uma lazy evaluation, o forEach precisa ser usado, só faz as operações depois da execução da operação terminal (se a operação retorna um stream, ela é intermediária, caso não, provavelmente ela é terminal)
		//se não utilizar o forEach, nada será impresso
		Arrays.stream(nomes).forEach(System.out::println);
		
		//É possível criar um Stream também com a própria classe Stream usando o método of
		System.out.println("\nAo usar o método Stream.of podem ser passados Object");
		Stream.of("casa", 2, "miçanga", 1, "teste").forEach(System.out::println);
		
		//Para números é possível gerar um intervalo 
		System.out.println("\nCriando um stream com o método IntStream.range");
		IntStream.range(10, 20).forEach(System.out::println); 
		//caso deseje incluir o último número pode usar o rangeClosed
		
		//Outra forma de criar um stream é o método iterate.
		//Inicia-se com uma semente e uma função que define como ela será transformada
		System.out.println("\n\nCriando um stream com o método Stream.iterate");
		Stream.iterate(true, valor -> !valor).limit(5).forEach(System.out::println); 
		
		System.out.println("\nTestar as");
//		long tam = Stream.of("Du", "Dudu", "Edu").
		
		Map<Integer, List<String>> mapColetado = 
				Stream.of("Ana", "Beatriz", "Rui", "Clara", "Diana", "Eliane" )
				.collect(Collectors.groupingBy(nome -> nome.length()));
		
		System.out.println(mapColetado);
		
		String  stJoining = 
				Stream.of("Ana", "Beatriz", "Rui", "Clara", "Diana", "Eliane" )
				.collect(Collectors.joining());
		
		System.out.println(stJoining);
		
	}

}
