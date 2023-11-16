package org.end;

import java.io.IOException;

public class Worked extends baseClass {

	public static void main(String[] args) throws IOException {

		createNewExcelFile(0, 0, "selenium");
		createCell(0, 1, "Java");
		createCell(0, 2, "Data Driven");
		createCell(0, 3, "POM");

		createRow(1, 0, "Appium");
		createCell(1, 1, "cucumber");
		createCell(1, 2, "Junit");
		createCell(1, 3, "TestNG");
	}
}
