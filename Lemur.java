import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Lemur extends JLabel
{
	public Lemur() 
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel nameLabel = new JLabel("Lemur");
		nameLabel.setPreferredSize(new Dimension(100,50));
		add(nameLabel,gbc);
		
		gbc.gridy = 1;
		
		JLabel habitatLabel = new JLabel("Habitat: Lemurs live in trees which is why they are called arboreal. "
				+ "There are some large species of Lemurs though that also spend time on the ground.   ");
		habitatLabel.setPreferredSize(new Dimension(700,50));
		add(habitatLabel,gbc);
		
		gbc.gridy = 2;
		
		JLabel dietLabel = new JLabel("Diet:They forage for fruit, which makes up the greater part of their diet, "
				+ "but also eat leaves, flowers, tree bark, and sap.");
		dietLabel.setPreferredSize(new Dimension(500,50));
		add(dietLabel,gbc);
		
		gbc.gridy = 3;
		
		JLabel funFactLabel = new JLabel("Fun Fact: Rice paddies have gradually replaced lemur habitat, particularly in the central part of the island.");
		funFactLabel.setPreferredSize(new Dimension(400,50));
		add(funFactLabel,gbc);
		
	}
}