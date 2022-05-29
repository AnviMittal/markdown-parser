import static org.junit.Assert.*;

import java.util.ArrayList;
    import java.util.Arrays;

    import org.junit.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MarkdownParseTest {
	@Test
    public void snipett1() throws IOException{
        String content = Files.readString(Path.of("test-file9.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("`google.com", "google.com", "ucsd.edu"));
        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void snipett2() throws IOException{
        String content = Files.readString(Path.of("test-file10.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("a.com", "a.com(())", "example.com"));
        assertArrayEquals(result.toArray(), links.toArray());

    }
    @Test
    public void snipett3() throws IOException{
        String content = Files.readString(Path.of("test-file11.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList
        ("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));
        assertArrayEquals(result.toArray(), links.toArray());
    }
}