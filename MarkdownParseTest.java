import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class MarkdownParseTest {
	@Test
	public void snippet1() {
		String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));

        assertArrayEquals(result.toArray(), links.toArray());
	}
	@Test
	public void snippet2() {

	}
	@Test
	public void snippet3() {

	}


}

