package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Questao2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Utilizando arrays, crie uma classe que organize uma quantidade qualquer de números
//		inteiros fornecidos pelo usuário da seguinte forma: primeiro os números pares em
//		ordem crescente e depois os números ímpares em ordem decrescente.
		
		int[] valores = new int [10];
		int[]ordenados = new int[10];
		int menor = 0;
		int j = 0;
		int k = 0;
		int vezes,par =0,impar = 0;
		int []valoresImpar = new int[10];
		int [] valoresPares = new int[10];
		
		
		
		
		BufferedReader entraDados = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Por favor,digite quantos números você quer digitar:");
		vezes = Integer.parseInt(entraDados.readLine());
		
		
		
		for (int i = 0; i < vezes; i++) {
			System.out.println("Por favor, digite o "+(i + 1)+"º número:");
			valores[i] = Integer.parseInt(entraDados.readLine());
			if(valores[i] % 2 == 0) {
				par++;
				
			}else {
				impar++;
			}
			
		}
		
		for (int i = 0; i < vezes; i++) {
			
			if(valores[i] % 2 == 0) {
				
				valoresPares[j] = valores[i];
				j++;
			}
		}
		
		
		for (int i = 0; i < vezes; i++) {
			
			if(valores[i] % 2 == 1) {
				valoresImpar[k] = valores[i];
				k++;
			}
		}
		
		System.out.println("Pares:");
		for (int i = 0; i < par; i++) {
			System.out.print(valoresPares[i]+" ");
		}
		
		System.out.println("\nImpar:");
		for (int i = 0; i < par; i++) {
			System.out.print(valoresImpar[i]+" ");
		}
		
		for (int i = 0; i < par; i++) {
			ordenados[i] = valoresPares[i];
			
		}
		
		for (int i = par; i < vezes; i++) {
			ordenados[i] = valoresImpar[i];
			
		}
		
		//System.out.println("valor de n "+n);
		System.out.println("\nOrdenados:");
		for (int i = 0; i < vezes; i++) {
			System.out.print(ordenados[i]+" ");
		}
	}
}