import java.util.ArrayList;


/**
 * This class reads in a book and parses it into an ArrayList
 * of Letter, Word and Quote types.
 * @author sgb
 *
 */
public class BookReader {
	private ArrayList<Letter> letters = new ArrayList<>();
	private FileReader bookFile;
	private ReaderUtility utils;
	/**
	 * This is the constructor. It takes in the file name for the
	 * book, parses the text, and then builds
	 * an ArrayList of type Letter, Word or Quote to hold the data.
	 * @param file
	 */
	public BookReader(String file) {
		bookFile = new FileReader(file);
		ArrayList<String> rawData = bookFile.getLines();
		utils = new ReaderUtility();

		for (int i = 0; i < rawData.size(); i++) {
			String line = rawData.get(i);
			
			//Create Letter object
			Letter letter = new Letter();
			//add to letters AL
			letters.add(letter);
		}
	}
	/**
	 * Return the letters ArrayList
	 * @return the arraylist of letters
	 */
	public ArrayList<Letter> getLettersArray() {
		return letters;
	}
}




