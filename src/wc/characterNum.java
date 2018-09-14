package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class characterNum {

	int characternum=0;
	String fileDirectory;
	private static final String REGEX="\\s+";
	
	public void characterNum(){//¶ÁÈ¡×Ö·ûÊý
		try {
			String s;
			String s1[];
			Pattern p=Pattern.compile(REGEX);
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				if(s.matches("[\\s]*")) continue;
				else {
					s1=s.split(REGEX);
					for(int i=0;i<s1.length;i++)characternum+=s1[i].length();
				}
			}
			br.close();
		}catch(Exception e) {
			
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
	
}
