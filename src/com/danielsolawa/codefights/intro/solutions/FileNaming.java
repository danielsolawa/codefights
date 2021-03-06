package com.danielsolawa.codefights.intro.solutions;
import java.util.HashSet;
import java.util.Set;

public class FileNaming {

	
	String[] fileNaming(String[] names) {
		Set<String> set = new HashSet<>();
		String[] fileNames = new String[names.length];
		
		
		for(int i = 0; i < names.length; i++) {
			String name = names[i];
			if(!set.contains(name)) {
				set.add(name);
				fileNames[i] = name;
			}
			else {
				int k = 0;
				String newName = name;
				while(set.contains(newName)) {
					k++;
					newName = name + "(" + k + ")";
				}
				
				set.add(newName);
				fileNames[i] = newName;
	
			}
	
		}
		
		
		return fileNames;
	}
}
