package com.mygroup.project.annotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.mygroup.project.abs.FileCaller;

public class CustomReader implements FileCaller {

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void ReadLineByLine() throws IOException {
		try {
			FileReader fr = new FileReader(
					"D:/SB/march/custom annotations/simple-java-maven-app/src/main/java/com/mygroup/project/annotations/filenam.txt");
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("Contents of File: ");
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
