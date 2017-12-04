package lt.kaunascoding.java;

import java.io.*;

public class FailoRasytuvas {
    private static final String IRASYMO_BYLA= "lauk.txt";
    private FileOutputStream _bylosRasiklis;
    private OutputStreamWriter _isvedimoRasiklis;
    private BufferedWriter _atmintiesRasiklis;

    public void AtidarykFaila(){
        try {
            _bylosRasiklis= new FileOutputStream(IRASYMO_BYLA);
            _isvedimoRasiklis= new OutputStreamWriter(_bylosRasiklis);
            _atmintiesRasiklis= new BufferedWriter(_isvedimoRasiklis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void Irasyk(String eilute){

        try {
            _atmintiesRasiklis.write(eilute);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void UzdarykFaila(){
        try {
            _atmintiesRasiklis.close();
            _isvedimoRasiklis.close();
            _bylosRasiklis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
