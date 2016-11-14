package com.generic;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToCSV {
	
//Delimiter used in CSV file
public static final String COMMA_DELIMITER = ",";
public static final String NEW_LINE_SEPARATOR = "\n";
static FileWriter fileWriter = null;
public static void writeCsvFile(String fileNames) {

	String fileName = System.getProperty("user.dir")+"/"+fileNames;
				System.out.println(fileName);
	
		try {
			fileWriter = new FileWriter(fileName,true);
		
			//Write a new student object list to the CSV file
		
				fileWriter.append("Name");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append("password");
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
		

			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}

}
