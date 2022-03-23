package Estruturas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Lista {
	
	 
	    	static void limpa() {
			for (int i = 0; i < 50; ++i)System.out.println(); 
		}
	    	
	public static void listaa(Collection<String> lista) {
		Scanner re = new Scanner(System.in);
		
		
		
		int g=0;
		int menu=0;
		boolean validar;
		String valor = null;
		String Remo = null;
		while(g!=1) {
			System.out.println("1 - Adicionar a Lista\n2 - Mostrar Lista\n3 - Remover da lista\n4 - Sair");
			menu= re.nextInt();
			limpa();

			switch(menu) {
			case 1:
				re.nextLine();
				System.out.println("Adicionar Conteúdo:");
				valor=re.nextLine();
				lista.add(valor);
				limpa();
				System.out.println("Adicionado com Sucesso!");
				System.out.println("Clique Enter para Continuar!");
				re.nextLine();
				limpa();
				break;
			case 2:
				re.nextLine();
				if(lista.isEmpty() == true) {
					System.out.println("Lista Vazia");
					System.out.println("Clique Enter para Continuar!");
					re.nextLine();
					
				}else {
				System.out.println(lista);
				System.out.println("Clique Enter para Continuar!");
				re.nextLine();
				}
				limpa();
				break;
			case 3:
				re.nextLine();
				if(lista.isEmpty() == true) {
					System.out.println("Lista Vazia");
					System.out.println("Clique Enter para Continuar!");
					re.nextLine();
				}else {
				System.out.println("Digite o Conteúdo a ser Removido:");
			    Remo = re.nextLine();
			    validar = lista.contains(Remo);
			    
			    if(validar == true) {
			    	lista.remove(Remo);
			    	System.out.println("Removido com Sucesso!");
			    }
			    else {
			    	System.out.println("Digite um Nome Valido!");
			    }
			    System.out.println("Clique Enter para Continuar!");
			    re.nextLine();
				}
				limpa();
				break;
			case 4:
				g=1;
				break;
			default:
					
					
			break;
		}
		}
	}}
	
	