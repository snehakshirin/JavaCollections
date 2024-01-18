package Filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws IOException {

		File file1= new File("./textfile.txt");
		
		//create and delete the file
		if (file1.exists())
			file1.delete();
			file1.createNewFile();
		file1.createNewFile();
		
		//create the directory
		File folder1 = new File("./text");
		folder1.mkdir();
		
		//checking read, write permission of file and setting the permissions
		System.out.println(file1.canRead());
		file1.setReadOnly();
		System.out.println(file1.canWrite());
		file1.setWritable(true);
		System.out.println(file1.canWrite());

		System.out.println(file1.isHidden());
		System.out.println(file1.canExecute());
		
		//writing in the file
		Path file1path = Path.of("./textfile.txt");
		Files.writeString(file1path, "welcome to file handling!");
		
		//reading from the file
		System.out.println(Files.readString(file1path));
		
		// see all the files present in the folder
		File parentFolder = new File(file1.getParent());
		System.out.println(Arrays.toString(parentFolder.list())); //prints files and folders exists in the path
		System.out.println(Arrays.toString(parentFolder.listFiles())); //prints entire path


		// some file methods
		System.out.println(file1.getAbsolutePath());
		
		System.out.println(file1.getCanonicalPath());
		
		System.out.println(file1.getName());
		
		System.out.println(file1.getParent());
		
		System.out.println(file1.isDirectory());
		
		System.out.println(file1.isFile());
		
		System.out.println(new Date(file1.lastModified()));
		
	
		
		
		
		
		
		
		
	}

}
