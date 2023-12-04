package alan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventsDemo extends JFrame implements ActionListener{
	private JTextField celsiusTextField;
	private JTextField farenheitTextField;
	EventsDemo(){
		setTitle("Temperature Converter");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create panel
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2));
		//create and add components
		JLabel celsiusLabel=new JLabel("Celsius");
		celsiusTextField=new JTextField();
		JLabel farenheitLabel=new JLabel("Farenheit");
		farenheitTextField=new JTextField();
		farenheitTextField.setEditable(false);
		JButton convertButton=new JButton("Convert");
		//register the button ->actionListener
		convertButton.addActionListener(this);
		panel.add(celsiusLabel);
		panel.add(celsiusTextField);
		panel.add(farenheitLabel);
		panel.add(farenheitTextField);
		panel.add(new JLabel());
		panel.add(convertButton);
		add(panel);
	}
public  static void main(String [] args) {
	EventsDemo events=new EventsDemo();
	events.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	double celsius=Double.parseDouble(celsiusTextField.getText());
	double farenheit=(celsius*9/5)+32;
	farenheitTextField.setText(String.format("%.2f",farenheit));
}
}
