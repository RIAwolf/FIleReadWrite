package lt.kaunascoding.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FailoSkaitytuvas {
    private static final String FAILO_VARDAS = "mano.txt";

    private FileReader _bylosSkaitytuvas;
    private BufferedReader _atmintiesSkaitytuvas;
    private ArrayList<String> _sarasas;


    public void AtidarykFaila(){

        try {
            _bylosSkaitytuvas = new FileReader(FAILO_VARDAS);
            _atmintiesSkaitytuvas = new BufferedReader(_bylosSkaitytuvas);
        } catch (Exception e) {

        }


    }
    public void SukurkNaujaSarasa(){
        _sarasas = new ArrayList<String>();
    }
    public void NuskaitykFailaISarasa(){

        try {
            String eilute = _atmintiesSkaitytuvas.readLine();
            while(eilute!=null) {
                _sarasas.add(eilute);
                eilute = _atmintiesSkaitytuvas.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void atvaizduokSarasa(){
        for (String eilute :_sarasas){
            System.out.println(eilute);
            String[] zodziai = eilute.split("\\|");
            for (String zodis: zodziai){
                System.out.println(zodis);
            }
        }

    }

    public void UzdarykFaila(){
        try {
            _atmintiesSkaitytuvas.close();
            _bylosSkaitytuvas.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
