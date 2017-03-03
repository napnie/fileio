package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * This class store a logic to copy from one file to another.
 * @author Nitith Chayakul
 *
 */
public class FileUtil {

	/**
	 * Copy from one file to another byte-by-byte.
	 * @param in - source files
	 * @param out - withdraw files
	 */
	public static void copy(InputStream in, OutputStream out) {
		try {
			int buffer;
			while ( (buffer = in.read()) >= 0 ) out.write(buffer);
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy from one file to another at certain byte a time.
	 * @param in - source files
	 * @param out - withdraw files
	 * @param blocksize - byte that copy at one
	 */
	public static void copy(InputStream in, OutputStream out, int blocksize) {
		try {
			byte[] buffer = new byte[blocksize];
			int length;
			while ( (length = in.read(buffer)) >= 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy file using BufferedReader and PrintWriter.
	 * @see ku.util.FileUtil#copy(InputStream, OutputStream)
	 */
	public static void bcopy(InputStream in, OutputStream out) {
		Reader reader = new InputStreamReader( in );
		BufferedReader br = new BufferedReader( reader );
		String line = null;
		PrintWriter writer = new PrintWriter( out );

		try {
			while( (line = br.readLine()) != null ) {
				writer.println(line);
			}
			in.close();
			out.close();
			reader.close();
			br.close();
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
	
//	public static void charCopy(InputStream in, OutputStream out) {
//		try {
//			
//		} catch (IOException e) {
//			throw new RuntimeException();
//		}
//	}

}
