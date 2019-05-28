import java.awt.CardLayout;

import javax.swing.JPanel;

public class Birds extends JPanel 
{
	public Birds()
	{
		JPanel overall = new JPanel();
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
	}
}
