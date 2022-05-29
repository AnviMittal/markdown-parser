import static org.junit.Assert.*;

import java.util.ArrayList;
    import java.util.Arrays;

    import org.junit.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MarkdownParseTest {

    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    @Test
    public void testFile1() throws IOException {

        String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }



    @Test
    public void testFile2() throws IOException {

        String content = Files.readString(Path.of("test-file2.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));

        assertArrayEquals(result.toArray(), links.toArray());
    }



    @Test
    public void testFile3() throws IOException {

        String content = Files.readString(Path.of("test-file3.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }



    @Test
    public void testFile4() throws IOException {

        String content = Files.readString(Path.of("test-file4.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("actual_link.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }


    @Test
    public void p6TestFile1() throws IOException {

        String content = Files.readString(Path.of("part6/test-file.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile2() throws IOException {

        String content = Files.readString(Path.of("part6/test-file2.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-page.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile3() throws IOException {

        String content = Files.readString(Path.of("part6/test-file3.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>();

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile4() throws IOException {

        String content = Files.readString(Path.of("part6/test-file4.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>();

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile5() throws IOException {

        String content = Files.readString(Path.of("part6/test-file5.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>();

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile6() throws IOException {

        String content = Files.readString(Path.of("part6/test-file6.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>();

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile7() throws IOException {

        String content = Files.readString(Path.of("part6/test-file7.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>();

        assertArrayEquals(result.toArray(), links.toArray());
    }

    @Test
    public void p6TestFile8() throws IOException {

        String content = Files.readString(Path.of("part6/test-file8.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("a link on the first line"));

        assertArrayEquals(result.toArray(), links.toArray());
    }

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