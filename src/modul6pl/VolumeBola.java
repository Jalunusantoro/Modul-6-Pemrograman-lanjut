package modul6pl;

import static java.lang.Math.PI;

public class VolumeBola {

    double vol(Modul6PL vol) {
        return PI * vol.getJari2() * vol.getJari2() * vol.getJari2() * 4 / 3;
    }
}
