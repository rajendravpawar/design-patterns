/**
 * 
 */
package rpinfotech.singleton;

import java.time.LocalDateTime;

/**
 * @author Rajendra Pawar
 *
 */
public class LazySingletonWithDoubleChecking {
	private static LazySingletonWithDoubleChecking INSTANCE;
	static LocalDateTime myCreationTime ;
	private LazySingletonWithDoubleChecking()
	{
		System.out.println(""+LazySingletonWithDoubleChecking.class.getName() +" initialiszed !!!");
	}
	public static LazySingletonWithDoubleChecking getInstance()
	{
		if( INSTANCE == null)
		{
			synchronized (LazySingletonWithDoubleChecking.class) { // Synchronized block for thread safe
				if(INSTANCE == null) // Double null check, so its called Double lock checking 
				{
					INSTANCE = new LazySingletonWithDoubleChecking();
					myCreationTime = LocalDateTime.now();

				}

			}
		}
		return INSTANCE;
	}
	public String myCreatedTime()
	{
		return "My creation Time : "+myCreationTime;
	}

}
