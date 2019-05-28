import java.awt.CardLayout;

import javax.swing.JPanel;

public class Cats extends JPanel
{
	public Cats()
	{
		JPanel overall = new JPanel();
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
	}
}
