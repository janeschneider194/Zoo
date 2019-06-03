import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Tiger extends JLabel
{
	public Tiger() 
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel nameLabel = new JLabel("Tiger");
		nameLabel.setPreferredSize(new Dimension(100,50));
		add(nameLabel,gbc);
		
		gbc.gridy = 1;
		
		JLabel habitatLabel = new JLabel("Habitat: Tigers occupy a variety of habitats from tropical forests, "
				+ "evergreen forests, woodlands and mangrove swamps to grasslands, savannah and rocky country.  ");
		habitatLabel.setPreferredSize(new Dimension(700,50));
		add(habitatLabel,gbc);
		
		gbc.gridy = 2;
		
		JLabel dietLabel = new JLabel("Diet: carnivore ");
		dietLabel.setPreferredSize(new Dimension(500,50));
		add(dietLabel,gbc);
		
		gbc.gridy = 3;
		
		JLabel funFactLabel = new JLabel("Fun Fact: The footprints of a tiger are known as 'pug marks'.");
		funFactLabel.setPreferredSize(new Dimension(400,50));
		add(funFactLabel,gbc);
		
	}
}