package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class hw02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String str;
		int count=0;
		FileReader fr =new FileReader("c:\\Java\\donkey.text");
		BufferedReader bfr = new BufferedReader(fr);
		while((str = bfr.readLine())!=null) {
			if(count==1) {
				bfr.skip(14);
			}
			System.out.print(str);
			count ;
		}
		fr.close();
	}

}
