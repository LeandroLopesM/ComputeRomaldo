package computer.components;

import org.jetbrains.annotations.NotNull;

public class Calculate {
	public static long getSize(@NotNull RAM calcRAM) {
		switch (calcRAM.unit) {
			case "PB" -> { //petabyte
				return (long) calcRAM.penteSize * 1000000000000000L * calcRAM.pentes;
			}
			case "TB" -> { // terabyte
				return (long) calcRAM.penteSize * 1000000000000L * calcRAM.pentes;
			}
			case "GB" -> {
				return (long) calcRAM.penteSize * 1000000000 * calcRAM.pentes;
			}
			case "MB" -> {
				return (long) calcRAM.penteSize * 1000000 * calcRAM.pentes;
			}
			case "KB" -> {
				return (long) calcRAM.penteSize * 1000 * calcRAM.pentes;
			} // Technically a bit but we shan't worry about that
			case "B" -> {
				return (long) calcRAM.penteSize * calcRAM.pentes;
			}
			default -> {
				System.err.println("getSize :: Computer.java ERROR: Invalid unit passed");
				System.exit(1);
			}
		}
		return 0;
	}

	public static long getSize(@NotNull Drive calcDrive) {
		switch (calcDrive.unidade.toUpperCase()) {
			case "PB" -> { //petabyte
				return (long) calcDrive.tamanho * 1000000000000000L * calcDrive.drives;
			}
			case "TB" -> { // terabyte
				return (long) calcDrive.tamanho * 1000000000000L * calcDrive.drives;
			}
			case "GB" -> {
				return (long) calcDrive.tamanho * 1000000000 * calcDrive.drives;
			}
			case "MB" -> {
				return (long) calcDrive.tamanho * 1000000 * calcDrive.drives;
			}
			case "KB" -> {
				return (long) calcDrive.tamanho * 1000 * calcDrive.drives;
			} // Technically a bit but we shan't worry about that
			case "B" -> {
				return (long) calcDrive.tamanho * calcDrive.drives;
			}
			default -> {
				System.err.println("getSize :: Computer.java ERROR: Invalid unit passed");
				System.exit(1);
			}
		}
		return 0;
	}
}
