package aula6;

import java.util.Arrays;
import java.util.List;

public class ExemploStream {
	
	class Teste{
		final String s;
		
		public Teste(String s) {
			this.s = s;
		}
		
		public String funcaoQualquer() {
			return s.trim().toUpperCase();
		}
	}
	
	public static void main(String args[]) {
		final List<String> lista = Arrays.asList("amor", "bola");
		
		lista.parallelStream().forEach(System.out::println);
	}

}
