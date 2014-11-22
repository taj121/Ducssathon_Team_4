import java.awt.Component;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Desktop;
import java.net.URI;

public class FoodInterface {

	public static void main(String[] args) throws Exception
	{
		PointsTrack myPoints = new PointsTrack();
		LinkGenorator recipeLink = new LinkGenorator();
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
				recipeLink.openNewLink();
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
