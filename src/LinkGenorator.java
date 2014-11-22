import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class LinkGenorator {
	
	LinkGenorator(){
	}
	
	public void openNewLink(){
		Desktop desktop=Desktop.getDesktop();
		try {
			desktop.browse(new URI("http://www.cookstr.com/searches/surprise"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}	
	}

}
