/**
 * 
 */
package rpinfotech.builder;

/**
 * @author Rajendra Pawar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder()
				.setMotherboard("Intel Motherboad")
				.setRam("32 GB DDR RAM")
				.setSmpsSupply("12 V SMPS")
				.setCables("Cables")
				.setDisplay("32 Inch Sony ")
				.setFan("2 Fans")
				.setKeyboard("Logitech Keyboard")
				.setMouse("Logitech Mouse")
				.build();
		
		System.out.println(computer);
				

	}

}
