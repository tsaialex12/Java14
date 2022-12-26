import java.io.*;
public class Class08 {
    public static void main(String[] args) throws IOException {
        InputStream s1 =new FileInputStream("C:\\Users\\skes9\\Desktop\\aaa.txt");
        InputStream s2 =new FileInputStream("C:\\Users\\skes9\\Desktop\\bbb.txt");

        SequenceInputStream s3 = new SequenceInputStream(s1,s2);

        BufferedOutputStream ans = new BufferedOutputStream(new FileOutputStream("C:\\Users\\skes9\\Desktop\\ccc.txt"));
        byte[]  bys= new byte[1024];
        int count=0;
        while((count= s3.read(bys))!=-1) {
            ans.write(bys,0,count);
        }
        System.out.println("合併完成\n檔案位於: C:\\Users\\skes9\\Desktop\\ccc.txt");
        ans.close();
        s3.close();
    }
}
