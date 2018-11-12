import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	private String fileToRead;
	private List<String> allFile = new ArrayList<String>();
	private int ca;
	private int ce;
	private int nc;
	private int na;
	
	public void readTextFile(String directory) {
		String eachLine = "";
		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(directory));
			while ((eachLine = buffReader.readLine()) != null) {
				if (eachLine.contains(" extends ") || eachLine.contains(" implements "))
					ca++;
				if (eachLine.contains("import "))
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
	
	public List<String> getAllFile(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            getAllFile(fileEntry);
	        } else {
	        	allFile.add(fileEntry.getPath());
	        }
	    }
	    return allFile;
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
