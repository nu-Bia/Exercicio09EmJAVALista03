//Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o 
//valor do percentual de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do 
//novo sal�rio (vari�vel NS).
package Exercicios;

import java.util.Scanner;

public class Exercicio09 {

public static void main (String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Qual o sal�rio mensal?");
double salariomensal = sc.nextInt();

System.out.println("Qual o percentual de reajuste?");
double reajuste= sc.nextInt();

double totalreajuste;
double novosalario;
totalreajuste = salariomensal/100*reajuste ;
novosalario = totalreajuste+ salariomensal;

System.out.println("O novo salario ser� de :" + novosalario);
}
}
