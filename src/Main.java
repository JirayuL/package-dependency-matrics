import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File file = new File("/Users/mark/Documents/WSP/forrest/main/java/org/apache/forrest");
		Reader read = new Reader();
		List<String> allFile = new ArrayList<String>();
		allFile = read.getAllFile(file);
		System.out.println("Files Found: " + allFile.size());
		for (String myFile : allFile) {
			if (myFile.contains(".java")) {
				read.readTextFile(myFile);
				System.out.println("ca: " + read.getCa());
				System.out.println("ce: " + read.getCe());
				System.out.println("nc: " + read.getNc());
				System.out.println("na: " + read.getNa());
				PackageInfo pack = new PackageInfo(read.getNa(), read.getNc(), read.getCa(), read.getCe());
				DecimalFormat df = new DecimalFormat("#.######");
				System.out.println("Instability: " + df.format(pack.getInstability()));
				System.out.println("Abstractness: " + df.format(pack.getAbstractness()));
			}
		}
	}
}
