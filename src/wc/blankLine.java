package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class blankLine {
	
	String fileDirectory;
	int blankline=0;
	private static final String REGEX="\\s+";
	
	public void blankLine(){//¶ÁÈ¡¿ÕÐÐÊý
		try {
			String s;
			String s1[];
			Pattern p=Pattern.compile(REGEX);
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				if(s.matches("[\\s]*")) blankline++;
				else {
					s1=p.split(s.trim());
					if(s1[0].length()==1&&s1.length==1)blankline++;
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
