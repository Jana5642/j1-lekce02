package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();






           zofka.turnRight(90);
           zofka.move(100);
             zofka.turnRight(90);
             zofka.move(100);
             zofka.turnRight(90);
             zofka.move(100);
             zofka.turnRight(90);
             zofka.move(100);
             zofka.turnRight(30);
             zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);







        }






    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
