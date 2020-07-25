package ua.lviv.lgs;

import java.io.*;

public class Methods 
{
	public void serialize(Object object) throws FileNotFoundException, IOException
	{
		ObjectOutputStream fileOS = new ObjectOutputStream(new FileOutputStream("src\\ua\\lviv\\lgs\\savedData.txt"));
		
		fileOS.writeObject(object);
		
		fileOS.close();
	}
	
	public Object deserialize() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream fileIS = new ObjectInputStream(new FileInputStream("src\\ua\\lviv\\lgs\\savedData.txt"));
		
		Object returnValue = fileIS.readObject();
		
		fileIS.close();
		
		return returnValue;
	}
}
