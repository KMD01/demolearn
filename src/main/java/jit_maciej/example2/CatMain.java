package jit_maciej.example2;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Strings;

import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class CatMain {

    public static void main(String[] args) {

        Cat cat0 = new Cat();
        //cat0.sayMiau();
        int catAge = cat0.getAge();
        //System.out.println(catAge);
        cat0.setAge(17);
        //System.out.println(cat0.getAge());

        //System.out.println(cat0);
        Cat cat1 = new Cat("Fluffy", 20);
        //System.out.println(cat1);
        Cat cat2 = new Cat("Dragon");
        //System.out.println(cat2.toString());

        Cat[] cats = new Cat[4];
        //System.out.println(cats[0]);
        cats[0] = cat0;
        cats[1] = cat1;
        cats[2] = cat2;

/*        System.out.println();
        System.out.println(cats[0]);
        System.out.println(cats[1]);
        System.out.println(cats[2]);
        System.out.println(cats);
        System.out.println(Arrays.toString(cats));*/

        Cat[] cats2 = new Cat[]{cat0, cat1, cat2};


        //Subject: wypisz wiek kota
        System.out.println();
        for (int i = 0; i < cats2.length; i++) {
            if (cats[i].getAge() > 1) {
                System.out.println(cats2[i]);
            }
        }
        //Subject: wypisz imiona zaczynające się na litere A
        System.out.println();
        for (int i = 0; i < cats2.length; i++) {
            if (cats[i].getName().toUpperCase(Locale.ROOT).startsWith("W")) {
                System.out.println(cats2[i]);
            }
        }

        //Subject: wypisz koty podzielne przez 2
        System.out.println();
        for (int i = 0; i < cats2.length; i++) {
            if (cats[i].getAge() % 2 == 0) {
                System.out.println(cats2[i]);
            }
        }






    }

}
