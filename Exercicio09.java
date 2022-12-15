//Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o 
//valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do 
//novo salário (variável NS).
package Exercicios;

import java.util.Scanner;

public class Exercicio09 {

public static void main (String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Qual o salário mensal?");
double salariomensal = sc.nextInt();

System.out.println("Qual o percentual de reajuste?");
double reajuste= sc.nextInt();

double totalreajuste;
double novosalario;
totalreajuste = salariomensal/100*reajuste ;
novosalario = totalreajuste+ salariomensal;

System.out.println("O novo salario será de :" + novosalario);
}
}
