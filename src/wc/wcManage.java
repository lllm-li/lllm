package wc;

public class wcManage {
	
	String fileDirectory;
	
	void rowNumPrint(){
		rowNum rn=new rowNum();
		rn.setFileDirectory(fileDirectory);
		rn.rowNum();
		System.out.println("����:"+rn.rownum);
	}
	
	void wordNumPrint(){
		wordNum wn=new wordNum();
		wn.setFileDirectory(fileDirectory);
		wn.wordNum();
		System.out.println("����:"+wn.wordnum);
	}
	
	void characterNumPrint(){
		characterNum cn=new characterNum();
		cn.setFileDirectory(fileDirectory);
		cn.characterNum();
		System.out.println("�ַ���:"+cn.characternum);
	}
	
	void blankLinePrint() {
		blankLine bl=new blankLine();
		bl.setFileDirectory(fileDirectory);
		bl.blankLine();
		System.out.println("������:"+bl.blankline);
	}
	
	void codeLinePrint() {
		codeLine cl=new codeLine();
		cl.setFileDirectory(fileDirectory);
		cl.codeLine();
		System.out.println("������:"+cl.codeline);
	}
	
	void commentLinePrint() {
		commentLine cl=new commentLine();
		cl.setFileDirectory(fileDirectory);
		cl.commentLine();
		System.out.println("ע����:"+cl.commentline);
	}
	
	void recursivePrint() {
		Recursive r=new Recursive();
		r.setFileDirectory(fileDirectory);
		System.out.println("����ѯƥ����ļ�:");
		r.Recursive();
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
}
