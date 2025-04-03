package org.example;

public class Main {
    public static void main(String[] args) {
        // Instancia a classe RomanNumeral
        RomanNumeral converter = new RomanNumeral();

        // Teste de conversão de números romanos
        System.out.println("Conversão de IX: " + converter.convert("IX"));  // Saída esperada: 9
        System.out.println("Conversão de XLII: " + converter.convert("XLII")); // Saída esperada: 42
        System.out.println("Conversão de MCMXCIV: " + converter.convert("MCMXCIV")); // Saída esperada: 1994
    }
}