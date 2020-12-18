/**
 * 
 */
package lab6_exercise1;

/**
 * @author as02795
 *
 */
public class Player {
	private String name;
	private RugbyPosition position;
	
	public Player(String name, RugbyPosition position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public RugbyPosition getPosition() {
		return position;
	}
}
