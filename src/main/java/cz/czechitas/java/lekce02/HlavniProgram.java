package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        nakresliDomecek();
//posun
        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.penDown();


        nakresliObdelnik();

 //hlava
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

//posun
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(32);

//nozicky
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);

 //posun
        zofka.turnRight(120);
        zofka.move(64);

 //nozicky
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);



















        }

    private void nakresliObdelnik() {
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(130);
    }

    private void nakresliDomecek() {
        nakresliCtverec();


        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
