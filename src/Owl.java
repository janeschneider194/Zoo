import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Owl extends JPanel
{
	private JFrame fram;
	public Owl(JFrame frame)
	{
		fram = frame;
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
	}
}
