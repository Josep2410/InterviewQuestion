import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		// create file for compare.txt
		File compare_file = new File("compare.txt");
		// create file for input.txt
		File input_file = new File("input.txt");

		try {

			// create scanner for compare.txt
			Scanner sc_compare_file = new Scanner(compare_file);
			
			// create scanner for input.txt
			Scanner sc_input_file = new Scanner(input_file);

			// arraylist to store compare.txt lines
			ArrayList<String> list_compare_file = new ArrayList<>();

			// iterating and storing all lines of compare.txt to arraylist
			while (sc_compare_file.hasNextLine()) {
				list_compare_file.add(sc_compare_file.nextLine());
			}

			// iterating and comparing each line compare.txt to input.txt lines, if found, print that
			while (sc_input_file.hasNextLine()) {
				String nextLine = sc_input_file.nextLine();
				for (int i = 0; i < list_compare_file.size(); i++) {
					if(nextLine.contains(list_compare_file.get(i))) {
						System.out.println(nextLine);
					}
				}
			}

			//close scanner objects
			sc_input_file.close();
			sc_compare_file.close();

			// catch is used to catch exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
