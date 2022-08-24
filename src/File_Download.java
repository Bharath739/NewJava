import java.io.File;

public class File_Download {

	// C:\Users\acer\Downloads

	public void readFile(String path) {

		File file = new File(path);
		String name = null;

		boolean prsnt = false;

		File[] fl = file.listFiles();

		for (File list : fl) {

			name = list.getName();
			
			
			if (list.getName().equals("Final PPT(1).pdf")) {
				
				System.out.println(name + "+  file found");

				break;

			} else {

				System.out.println("file not found");

			}

			// prsnt=list.getName().contains("Risk Management");

		}

	}

	public static void main(String[] args) {

		File_Download ff = new File_Download();

		ff.readFile("C:\\Users\\acer\\Downloads");

	}

}
