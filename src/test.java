
public class test {
	public static void main(String[] args){
		LinkParser parser = new LinkParser("http://www.cookstr.com/recipes/roast-chicken-with-corn-bread-and-oyster-stuffing");
		String print = parser.parse();
		System.out.print(print);
	}
}
