import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Word_1 {

	public static void main(String[] args) throws IOException {
		
		
		XWPFDocument doc= new XWPFDocument();
		FileInputStream fi=new FileInputStream("D:\\writeword1.docx");
		//
		XWPFParagraph pf=doc.createParagraph();
		XWPFRun run=pf.createRun();
		run.setText("this is 1st in doc");
		
		//FileOutputStream fo=new FileOutputStream("D:\\\\writeword1.docx");
		

	}

}
