package com.example.demo.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSupport {

	/**
	 * 3.2. New File Methods
	 * @throws IOException
	 */
	public static void validate() throws IOException {
		Path tempDir = Path.of("/tmp");
		Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
		@SuppressWarnings("unused")
		String fileContent = Files.readString(filePath);
		System.out.println("FileContent: " + fileContent);
		//assertThat(fileContent).isEqualTo("Sample text");
	}
}
