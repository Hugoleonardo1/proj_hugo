package Projetos_LPA.aula04;

import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
        System.out.println("Hugo Leonardo Gomes Rodrigues");
        // Variáveis
        Double ht, vh, sb, sl, inss;
        
        // Instaciar class Scanner
        Scanner ler = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Quantas horas você trabalha por dia: ");
        ht = ler.nextDouble();
        
        System.out.print("Quanto você ganha por hora: ");
        vh = ler.nextDouble();
        
        // Processamento
        sb = ht*vh;
        
        inss = sb*0.12;
        
        sl = sb-inss;
        
        // Saída
        System.out.print("O valor do salário bruto é: " + sb);
       System.out.print("O valor do salário líquido é: " + sl);
        		
        		
        
        
        
	}

}
