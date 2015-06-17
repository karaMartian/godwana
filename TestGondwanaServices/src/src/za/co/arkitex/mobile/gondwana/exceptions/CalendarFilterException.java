package za.co.arkitex.mobile.gondwana.exceptions;

public class CalendarFilterException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalendarFilterException() {
		super("Calendar Filter could not process request");
	}
	public CalendarFilterException(String message) {
		super(message);
	}
}
