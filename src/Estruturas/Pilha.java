package Estruturas;

import java.util.Stack;
import java.util.Scanner;

public class Pilha {
	
	    	static void limpa() {
			for (int i = 0; i < 50; ++i)System.out.println(); 
		}
	    	
public static void pilhaa(Stack<String> pilha) {
	
		Scanner re = new Scanner(System.in);
		
		
		int g=0;
		int menu=0;
		String valor = null;
		
		while(g!=1) {
			System.out.println("1 - Empilhar\n2 - Mostrar Pilha\n3 - Desempilhar\n4 - Mostrar Topo e Base da Pilha\n5 - Voltar");
			menu= re.nextInt();
			limpa();
			
				
			
			switch(menu) {
			case 1:
				re.nextLine();
				System.out.println("Digite o Nome a ser Empilhado:");
				valor=re.nextLine();
				pilha.push(valor);
				limpa();
				System.out.println("Empilhado com Sucesso!");
				System.out.println("Clique Enter para Continuar!");
				re.nextLine();
				limpa();
				break;
			case 2:
				re.nextLine();
				if(pilha.empty() == true) {
					System.out.println("Lista Vazia");
					System.out.println("Clique Enter para Continuar!");
					
				}else {
				System.out.println(pilha);
				System.out.println("Clique Enter para Continuar!");
				
				}
				 re.nextLine();
				 limpa();
				break; 
			case 3:
				re.nextLine();
				if(pilha.empty() == true) {
					System.out.println("Pilha Vazia");
					System.out.println("Clique Enter para Continuar!");
					
				}else {
			    	pilha.pop();
			    	System.out.println("Desempilhado com Sucesso!");
			        System.out.println("Clique Enter para Continuar!");
			    
				}
				 re.nextLine();
				 limpa();
				break;
			case 4:
				re.nextLine();
				if(pilha.empty() == true) {
					System.out.println("Pilha Vazia");
					System.out.println("Clique Enter para Continuar!");
					
				}else {
					 System.out.println("Topo:"+pilha.peek()+" "+pilha.search(pilha.peek())); 
					 System.out.println("Topo:"+pilha.firstElement()+" "+pilha.search(pilha.firstElement())); 
					 System.out.println("Clique Enter para Continuar!"); 
				}
				 re.nextLine();
				 limpa();
				break;
			case 5:
				
			    g=1;
				break;
			default:
					
			break;
		}
		
		}}
		

}
