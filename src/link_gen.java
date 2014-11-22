import java.awt.Component;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.lang.Math;

public class link_gen {

		public static void main(String[] args) throws Exception
		{
			String[] urlArray = new String[3];
			
			urlArray[0] = ("http://www.cookstr.com/recipes/papaya-and-arugula-salad");
			urlArray[1] = ("http://www.cookstr.com/recipes/pasta-primavera-2");
			urlArray[2] = ("http://www.cookstr.com/recipes/french-toast-with-bananas");
				
			
			PointsTrack myPoints = new PointsTrack();
			JFrame frameStart = new JFrame();
			Object[] select = { "Yes Please", "No Thanks" };
			int userInputSelect = JOptionPane.showOptionDialog(frameStart,
					"Would you like to do food things?",
					"Recipe Generator",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, select, select[1]);	
			
			boolean yesSelect = (userInputSelect == JOptionPane.YES_OPTION);
			boolean noSelect = (userInputSelect == JOptionPane.NO_OPTION);
			
			if (yesSelect)
			{
				JFrame frame2 = new JFrame();
				Object[] select2 = { "Recipe", "My Points"};
				int userInputSelect2 = JOptionPane.showOptionDialog(frame2,
						"Please select your option.",
						"Recipe Generator",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, select2, select2[1]);			
				
				if (userInputSelect2 == 0)
				{
//					Desktop desktop=Desktop.getDesktop();
//					desktop.browse(new URI("http://www.cookstr.com/searches/surprise"));
					
					Random rand = new Random();

					int n = rand.nextInt(2);
					
					String url = urlArray[n]; 
					
					LinkParser parser = new LinkParser(url);
					JOptionPane.showMessageDialog(null, "This is a lovely recipe.\n" + parser.parse() + "\nLink to Recipe: " + url);
					
				}
				if (userInputSelect2 == 1)
				{
					JOptionPane.showMessageDialog(null, "Look at all your lovely points.\n" + myPoints.getPoints());
				}	
				
			}			
			if (noSelect)
			{
				JOptionPane.showMessageDialog(null, "Alright, bye spa.");
				System.exit(0);
			}
			
		}

		
}