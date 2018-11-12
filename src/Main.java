import java.io.File;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		File file = new File("");

		String[] jcdFiles = file.list();
		Reader read = new Reader();

		System.out.println("Files Found: " + jcdFiles.length);

		for (String myFile : jcdFiles) {
			if (myFile.contains(".java"))
				read.readTextFile(file.toString(), myFile);
		}

		PackageInfo pack = new PackageInfo(read.getNa(), read.getNc(), read.getCa(), read.getCe());
		DecimalFormat df = new DecimalFormat("#.######");

		System.out.println("ca: " + read.getCa());
		System.out.println("ce: " + read.getCe());
		System.out.println("nc: " + read.getNc());
		System.out.println("na: " + read.getNa());
		System.out.println("Instability: " + df.format(pack.getInstability()));
		System.out.println("Abstractness: " + df.format(pack.getAbstractness()));

	}
}
