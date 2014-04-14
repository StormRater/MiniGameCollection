package saveHandling;

public abstract class SaveHandler {

	
	/*
	 * Override to save data as according
	 * to that game's methodology
	 */
	void saveGame(){
		// score/ high score
		// progress
		// turn
	}
	
	/*
	 * Override to load saved data as
	 * according to that game's 
	 * methodology
	 */
	void loadGame(){
		//begin running the game
	}
}
