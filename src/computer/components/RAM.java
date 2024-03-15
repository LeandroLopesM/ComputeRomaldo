package computer.components;

public class RAM {
    public int pentes;
    public int penteSize;
    public String unit;

    public RAM(int pRAM, int szRAM, String unit) {
        if(pRAM < 1 || szRAM < 1 || unit.length() < 1) {
            System.out.println("RAM.java ERROR: Wrong value passed to [" + ((pRAM < 1)? "pRAM" : (szRAM < 1)? "szRAM" : "unit") + ']');
            System.exit(1);
        }

        pentes = pRAM;
        penteSize = szRAM;
        this.unit = unit;
    }
}
