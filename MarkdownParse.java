//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
	

    public static ArrayList<String> getLinks(String markdown) {
	    ArrayList<String> toReturn = new ArrayList<>();
	    // find the next [, then find the ], then find the (, then read link upto next )
	    int currentIndex = markdown.indexOf("[");
	    while (currentIndex > -1 && currentIndex + 1 < markdown.length()) {
		    int openBracket = markdown.indexOf("[", currentIndex);
		    int closeBracket = markdown.indexOf("]", openBracket);
		    int openParen = markdown.indexOf("(", closeBracket);
		    closeBracket = trueClose(openParen, markdown, closeBracket);
		    int closeParen = markdown.indexOf(")", openParen);
		    if (openBracket == 0 || markdown.substring(openBracket - 1, openBracket).compareTo("!") != 0) {
			    toReturn.add(markdown.substring(openParen + 1, closeParen));
		    }
			
			
		    currentIndex = markdown.indexOf("[", closeParen);
	    }
			return toReturn;
    }
	public static int trueClose(int open_paren, String markdown, int close_brack){
		
		while(close_brack < markdown.indexOf("(", close_brack)){
			close_brack = markdown.indexOf("]", close_brack);
		}
		return close_brack;
	}
	
	    public static void main (String[]args) throws IOException {
		    Path fileName = Path.of(args[0]);
		    String content = Files.readString(fileName);
		    ArrayList<String> links = getLinks(content);
		    System.out.println(links);
	    }
    }
