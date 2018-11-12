import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {
	private File file;
	private PrintWriter pw ;
	private StringBuilder sb = new StringBuilder();

	public Writer(File file){
		this.file = file;
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		pw.close();
	}

	public void writeHeader() {
		pw.append("Instability");
		pw.append(',');
		pw.append("Abstractness");
		pw.append('\n');
	}
	
	public void writeToFile(String in, String ab) {
		sb.append(in);
		sb.append(',');
		sb.append(ab);
		sb.append('\n');
		pw.append(sb.toString());
	}
}
