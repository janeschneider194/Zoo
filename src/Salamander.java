import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Salamander extends JPanel
{
	private JFrame fram;
	public Salamander(JFrame frame)
	{
		fram = frame;
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
	}
}
