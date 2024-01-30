package Aula_1.Bolo;

public class BoloRetangular {
    public
    float peso;
    public
    String sabor;
    public
    String cobertura;

    public void decorar(){
        System.out.println("Bolo decorado!!!");
    }

    public void comer(float pesoComido){
        System.out.println("Peso antes de comer era " + peso);
        peso = peso - pesoComido;
        System.out.println("Novo peso é " + peso);
    }
}
