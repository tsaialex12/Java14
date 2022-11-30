package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hw04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\Java\\donkey.text");
		char data[] = new char [120]
		int num = fr.read(data);
		Stringmstr = new String(data,0,num);
		System.out.println("字元數="+num);
		System.out.print(str);
	}

}
