import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Toad extends JPanel
{
	private JFrame fram;
	public Toad(JFrame frame)
	{
		fram = frame;
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
	}
}
