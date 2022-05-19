/**
 * 
 */
package rpinfotech.builder;

/**
 * @author Rajendra Pawar
 *
 */
public class Computer {

	String motherboard;
	String ram;
	String fan;
	String smpsSupply;
	String keyboard;
	String mouse;
	String display;
	String cables;
	
	private Computer() {}
	
	private Computer(ComputerBuilder computerBuilder )
	{
		motherboard = computerBuilder.motherboard;
		ram  = computerBuilder.ram;
		fan =  computerBuilder.fan;
		smpsSupply = computerBuilder.smpsSupply;
		keyboard =  computerBuilder.keyboard;
		mouse =  computerBuilder.mouse;
		display =  computerBuilder.display;
		cables = computerBuilder.cables;
	}
	/**
	 * @return the motherboard
	 */
	public String getMotherboard() {
		return motherboard;
	}
	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}
	/**
	 * @return the fan
	 */
	public String getFan() {
		return fan;
	}
	/**
	 * @return the smpsSupply
	 */
	public String getSmpsSupply() {
		return smpsSupply;
	}
	/**
	 * @return the keyboard
	 */
	public String getKeyboard() {
		return keyboard;
	}
	/**
	 * @return the mouse
	 */
	public String getMouse() {
		return mouse;
	}
	/**
	 * @return the display
	 */
	public String getDisplay() {
		return display;
	}
	/**
	 * @return the cables
	 */
	public String getCables() {
		return cables;
	}
	@Override
	public String toString() {
		return "Computer [motherboard=" + motherboard + ", ram=" + ram + ", fan=" + fan + ", smpsSupply=" + smpsSupply
				+ ", keyboard=" + keyboard + ", mouse=" + mouse + ", display=" + display + ", cables=" + cables + "]";
	}

	public static class ComputerBuilder {
		String motherboard;
		String ram;
		String fan;
		String smpsSupply;
		String keyboard;
		String mouse;
		String display;
		String cables;
		
		/**
		 * @param motherboard the motherboard to set
		 */
		public ComputerBuilder setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}
		/**
		 * @param ram the ram to set
		 */
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		/**
		 * @param fan the fan to set
		 */
		public ComputerBuilder setFan(String fan) {
			this.fan = fan;
			return this;
		}
		/**
		 * @param smpsSupply the smpsSupply to set
		 */
		public ComputerBuilder setSmpsSupply(String smpsSupply) {
			this.smpsSupply = smpsSupply;
			return this;
		}
		/**
		 * @param keyboard the keyboard to set
		 */
		public ComputerBuilder setKeyboard(String keboard) {
			this.keyboard = keboard;
			return this;
		}
		/**
		 * @param mouse the mouse to set
		 */
		public ComputerBuilder setMouse(String mouse) {
			this.mouse = mouse;
			return this;
		}
		/**
		 * @param display the display to set
		 */
		public ComputerBuilder setDisplay(String display) {
			this.display = display;
			return this;
		}
		/**
		 * @param cables the cables to set
		 */
		public ComputerBuilder setCables(String cables) {
			this.cables = cables;
			return this;
		}
		public Computer build()
		{
			return new Computer(this);
		}

	}

}
