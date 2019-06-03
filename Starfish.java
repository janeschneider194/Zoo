import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Starfish extends JLabel
{
	public Starfish() 
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel nameLabel = new JLabel("Starfish");
		nameLabel.setPreferredSize(new Dimension(100,50));
		add(nameLabel,gbc);
		
		gbc.gridy = 1;
		
		JLabel habitatLabel = new JLabel("Habitat: Starfish species inhabit all of the world's oceans");
		habitatLabel.setPreferredSize(new Dimension(700,50));
		add(habitatLabel,gbc);
		
		gbc.gridy = 2;
		
		JLabel dietLabel = new JLabel("Diet: The Forbes' sea star and most other species dine on bivalves, such as clams, mussels and oysters.");
		dietLabel.setPreferredSize(new Dimension(500,50));
		add(dietLabel,gbc);
		
		gbc.gridy = 3;
		
		JLabel funFactLabel = new JLabel("Fun Fact: There are more than 2000 species of starfish and not single one can survive in the freshwater.  ");
		funFactLabel.setPreferredSize(new Dimension(400,50));
		add(funFactLabel,gbc);
		
	}
}