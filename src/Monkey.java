import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Monkey extends JPanel
{
	private JFrame fram;
	public Monkey(JFrame frame)
	{
		fram = frame;
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
	}
}
