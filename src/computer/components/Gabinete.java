package computer.components;

public class Gabinete {
    public String marca = null;
    public String modelo = null;

    public Gabinete(String mGab, String modGab) {
        if(mGab.length() < 1 || modGab.length() < 1) {
            System.out.println("Gabinete.java ERROR: Wrong value passed to [" + ((marca.length() < 1)? "marca" : "modelo") + ']');
            System.exit(1);
        }

        marca = mGab;
        modelo = modGab;
    }

}
