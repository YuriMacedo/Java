package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Utilizando arrays, crie uma classe que recebe dez n�meros inteiros quaisquer e ap�s
//		receb�-los apresenta o maior e o menor n�mero.
		
		int []valores = new int[10];
		int maior = 0,menor = 0;
		
		BufferedReader entraDados = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Por favor, digite o "+(i + 1)+"� n�mero do array:");
			
			valores[i] = Integer.parseInt(entraDados.readLine());
			
			if (valores[i] > maior) {
				maior = valores[i];
			}
			menor = valores[i];
		}
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		System.out.println("Maior n�mero digitado: "+maior);
		System.out.println("Menor n�mero digitado: "+menor);

	}

}
