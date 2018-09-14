package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class codeLine {
	
	int codeline=0;
	String fileDirectory;
	String REGEX="\\s+";
	
	public void codeLine() {//¶ÁÈ¡´úÂëÐÐ
		try {
			String s;
			String s1[];
			Pattern p=Pattern.compile(REGEX);
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				if(s.matches("[\\s]*")) continue; 
				else {
					s1=p.split(s.trim());
					if(s1.length>1||s1[0].length()>1)codeline++;
				}
			}
			br.close();
			
			commentLine cl=new commentLine();
			cl.setFileDirectory(fileDirectory);
			cl.commentLine();
			
			codeline-=cl.commentline;
			
		}catch(Exception e) {
			
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
}
