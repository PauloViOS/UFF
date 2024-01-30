package Aula_1.Bolo;

import Aula_1.Bolo.BoloRetangular;

public class Main {
    public static void main(String[] args) {
        BoloRetangular boloChocolate  = new BoloRetangular();
        BoloRetangular boloMorango  = new BoloRetangular(); //por estar no mesmo pacote, não precisa importar!!!

        imprimir(boloChocolate); // os três prints virão null pq não definimos valores para os atributos

        boloChocolate.peso = 3.0F;
        boloChocolate.sabor = "Chocolate";
        boloChocolate.cobertura = "Morango";
        boloMorango.peso = 4.0F;
        boloMorango.sabor = "Morango";
        boloMorango.cobertura = "Chocolate";

        imprimir(boloChocolate);

        boloChocolate.comer(1);

        boloChocolate.decorar();

        boloMorango = boloChocolate; // ao fazer isso, ambas as referências apintam pro mesmo objeto. Ao fazer uma mudança no estado de boloMorango, ela será refletida em boloChocolate
        imprimir(boloMorango);
    }

    static void imprimir(BoloRetangular bolo){
        System.out.println("Peso: " + bolo.peso);
        System.out.println("Sabor: " + bolo.sabor);
        System.out.println("Cobertura: " + bolo.cobertura);
    }
}