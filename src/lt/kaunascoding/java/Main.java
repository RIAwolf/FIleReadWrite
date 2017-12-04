package lt.kaunascoding.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        FailoSkaitytuvas fs = new FailoSkaitytuvas();
        fs.AtidarykFaila();
        fs.SukurkNaujaSarasa();
        fs.NuskaitykFailaISarasa();
        fs.atvaizduokSarasa();
        fs.UzdarykFaila();

        FailoRasytuvas fr = new FailoRasytuvas();
        fr.AtidarykFaila();
        fr.Irasyk("Belekas");
        fr.UzdarykFaila();

    }
}
