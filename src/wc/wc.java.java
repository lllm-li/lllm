package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wc {
	public static void main(String args[]) throws IOException {
		
		int charnum=0;//�ַ���
		int wordnum=0;//������
		int rownum=0;//����
		
        
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lllm\\eclipse-workspace\\wc\\src\\wc.java"));
		while((br.readLine())!=null) {
			rownum++;
		}
		
		br.close();
		
		System.out.println(rownum);
	}

	
}
