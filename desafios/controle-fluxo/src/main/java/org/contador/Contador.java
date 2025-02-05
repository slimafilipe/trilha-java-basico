package org.contador;

import org.contador.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primerio parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //Chama o metodo contar
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.err.println(e.getMessage());
        }
    }

    //Metodo par fazer a contagem dos números, usando como base a variavel contagem. E tratando a exceção customizada
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro (" + parametroDois + ") ser maior que o primeiro (" + parametroUm + ")");
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i < contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
