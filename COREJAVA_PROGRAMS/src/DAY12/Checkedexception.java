package DAY12;

public class Checkedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the string: ");
			String str = br.readLine();
			// br.close(); The BufferedReader will be closed automatically when the try
			// block is exited, regardless of whether an exception is thrown or not.
			return str;

	}

}