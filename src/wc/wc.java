package wc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wc {
	
	public static void main(String args[]) throws IOException {
		
		wcManage wcmanage=new wcManage();
		File f1=new File(args[1]);
		String s=f1.getName();
		 
		wildCard fs=new wildCard();
		File fk[]=fs.getFiles(f1.getParent(), s);
		   for(File f:fk) {
			   wcmanage.setFileDirectory(f.getAbsolutePath());
			   if(args[0].equals("-l")) {
				   System.out.println(f);
				   wcmanage.rowNumPrint();
			   }
			   if(args[0].equals("-w")) {
				   System.out.println(f);
				   wcmanage.wordNumPrint();
			   }
			   if(args[0].equals("-c")) {
				   System.out.println(f);
				   wcmanage.characterNumPrint();
			   }
			   if(args[0].equals("-a")) {
				   System.out.println(f);
				   wcmanage.blankLinePrint();
				   wcmanage.codeLinePrint();
				   wcmanage.commentLinePrint();
				}
		   }
		if(args[0].equals("-s"))wcmanage.recursivePrint();
	}	
}
