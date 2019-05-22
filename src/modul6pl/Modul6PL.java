package modul6pl;

import java.util.Scanner;

public class Modul6PL {
    
    double jari2, luasling, volumbol;
    Scanner masuk = new Scanner(System.in);

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    void hitung() {
        jari2 = masuk.nextDouble();
        setJari2(jari2);

        VolumeBola v = new VolumeBola();
        volumbol = v.vol(this);
        System.out.println("Volume of sphere  = " + volumbol);

        LuasLingkaran l = new LuasLingkaran();
        luasling = l.lus(this);
        System.out.println("Area of circle = " + luasling);

    }

}
