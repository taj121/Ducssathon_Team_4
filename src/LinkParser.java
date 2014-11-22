
public class LinkParser {
	String unparsed = "";
	String parsed = "";
	private char separator = '/';

	public LinkParser(String URL) {
		unparsed = URL;
	}
	public String parse() {
        int sep = unparsed.lastIndexOf(separator);
        parsed = unparsed.substring(sep + 1);
		parsed = parsed.replace("-", " ");
		return parsed.toUpperCase();
    }
	
}
