package rpinfotech.singleton;

import java.io.Serializable;

/**
 * 
 * @author Rajendra Pawar
 *
 */
public class BasicSingletonWithSerialization implements Serializable {


	private static BasicSingletonWithSerialization INSTANCE = new BasicSingletonWithSerialization();

	// Step 1: Make Private Constructor
	private BasicSingletonWithSerialization() {
	}
	
	// Step 2: Provide getInstance method which give instance
	public static BasicSingletonWithSerialization getInstance()
	{
		return INSTANCE;
	}


	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	private Object readResolve()
	{
		return INSTANCE;
	}

}
