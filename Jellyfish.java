import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Jellyfish extends JLabel
{
	public Jellyfish() 
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel nameLabel = new JLabel("Jellyfish");
		nameLabel.setPreferredSize(new Dimension(100,50));
		add(nameLabel,gbc);
		
		gbc.gridy = 1;
		
		JLabel habitatLabel = new JLabel("Habitat: The habitat for Jellyfish is very vast as they can live in any ocean water.");
		habitatLabel.setPreferredSize(new Dimension(700,50));
		add(habitatLabel,gbc);
		
		gbc.gridy = 2;
		
		JLabel dietLabel = new JLabel("Diet: Jellyfish eat many different types of things, such as small plants (phytoplankton), "
				+ "copepods (crustacean zooplankton), fish eggs and other small fish called larvae ");
		dietLabel.setPreferredSize(new Dimension(500,50));
		add(dietLabel,gbc);
		
		gbc.gridy = 3;
		
		JLabel funFactLabel = new JLabel("Fun Fact: Jellyfish have no brain, heart, bones or eyes. ");
		funFactLabel.setPreferredSize(new Dimension(400,50));
		add(funFactLabel,gbc);
		
	}
}

