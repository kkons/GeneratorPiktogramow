package com.company;

public class Main {

    public static void main(String[] args) {

        GeneratorPiktogramow gp = new GeneratorPiktogramow();
        System.out.println("Figura A");
        System.out.println("--------------");
        gp.printPatternA(5);
        System.out.println("Figura B");
        System.out.println("--------------");;
        gp.printPatternB(5);
        System.out.println("Figura C");
        System.out.println("--------------");
        gp.printPatternC(5);
        System.out.println("Figura D");
        System.out.println("--------------");
        gp.printPatternD(5);
    }
}
