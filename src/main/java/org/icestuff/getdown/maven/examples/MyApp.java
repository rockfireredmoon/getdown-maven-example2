package org.icestuff.getdown.maven.examples;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyApp extends JFrame {

	private static final long serialVersionUID = -8528265679814769262L;

	public MyApp(String[] args) {
		super("MyApp");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new JLabel("Hello World! (" + args[0] + ")"));
		pack();
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new MyApp(args);
	}
}
