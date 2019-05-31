import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Tiger extends JPanel
{
	private JFrame fram;
	public Tiger(JFrame frame)
	{
		fram = frame;
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
	}
}
