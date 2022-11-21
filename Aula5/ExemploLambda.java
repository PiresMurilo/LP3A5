package aula5;

import java.util.Arrays;
import java.util.Comparator;

public class ExemploLambda {

	public static void main(String[] args) {
		
		String[] frutas = {"baru", "pera", "banana", "goiaba", "morango", "tangerina", "limão", "graviola", "melão", "açaí", "damasco", "melancia"};
		Arrays.asList(frutas)
			.stream()
			.filter(f -> f.startsWith("m"))
			.sorted(Comparator.reverseOrder())
			.forEach(f -> System.out.println(f));
		
//		quando eu crio um stream, eu consigo aplicar um lambda nele
//		stream -> 
//		parallelStream ->

	}

}
