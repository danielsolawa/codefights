package com.danielsolawa.codefights.core.solutions;

public class HtmlEndTagByStartTag {

	String htmlEndTagByStartTag(String startTag) {
		int index = 0;
		for(int i = 1; i < startTag.length(); i++) {
			if(!Character.isLetter(startTag.charAt(i))) {
				index = i;
				break;
			}
		}
	
		return "</" +  startTag.substring(1, index) + ">";
	}
}
