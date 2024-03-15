import computer.components.Calculate;
import computer.components.Computer;
import computer.components.RAM;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Computer cp = new Computer("Intel", "I5", 2.4, 2, 8, "GB", "Troy", "Exvae", 96, 3, "GB", "SSD SATA");

        System.out.println(cp.getComp("ram"));
        cp.printComp("cpu");

        cp.setRAM(new RAM(2, 96, "GB"));

        System.out.println(Calculate.getSize((RAM)cp.getComp("ram")));
    }
}