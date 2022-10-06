package hu.petrik.sokszog;

import hu.petrik.sokszog.Teglalap;
import hu.petrik.sokszog.Haromszog;


public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            double a = Math.random() * 5 + 10;
            double b = Math.random() * 5+ 10;
            Teglalap t = new Teglalap(a,b);
            System.out.println(t);
        }

        Haromszog h1 = new Haromszog(3,4,5);
        System.out.println(h1);
        System.out.println();
        for (int i = 0; i < 100; i++){
            Haromszog h = new Haromszog();
            System.out.println(h);
        }

    }
}
