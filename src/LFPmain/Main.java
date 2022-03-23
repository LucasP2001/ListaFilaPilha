package LFPmain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import Estruturas.*;

public class Main {

	 
	    	static void limpa() {
			for (int i = 0; i < 50; ++i)System.out.println(); 
		}
	    	
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		
		//LISTA
		Collection<String> lista = new ArrayList();
		Lista li = new Lista();
		
		//PILHA
		Stack<String> pilha = new Stack<String>();
		Pilha pi = new Pilha();
		
		//FILA
		Queue<String> fila = new LinkedList();
		Queue<String> filaPri = new LinkedList();
		Queue<String> filaFinal = new LinkedList();
		Fila fi = new Fila();
		
		
		
		
		int g=0;
		int menu=0;
		
		while(g!=1) {
			System.out.println("******* Estruturas *******\n\n        1 - Lista\n        2 - Pilha\n        3 - Fila\n        4 - Limpar Estruturas\n        5 - Sair");
			menu= re.nextInt();
			limpa();

			switch(menu) {
			case 1:
				li.listaa(lista);
				break;
			case 2:
				pi.pilhaa(pilha);
				break;
			case 3:
				fi.Filaa(fila,filaPri,filaFinal);
				break;
			case 4:
				System.out.println("******* Limpar Estruturas: *******\n\n          1 - Lista\n          2 - Pilha\n          3 - Fila\n          4 - Volta");
				int limpar = re.nextInt();
				limpa();
				switch(limpar) {
				case 1:
					lista.removeAll(lista);
					
					break;
				case 2:
					pilha.removeAllElements();
					break;
				case 3:
					fila.clear();
					break;
				case 4:
					break;
				default:
					break;
				}
				break;
				
				
			case 5:
				g=1;
				break;
			default:
					
					
			break;
		}
		}
	

	}

}
