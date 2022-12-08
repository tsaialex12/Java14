package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hw07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		int count = 0;
		FileReader fr=new FileReader("c:\\Java\\donkey.txt");
		BufferedReader bfr = new BufferedReader(fr);
		while ((str =bfr.readLine())!=null) {
			if(count==1) {
			  bfr.skip(str.length());
			}
			System.out.print(str);
			count++;
		}
		fr.close();
	}

}
