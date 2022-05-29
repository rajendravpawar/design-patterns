package rpinfotech.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoBasicSingletonWithSerialization_1 {
	
	public static void main(String []args) {

		BasicSingletonWithSerialization basicSingletonInstance = BasicSingletonWithSerialization.getInstance();
		basicSingletonInstance.setValue(10);

		System.out.println( "Value : "+ basicSingletonInstance.getValue() );
		saveToFile(basicSingletonInstance, "DataStorage.temp");
		basicSingletonInstance.setValue(20);
		System.out.println( "After storing Value : "+ basicSingletonInstance.getValue() );

		BasicSingletonWithSerialization basicSingletonInstanceNew = readFromFile("DataStorage.temp");

		System.out.println( "Checking object Value after getting Object from file : "+ basicSingletonInstanceNew.getValue() );

	}

	private static BasicSingletonWithSerialization readFromFile(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis); 
				)
		{
			return (BasicSingletonWithSerialization) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	private static void saveToFile(BasicSingletonWithSerialization basicSingletonInstance, String fileToSave) {

		try (
				FileOutputStream fos = new FileOutputStream(fileToSave);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos))
		{
			objectOutputStream.writeObject(basicSingletonInstance);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
