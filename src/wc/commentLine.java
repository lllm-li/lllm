package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class commentLine {

	int commentline=0;
	String fileDirectory;
	
	public void commentLine() {//¶ÁÈ¡×¢ÊÍÐÐ
		try {
			String s;
			int i=0,j=0;
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				 i++;
				 if(s.indexOf("//")!=-1)commentline++;
				 if(s.indexOf("/*")!=-1) j=i;
				 if(s.indexOf("*/")!=-1) commentline+=i-j+1;
			}
			br.close();
		}catch(Exception e) {
			
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
	
}
