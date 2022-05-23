import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
	@Test
	public void snippet1() throws IOException {
		String content = Files.readString(Path.of("lab4-test1.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("`google.com", "google.com", "ucsd.edu"));

        assertArrayEquals(result.toArray(), links.toArray());
	}
	@Test
	public void snippet2() throws IOException {
		String content = Files.readString(Path.of("lab4-test2.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("a.com", "a.com(())", "example.com"));

        assertArrayEquals(result.toArray(), links.toArray());
	}
	@Test
	public void snippet3() throws IOException {
		String content = Files.readString(Path.of("lab4-test3.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));

        assertArrayEquals(result.toArray(), links.toArray());
	}


}

