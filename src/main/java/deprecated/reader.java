//package deprecated;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//import com.mygroup.project.annotations.Check;
//import com.mygroup.project.annotations.HandleException;
//
//public class reader {
//
//	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
//	public String readTextFilem() throws NullPointerException {
//		System.out.println("Inside Reader");
//
//		String fileContent = "";
//		BufferedReader br = null;
//		;
//		try {
//			System.out.println("Inside Reader try");
//
//			br = new BufferedReader(new FileReader(
//					"D:/SB/march/custom annotations/simple-java-maven-app/src/main/java/com/mygroup/project/annotations/TextFile.txt"));
//			System.out.println("file finded ");
//
//			StringBuilder sb = new StringBuilder();
//			String fileLine = "";
//			while ((fileLine = br.readLine()) != null) {
//				System.out.println(fileLine);
//				sb.append(fileLine);
//				sb.append(System.lineSeparator());
//			}
//			fileContent = sb.toString();
//			System.out.println("file read completed ");
//			br.close();
//		} catch (IOException ioe) {
//			ioe.getMessage();
//		}
//
//		return fileContent;
//	}
//
//	@Override
//	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
//	public void readTextFile() throws Throwable {
//		System.out.println("Inside Reader");
//
//		String fileContent = "";
//		BufferedReader br = null;
//		try {
//			System.out.println("Inside Reader try");
//
//			br = new BufferedReader(new FileReader(
//					"D:/SB/march/custom annotations/simple-java-maven-app/src/main/java/com/mygroup/project/annotations/TextFile.txt"));
//			System.out.println("file finded ");
//
//			StringBuilder sb = new StringBuilder();
//			String fileLine = "";
//			while ((fileLine = br.readLine()) != null) {
//				System.out.println(fileLine);
//				sb.append(fileLine);
//				sb.append(System.lineSeparator());
//			}
//			fileContent = sb.toString();
//			System.out.println("file read completed ");
//			br.close();
//		} catch (IOException ioe) {
//			ioe.getMessage();
//		}
//		LOGGER.info("schemaValidation - START");
//
//	}
//}
