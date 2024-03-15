package computer.components;

public class Drive {
    public int tamanho;
    public String unidade;
    public int drives;
    public String driveType;

    public Drive(int szDrive, String unit, int numDrives, String drType) {
        assert(szDrive > 1 || unit.length() > 1 || numDrives >= 1);

        tamanho = szDrive;
        unidade = unit;
        drives = numDrives;
        driveType = drType;
    }
}
