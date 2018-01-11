package io.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("file.txt")));
		System.out.println(br.readLine());
	}
}
