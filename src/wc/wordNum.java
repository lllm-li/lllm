package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class wordNum {

	int wordnum=0;
	String fileDirectory;
	private static final String REGEX="\\W+";
	
	public void wordNum(){//读取词的数目
		try {
			String s;
			Pattern p=Pattern.compile(REGEX);
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				if(s.matches("[\\s]*"))continue;
				 wordnum+=p.split(s).length;
			}
			br.close();
		}catch(Exception e) {
			
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
	
}
