import java.io.*;
public class File1
{
	public static void main(String[] x)throws Exception
	{
		File f = new File("C:/Users/Hardik/Documents/Java assignment 1/Day10/abc.txt");
		
		try{
			FileInputStream fin = new FileInputStream(f);
			
			int i = fin.read();
			
			while(i!=-1)
			{
				System.out.print(i + " : " + (char)i);
				i = fin.read();
			}
				fin.close();
		}
	
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.print("File path: " + f.getPath());
	}
}