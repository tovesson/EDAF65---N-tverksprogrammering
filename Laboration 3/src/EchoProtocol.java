
public class EchoProtocol {

	/**
	 * Process the input from a client
	 * 
	 * @param input
	 *            the input
	 * @return the output
	 */
	public String processInput(String input) {

		// Processes the input
		String output = null;
		if (input.startsWith("e ")) {
			output = input.substring(2);
		} else if (input.equals("q")) {
			output = "Client connection closed";
		} else if (input.equals("q server")) {
			output = "Server connection closed";
		} else {
			output = "Whut?";
		}
		return output;
	}
}
