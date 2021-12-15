package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			Set<Integer> a = new HashSet<>();
			Set<Integer> b = new HashSet<>();
			Set<Integer> c = new HashSet<>();
			
			System.out.println("Quantos alunos tem no curso A?");
			int nCursoA = sc.nextInt();
			for (int i=0; i<nCursoA; i++) {
				int numero = sc.nextInt();
				a.add(numero);
			}
			
			System.out.println("Quantos alunos tem no curso B?");
			int nCursoB = sc.nextInt();
			for (int i=0; i<nCursoB; i++) {
				int numero = sc.nextInt();
				b.add(numero);
			}
			
			System.out.println("Quantos alunos tem no curso C?");
			int nCursoC = sc.nextInt();
			for (int i=0; i<nCursoC; i++) {
				int numero = sc.nextInt();
				c.add(numero);
			}
			
			Set<Integer> total = new HashSet<>(a);
			total.addAll(b);
			total.addAll(c);
			
			System.out.println("Total de alunos: "+ total.size());
	}
}
