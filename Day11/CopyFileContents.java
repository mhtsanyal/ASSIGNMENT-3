import java.io.*;
public class CopyFileContents
{
	public static void main(String[] x)
	{
		File f1 = new File("C:/Users/Hardik/Documents/myfile.txt");
		File f2 = new File("C:/Users/Hardik/Documents/myfile1.txt");
		
		int i;
		try{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			i = fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i = fin.read();
				
			}
				fin.close();
				fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}