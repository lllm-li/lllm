package wc;

import java.io.File;

public class Recursive {

	String fileDirectory;
	File fs[];
	
	public void Recursive() {//��ȡĿ¼�µ��ļ�
		File file=new File(fileDirectory);
		file=new File(file.getParent());
		fs=file.listFiles();
		for(File f:fs) {
			if(!f.isDirectory()) {
				System.out.println("  "+f);
			};
		}
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
	
	void setfs(File fs[]) {
		this.fs=fs;
	}
	
}
