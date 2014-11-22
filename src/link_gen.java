import java.awt.Component;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;

public class link_gen {

		public static void main(String[] args) throws Exception
		{
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
					Desktop desktop=Desktop.getDesktop();
					desktop.browse(new URI("http://www.cookstr.com/searches/surprise"));
				}
				if (userInputSelect2 == 1)
				{
					JOptionPane.showMessageDialog(null, "Look at all your lovely points.");
				}	
				
			}			
			if (noSelect)
			{
				JOptionPane.showMessageDialog(null, "Alright, bye.");
				System.exit(0);
			}
			
		}

		
}

//Desktop desktop=Desktop.getDesktop();
//desktop.browse(new URI("http://www.cookstr.com/searches/surprise"));
