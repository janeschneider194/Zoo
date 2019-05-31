import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Chameleon extends JPanel
{
	private JFrame fram;
	public Chameleon(JFrame frame)
	{
		fram = frame;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
	}
}
