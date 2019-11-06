package json;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.*;

public class SendReadJson {

	public static void main(String[] args) {
		// call toJson method
		toJson();
		// call fromJson method
		fromJson();

	}

	private static void toJson() {
		TeamObject team = new TeamObject("Michigan", "Wolverines", 958);

		try (FileWriter file = new FileWriter("team.json")) {
			// create Gson object
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			System.out.println("Writing JSON to file..");
			// convert to Json and write to file
			file.write(gson.toJson(team));
			file.flush();

			System.out.println("File created!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void fromJson() {

		Gson gson = new Gson();
		try {
			// Read json from file and create object
			System.out.println("\nReading JSON from file.");
			TeamObject team1 = gson.fromJson(new FileReader("team.json"), TeamObject.class);
			System.out.println("New object created from JSON file  ====> " + team1);

		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
