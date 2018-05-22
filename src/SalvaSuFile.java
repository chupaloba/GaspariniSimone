import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SalvaSuFile 
{
	public static void main(String[] args) 
	{
		SalvaSuFile p1=new SalvaSuFile();
		SalvaSuFile p2=new SalvaSuFile();
		SalvaSuFile p3=new SalvaSuFile();
		
		String indirizzo1="via x";
		String indirizzo2="via y";
		String indirizzo3= "via z";
		
		try 
		{
			FileOutputStream file1=new FileOutputStream("SalvaSuFile.bin");
			ObjectOutputStream writer=new ObjectOutputStream(file1);
			
			writer.writeObject(p1);
			writer.writeObject(indirizzo1);
			writer.writeObject(p2);
			writer.writeObject(indirizzo2);
			writer.writeObject(p3);
			writer.writeObject(indirizzo3);
			
			writer.flush();
			
			file1.close();
			System.out.println("Scrittura eseguita con successo");
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File non trovato");
		} 
		catch (IOException e) 
		{
			System.out.println("Impossibile scrivere sul file");
			e.printStackTrace();
		}
		
		FileInputStream file2 = null;
		SalvaSuFile p;
		String indirizzo;
		try 
		{
			file2= new FileInputStream("SalvaSuFile.bin");
			@SuppressWarnings("resource")
			ObjectInputStream reader= new ObjectInputStream(file2);
			
			while (true)
			{
				p=(SalvaSuFile)reader.readObject();
				indirizzo=(String)reader.readObject();
				System.out.println(p+" "+indirizzo);
			}	
		} 
		catch (EOFException e)
		{
			try 
			{
				file2.close();
			} 
			catch (IOException e1) 
			{
				System.out.println("Impossibile chiudere dal file");
			}
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File non trovato");
		} 
		catch (IOException e) 
		{
			System.out.println("Impossibile leggere dal file");	
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("impossibile caricare oggetti di tipo SalvaSuFile");
		}
	}
}
