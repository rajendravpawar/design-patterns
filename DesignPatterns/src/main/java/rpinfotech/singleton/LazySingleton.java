/**
 * 
 */
package rpinfotech.singleton;

import java.time.LocalDateTime;

/**
 * @author Rajendra Pawar
 *
 */
public class LazySingleton {
	private static LazySingleton INSTANCE;
	static LocalDateTime myCreationTime ;
	private LazySingleton()
	{
		System.out.println(""+LazySingleton.class.getName() +" initialiszed !!!");
	}
	public static LazySingleton getInstance()
	{

		if(INSTANCE == null)
		{
			INSTANCE = new LazySingleton();
			myCreationTime = LocalDateTime.now();
			
		}
		return INSTANCE;
	}
	public String myCreatedTime()
	{
		return "My creation Time : "+myCreationTime;
	}

}
