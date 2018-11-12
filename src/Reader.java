import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
	private String fileToRead;
	private int ca;
	private int ce;
	private int nc;
	private int na;
	
	public void readTextFile(String directory, String name) {
		String fileToRead="";
		fileToRead.equals(directory+"/"+name);
		String eachLine = "";
		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(fileToRead));
			while ((eachLine = buffReader.readLine()) != null) {
				if (eachLine.contains(" extends ") || eachLine.contains(" implements "))
					ca++;
				if (eachLine.contains(" import "))
					ce++;
				if (eachLine.contains(" class "))
					nc++;
				if (eachLine.contains(" abstract "))
					na++;
			}
			buffReader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public String getFileToRead() {
		return fileToRead;
	}

	public int getCa() {
		return ca;
	}

	public int getCe() {
		return ce;
	}

	public int getNc() {
		return nc;
	}

	public int getNa() {
		return na;
	}
}
