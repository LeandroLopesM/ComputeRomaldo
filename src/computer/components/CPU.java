package computer.components;

public class CPU {
    public String marca;
    public String modelo;
    public double frequencia;

    public CPU(String mCPU, String modCPU, double fCPU) {
        if(mCPU.length() < 1 || modCPU.length() < 1 || fCPU == 0.0) {
            System.err.println("CPU.java ERROR: Invalid data passed at " +
                    ((mCPU.length() < 1)? "mCPU" : (modCPU.length() < 1)? "modCPU" : "fCPU"));
            System.exit(1);
        }

        marca = mCPU;
        modelo = modCPU;
        frequencia = fCPU;
    }
}
