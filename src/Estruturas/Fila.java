package Estruturas;


	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.LinkedList;
	import java.util.Scanner;
	import java.util.PriorityQueue;
	import java.util.Queue;

	
		
		

		
	    public class Fila { 
	    	static void limpa() {
			for (int i = 0; i < 50; ++i)System.out.println(); 
		}
	    	public static void Filaa(Queue<String> fila,Queue<String> filaPri ,Queue<String> filaFinal) {
			 Scanner re = new Scanner( new InputStreamReader(System.in) );   
			
			

	       
	        int g=0, cont=0;
			int menu=0;
		    int idade= 0;
			String nome = null;
			int fil = 0;
			String tem;


			while(g!=1) {
				System.out.println("1 - Inserir Na Fila\n2 - Mostrar Filas\n3 - Fila de Atendimento\n4 - Chamar Paciente\n5 - Voltar");
				menu= re.nextInt();
				limpa();
			    re.nextLine();
			    g=0;
				switch(menu) {
				
				case 1:
					 
					System.out.println("Informações:\n");
					System.out.println("Digite o Nome a ser Adicionado:");
					nome=re.nextLine();
					System.out.println("Digite a idade:");
					idade=re.nextInt();
					limpa();
					if(idade>=60) {
						System.out.println("Ficar na: 1- Lista Prioritaria ou 2- Normal?");fil = re.nextInt();
					    
					    limpa();
						if(fil == 1) {
							filaPri.add(idade+" Anos - Nome: "+nome);
						}
						else {
							fila.add(idade+" Anos - Nome: "+nome);
						}
				
					}else {
						fila.add(idade+" Anos - Nome: "+nome);
					}
					System.out.println("Adicionado a Fila com Sucesso!");
					System.out.println("Clique Enter para Continuar!");
					re.nextLine();
					limpa();
					break;
				case 2:
					if(fila.isEmpty() == true && filaPri.isEmpty() == true) {
						System.out.println("Fila Vazia");
					break;
					}
				    if (fila.isEmpty() == false  ){
					System.out.println("Fila Normal: "+fila);
								
					}
					if( filaPri.isEmpty() == false) {
						System.out.println("Fila Prioritaria: "+filaPri);
					}
					System.out.println("Clique Enter para Continuar!");
					 re.nextLine();
					break; 
				case 3:
					while(g!=2 ) {	
						
						if(cont == 0 ) {
							for(int i=0;i<2;i++) {
								if(filaPri.isEmpty() == false) {
					        filaFinal.add(filaPri.poll());
							}}
							
						}cont= 1;
					   if(cont == 1 ) {
								if(fila.isEmpty() == false) {
					        filaFinal.add(fila.poll());
							
								}
						}cont= 0;
						if(fila.isEmpty() == true && filaPri.isEmpty() == true) {
							g=2;
						}
					}
					if(filaFinal.isEmpty() == true) {
						System.out.println("Fila Vazia");
						break;
					}
					else {
						System.out.println("Fila de Atendimento final: "+filaFinal);
					}
					
					 re.nextLine();
					break;
				case 4:
					while(filaFinal.isEmpty()== false) {
				
					 System.out.println("------PACIENTE: "+filaFinal.peek()+"------");
					 System.out.println("1- Proximo 2- Volta");
					 int prox = re.nextInt();
					 
					 if(prox == 1) {
						 filaFinal.poll();
					 }
					 else {
						 break;
					 }
				     
					}
					if(filaFinal.isEmpty()== true) {
						System.out.println("Fila Vazia");
						System.out.println("Clique Enter para Continuar!");
						 re.nextLine();
						 limpa();
						break;
					}
					break;
				case 5:
					g=1;
					break;
			
				default:
						
				break;
			}
			
				}}}

