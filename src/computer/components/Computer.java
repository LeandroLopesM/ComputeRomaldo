package computer.components;

public class Computer {
    RAM ram = null;
    CPU cpu = null;
    Drive drive = null;
    Gabinete pc = null;

    public Computer(String mCPU, String modCPU, double freqCPU, int pRAM,
                    int szRAM, String unit, String mGab, String modGab,
                    int szDrive, int numDrives, String drUnit, String drType) {
        ram =   new RAM(pRAM, szRAM, unit);
        cpu =   new CPU(mCPU, modCPU, freqCPU);
        drive = new Drive(szDrive, drUnit, numDrives, drType);
        pc =    new Gabinete(mGab, modGab);

    }

    public void setCPU(CPU newCPU) {
        if(newCPU.frequencia <= 0 || newCPU.modelo.isBlank() || newCPU.marca.isBlank()) {
            System.err.println("setCPU : Computer.java ERROR: Invalid argument passed to "
                    + ((newCPU.frequencia <= 0)? "newCPU.frequencia" :
                    (newCPU.modelo.isBlank())? "newCPU.modelo" :
                    "newCPU.marca"));
            System.exit(1);
        }
        cpu = newCPU;
    }

    public void setRAM(RAM newRAM) {
        if(newRAM.pentes <= 0 || newRAM.penteSize <= 0 || newRAM.unit.isBlank()) {
            System.err.println("setCPU : Computer.java ERROR: Invalid argument passed to "
                    + ((newRAM.pentes <= 0)? "newRAM.pentes" :
                    (newRAM.penteSize <= 0)? "newRAM.penteSize" :
                            "newRAM.unit"));
            System.exit(1);
        }
        ram = newRAM;
    }

    public void setDrive(Drive newDrive) {
        if(newDrive.drives <= 0 || newDrive.tamanho <= 0 || newDrive.unidade.isBlank() || newDrive.driveType.isBlank()) {
            System.err.println("setCPU : Computer.java ERROR: Invalid argument passed to " +
                    ((newDrive.drives <= 0)? "newDrive.drives" :
                    (newDrive.tamanho <= 0)? "newDrive.tamanho" :
                    (newDrive.unidade.isBlank())? "newDrive.unidade" :
                    "newDrive.driveType"));
            System.exit(1);
        }
        drive = newDrive;
    }

    public void setPc(Gabinete newPc) {
        if(newPc.marca.isBlank() || newPc.modelo.isBlank()) {
            System.err.println("setCPU : Computer.java ERROR: Invalid argument passed to " +
                    ((newPc.marca.isBlank())? "newPc.marca" :
                    "newPc.modelo"));
            System.exit(1);
        }
        pc = newPc;
    }

    public Object getComp(String component) {
        switch(component.toUpperCase()) {
            case "RAM":
                return ram;
            case "CPU":
                return cpu;
            case "PC":
            case "GABINETE":
                return pc;
            case "DRIVE":
                return drive;
            default:
                return null;
        }
    }

    public Object printComp(String component) {
        switch(component.toUpperCase()) {
            case "RAM":
                System.out.printf("RAM: %d x %d%s (Total: %d%s)\n", ram.pentes, ram.penteSize, ram.unit, ram.penteSize * ram.pentes, ram.unit);
                return ram;
            case "CPU":
                System.out.printf("CPU: %s %s (%.2f Hz)\n", cpu.marca, cpu.modelo, cpu.frequencia);
                return cpu;
            case "PC":
            case "GABINETE":
                System.out.printf("Gabinete: %s %s\n", pc.marca, pc.modelo);
                return pc;
            case "DRIVE":
                System.out.printf("Drive: %d %s (%d%s each)\n", drive.drives, drive.driveType, drive.tamanho, drive.unidade);
                return drive;
            default:
                System.err.println("printComp :: Computer.java ERROR: Unknown component passed as argument");
                System.exit(1);
        }
        return null;
    }

    public void neofetch() {
        System.out.printf("mCPU %s / modCPU %s / freqCPU %s\npRAM %s / szRAM %s / unit %s\nmGab %s / modGab %s\nszDrive %d / numDrives %d / drUnit %s", cpu.marca, cpu.modelo, cpu.frequencia, ram.pentes, ram.penteSize, ram.unit, pc.marca, pc.modelo, drive.tamanho, drive.drives, drive.unidade);
    }




}
