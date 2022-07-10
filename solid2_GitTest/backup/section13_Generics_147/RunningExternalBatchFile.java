package section13_Generics_147;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class RunningExternalBatchFile {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		try {
		    Process p1 = runtime.exec("cmd /c start D:\\IDX-rest-emulator-1.0.9\\run-emu.cmd");
		    InputStream is = p1.getInputStream();
		    int i = 0;
		    while( (i = is.read() ) != -1) {
		        System.out.print((char)i);
		    }
		} catch(IOException ioException) {
		    System.out.println(ioException.getMessage() );
		}

	}

}
