import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Dolphin extends JLabel
{
	public Dolphin() 
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel nameLabel = new JLabel("Dolphin");
		nameLabel.setPreferredSize(new Dimension(100,50));
		add(nameLabel,gbc);
		
		gbc.gridy = 1;
		
		JLabel habitatLabel = new JLabel("Habitat: Bottlenose dolphins live in temperate and tropical waters worldwide. "
				+ "In the Pacific Ocean, bottlenose dolphins are found from northern Japan to Australia and from Southern California to Chile.");
		habitatLabel.setPreferredSize(new Dimension(700,50));
		add(habitatLabel,gbc);
		
		gbc.gridy = 2;
		
		JLabel dietLabel = new JLabel("Diet: Dolphins are active predators and eat a wide variety of fishes, squids, and crustaceans such as shrimps. ");
		dietLabel.setPreferredSize(new Dimension(500,50));
		add(dietLabel,gbc);
		
		gbc.gridy = 3;
		
		JLabel funFactLabel = new JLabel("Fun Fact: The Killer Whale (also known as Orca) is actually a type of dolphin.");
		funFactLabel.setPreferredSize(new Dimension(400,50));
		add(funFactLabel,gbc);
		
	}
}
