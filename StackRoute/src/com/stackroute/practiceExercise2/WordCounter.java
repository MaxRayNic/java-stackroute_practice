package com.stackroute.practiceExercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

	public Object countWords(String fileName) {
		Map<String, Integer> map = new HashMap<>();
		Path file = Paths.get(fileName);
		try (final InputStream in = Files.newInputStream(file);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				Scanner sc = new Scanner(line);
				while (sc.hasNext()) {
					String str = sc.next();
					if (map.containsKey(str)) {
						int val = map.get(str);
						val++;
						map.put(str, val);
					} else
						map.put(str, 1);
				}
				sc.close();
			}
		} catch (IOException x) {
			System.err.println(x);
		}
		if (map.isEmpty())
			return null;
		return map;
	}

}
