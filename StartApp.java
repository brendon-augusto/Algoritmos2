package br.edu.univas.questao04;

import java.util.Scanner;

public class StartApp {
        public static Scanner reading = new Scanner(System.in);
        public static void main(String[] args) {

      Retangulo retangulo = new Retangulo();


        lerRetangulo(retangulo);




     reading.close();
    }

    public static Retangulo lerRetangulo(Retangulo retangulo) {
        System.out.println("Digite o inicio de X");
        retangulo.xIni = reading.nextInt();
        System.out.println("Digite o fim de X");
        retangulo.xFim = reading.nextInt();
        System.out.println("Digite o inicio de Y");
        retangulo.yIni = reading.nextInt();
        System.out.println("Digite o fim de Y");
        retangulo.yfim = reading.nextInt();



    return retangulo;
    }

}