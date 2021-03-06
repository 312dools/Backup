import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {

	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private Label lblOut;
	private TextField tfOut;
	private int count = 0;
	
	public AWTCounter() {
		setLayout(new FlowLayout());
		
		lblCount = new Label("Input");
		add(lblCount);
		
		tfCount = new TextField("0", 10);
		tfCount.setEditable(true);
		add(tfCount);
		
		tfCount.addActionListener(this);
		
//		btnCount = new Button("Count");
//		add(btnCount);
		
//		btnCount.addActionListener(this);
		lblOut = new Label("Output");
		add(lblOut);
		
		tfOut = new TextField("0", 10);
		tfOut.setEditable(false);
		add(tfOut);
		
		
		setTitle("AWT Counter");
		setSize(350,100);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTCounter();
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		int inInt = Integer.parseInt(tfCount.getText());
		count += inInt;
		tfCount.setText("");
		tfOut.setText(count+"");
	}
}
