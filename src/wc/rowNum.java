package wc;

import java.io.BufferedReader;
import java.io.FileReader;

public class rowNum {
	
	int rownum=0;
	String fileDirectory;
	
	public void rowNum(){//��ȡ����
		try {
			String s;
			BufferedReader br=new BufferedReader(new FileReader(fileDirectory));
			while((s=br.readLine())!=null) {
				rownum++;
			}
			br.close();
		}catch(Exception e) {
			
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}

}
