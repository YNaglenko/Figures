package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ua.univer.figures.helper.AbstractFactoryFigure;
import ua.univer.figures.helper.FactoryFigure;
import ua.univer.figures.model.*;

class MyAbsLayoutPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyAbsLayoutPanel() {
		this.setLayout(null);

	}

	public void drawFigure(Figure figure) {
		switch (figure.getClass().getSimpleName()) {
		case "Point":
			drawPoint((Point) figure);
			break;
		case "ColorPoint":
			drawPoint((Point) figure);
			break;
		case "ColorLine":
			drawLine((ColorLine) figure);
			break;
		case "Line": {
			Line l = (Line) figure;
			drawLine(new ColorLine(l.getStart(), l.getEnd(), "FFFFFF"));
		}
			;
		}
	}

	public void drawPoint(Point p) {
		Graphics g = this.getGraphics();
		paintComponent(g);
		g.drawOval(p.getX(), p.getY(), 50, 50);
		p.setX(p.getX() + 10);
		p.setY(p.getY() + 10);
	}

	public void drawLine(ColorLine line) {
		Graphics g = this.getGraphics();
		paintComponent(g);
		g.setColor(Color.decode(line.getColor()));
		g.drawLine(line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// for (int i = 0; i < 100; i+=10) {

		// g.clearRect(0, 0, 500, 300);
		// g.drawOval(100+i, 100+i, 50, 50);

		// }

	}
}

class MyFlowLayoutPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFlowLayoutPanel() {
		this.setLayout(new FlowLayout());
	}

}

class ButtonMouseListen implements MouseListener {
	private JButton button;

	public ButtonMouseListen(JButton button) {
		this.button = button;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		button.setText("Click");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setText("Press");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setText("Release");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setText("Enter");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		button.setText("Exit");
	}

}

public class MainForm {
	class FigureFrame extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel panel;
		int count=0;
		public JPanel getPanel() {
			return panel;
		}

		public void setPanel(JPanel panel) {
			this.panel = panel;
		}

		public FigureFrame() {
			this.setSize(500, 500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton(">>");
			button.setSize(50, 50);
			button.setLocation(10, 10);
		//	JButton button1 = new JButton("Nonono");
			panel = new MyAbsLayoutPanel();
			Point p = new Point(200, 200);
			ColorLine cline = new ColorLine(new Point(50, 50), new Point(500, 500), "0xFF00FF");
			Figure[] masFigure = new Figure[10];
			AbstractFactoryFigure factory = new FactoryFigure();
			for (int i = 0; i < masFigure.length; i++) {
				masFigure[i] = factory.randFigure();
				JOptionPane.showMessageDialog(null,masFigure[i].toString());
			}
			
			button.addActionListener((e) -> {
				// button.setText("Click3");
				// button.setLocation(button.getX()+10, button.getY()+10);
				//((MyAbsLayoutPanel) panel).drawPoint(p);
				//((MyAbsLayoutPanel) panel).drawLine(cline);
				if(count==masFigure.length)count=0;
				((MyAbsLayoutPanel) panel).drawFigure(masFigure[count++]);
			});
			panel.add(button);

			// panel.add(button1);
			this.setContentPane(panel);
		}
	}

	public static void main(String[] args) {
		FigureFrame window = new MainForm().new FigureFrame();
		MyAbsLayoutPanel panel = (MyAbsLayoutPanel) window.getPanel();
		window.setVisible(true);

	}

}