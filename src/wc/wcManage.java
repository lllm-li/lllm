package wc;

public class wcManage {
	
	String fileDirectory;
	
	void rowNumPrint(){
		rowNum rn=new rowNum();
		rn.setFileDirectory(fileDirectory);
		rn.rowNum();
		System.out.println("行数:"+rn.rownum);
	}
	
	void wordNumPrint(){
		wordNum wn=new wordNum();
		wn.setFileDirectory(fileDirectory);
		wn.wordNum();
		System.out.println("词数:"+wn.wordnum);
	}
	
	void characterNumPrint(){
		characterNum cn=new characterNum();
		cn.setFileDirectory(fileDirectory);
		cn.characterNum();
		System.out.println("字符数:"+cn.characternum);
	}
	
	void blankLinePrint() {
		blankLine bl=new blankLine();
		bl.setFileDirectory(fileDirectory);
		bl.blankLine();
		System.out.println("空行数:"+bl.blankline);
	}
	
	void codeLinePrint() {
		codeLine cl=new codeLine();
		cl.setFileDirectory(fileDirectory);
		cl.codeLine();
		System.out.println("代码行:"+cl.codeline);
	}
	
	void commentLinePrint() {
		commentLine cl=new commentLine();
		cl.setFileDirectory(fileDirectory);
		cl.commentLine();
		System.out.println("注释行:"+cl.commentline);
	}
	
	void recursivePrint() {
		Recursive r=new Recursive();
		r.setFileDirectory(fileDirectory);
		System.out.println("所查询匹配的文件:");
		r.Recursive();
	}
	
	void setFileDirectory(String fileDirectory) {
		this.fileDirectory=fileDirectory;
	}
}
