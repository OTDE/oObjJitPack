package com.owens.oobjloader.builder;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.owens.oobjloader.parser.Parse;

public class BuildTest {
	public static void main(String[] args) {
		Build b = new Build();
		try {
			Parse p = new Parse(b, "C:\\Users\\Seth\\sphere.obj");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b.testMaterialParsing();
	}
}
