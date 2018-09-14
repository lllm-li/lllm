package wc;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wildCard {
	
	public static File[] getFiles(String filepath,String filename) {
	     File file = new File(filepath);
	     filename=filename.replace("*", ".*");
	     filename=filename.replace("?", ".?");
	     Pattern p = Pattern.compile(filename);
	     ArrayList<File> list = filePattern(file, p);
	     File f[]= new File[list.size()];
	     return list.toArray(f);
	   }
	
	private static ArrayList<File> filePattern(File file, Pattern p) {  
		if (file.isFile()) {
		       Matcher matcher= p.matcher(file.getName());
		       if (matcher.matches()) {
		         ArrayList<File> list = new ArrayList<File>();
		         list.add(file);
		         return list;
		       }
		     }
		     else if (file.isDirectory()) {
		       File[] files = file.listFiles();
		       if (files!=null && files.length>0) {
		         ArrayList<File> list = new ArrayList<File>();
		         for (int i = 0; i < files.length; i++) {
		           ArrayList<File> rlist =filePattern(files[i], p);
		           if (rlist != null) {
		             list.addAll(rlist);
		           }
		         }
		         return list;
		       }
		     }
		     return null;
	}
}
