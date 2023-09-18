/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tayara.5970
 */

import java.util.Scanner;
public class NewClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        
        int opcao;
        float num1, num2, resultado;
        
        System.out.println("Informe a operação:");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        opcao = scanner.nextInt();
        
        if(opcao == 1){ //Soma)
            System.out.println("------SOMA------");
            System.out.println("Informe o primeiro numero: ");
            num1 = scanner.nextFloat();

            System.out.println("Informe o segundo numero: ");
            num2 = scanner.nextFloat();

            resultado = num1 + num2;

            System.out.println("Resultado da SOMA " + resultado);
        }else if(opcao == 2){
            System.out.println("------SUBTRAÇÃO------");
            System.out.println("Informe o primeiro numero: ");
            num1 = scanner.nextFloat();

            System.out.println("Informe o segundo numero: ");
            num2 = scanner.nextFloat();

            resultado = num1 - num2;

            System.out.println("Resultado da SUBTRAÇÃO: " + resultado);
        }else if (opcao == 3){
            System.out.println("-----MULTIPLICAÇÃO------");
            System.out.println("Informe o primeiro numero: ");
            num1 = scanner.nextFloat();
            
            System.out.println("Informe o segundo numero: ");
            num2 = scanner.nextFloat();
            
            resultado = num1 * num2;
            
            System.out.println("Resultado da MULTIPLICAÇÃO: " + resultado);
            
            
        }else if (opcao == 4){
        System.out.println("----DIVISÃO----");
        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextFloat();
        
        resultado = num1 / num2;
        System.out.println("Resultado da Divisão:" + resultado);
        }
    }
}
