package br.com.fiap.procedimentos;

import java.util.Date;

public class ProcedimentoOuFun��o {
	
    // exemplo de procedimento
    public static void reconhecerCliente() {
        System.out.println("Bem vindo!");
    }
    
    // exemplo de fun��o
    public static int somar(int precoProd1, int precoProd2) {
        return precoProd1 + precoProd1;
    }
    
    public static void main(String[] args) {
        // aqui � o programa
        int precoProd1 = 10;
        int precoProd2 = 20;
        System.out.println(precoProd1 + precoProd2);
        System.out.println("-".repeat(50));
        int resultadoSoma = somar(precoProd1, precoProd2);
    }
}