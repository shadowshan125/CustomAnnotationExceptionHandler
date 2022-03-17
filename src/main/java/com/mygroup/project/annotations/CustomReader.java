package com.mygroup.project.annotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mygroup.project.abs.FileCaller;

public class CustomReader implements FileCaller {
	private static final Logger log = LoggerFactory.getLogger(CustomReader.class);

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void ReadLineByLineExample1() throws IOException {
		try {
			FileReader fr = new FileReader(
					"D:/SB/march/custom annotations/simple-java-maven-app/src/main/java/com/mygroup/project/annotations/filename.txt");
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
