/**
 * 
 */
package rpinfotech.singleton;

/**
 * @author Rajendra Pawar
 *
 */
public class DemoLazySingletonWithDoubleChecking_3 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println("Lasy Singletone creation time + "+lazySingleton.myCreatedTime());
		Thread.sleep(3000);
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println("Checking Lasy Singletone creation time + "+lazySingleton2.myCreatedTime());
	}

}
