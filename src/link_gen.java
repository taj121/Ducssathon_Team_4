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
			String[] urlArray = new String[6];
			String[] infoArray = new String[6];
			
			urlArray[0] = ("http://www.cookstr.com/recipes/papaya-and-arugula-salad");
			urlArray[1] = ("http://www.cookstr.com/recipes/pasta-primavera-2");
			urlArray[2] = ("http://www.cookstr.com/recipes/french-toast-with-bananas");
			urlArray[3] = ("http://www.cookstr.com/recipes/vegetable-chili");
			urlArray[4] = ("http://www.cookstr.com/recipes/grilled-eggplant-with-feta-mint-and-chilli");
			urlArray[5] = ("http://www.cookstr.com/recipes/old-fashioned-raspberry-tart");
			
				
			infoArray[0] =("Course: Main Course\nTotal Time: Under 2 Hours\nSkill Level: Easy\nCost: Inexpensive");
			infoArray[1] =("Course: Main Course\nTotal Time: Under 2 Hours\nSkill Level: Easy\nCost: Inexpensive");
			infoArray[2] =("Course: Dessert\nTotal Time: Under 30 Minutes\nSkill Level: Easy\nCost: Inexpensive");
			infoArray[3] =("Course: Main Course\nTotal Time: Under 4 Hours\nSkill Level: Moderate\nCost: Inexpensive");
			infoArray[4] =("Course: Tapas\nTotal Time: Under 30 Minutes\nSkill Level: Easy\nCost: Inexpensive");
			infoArray[5] =("Course: Dessert\nTotal Time: Under 1 Hour\nSkill Level: Moderate\nCost: Moderate");
			
			PointsTrack myPoints = new PointsTrack();
			JFrame frameStart = new JFrame();
			while(true){
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
					Random rand = new Random();

					
					
					while(true){

						int n = rand.nextInt(2);

						String url = urlArray[n];
						String info = infoArray[n];
						LinkParser parser = new LinkParser(url);
						JFrame frame3 = new JFrame();
						Object[] select3 = { "I like this one", "Give me a different one"};
	//					JOptionPane.showMessageDialog(null, "This is a lovely recipe.\n" + parser.parse()
	//							+ "\n\nInfo" + info
	//							+ "\n\nLink to Recipe: " + url);
						int userInputSelect3 = JOptionPane.showOptionDialog(frame3,
								("This is a lovely recipe.\n" + parser.parse()
										+ "\n\nInfo" + info
										+ "\n\nLink to Recipe: " + url),
										"Recipe Generator",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, select3, select3[1]);	
						if(userInputSelect3 !=1){
							myPoints.getUpdatedPointsForCooking(url);
							Desktop desktop=Desktop.getDesktop();
							desktop.browse(new URI(url));
							
							break;
						}
					}
					
				}
				if (userInputSelect2 == 1)
				{
					JOptionPane.showMessageDialog(null, "Look at all your lovely points.\n" + myPoints.getPoints());
				}	
				
			}			
			if (noSelect)
			{
				JOptionPane.showMessageDialog(null, "Alright, bye friend.");
				System.exit(0);
			}
			
		}
		}

		
}