package com._520it.eclipse;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIDemo {

	public static void main(String[] args) {
		// create a Frame
		final JFrame f = new JFrame("GUI");
		// set the location of the Frame
		f.setLocation(300, 500);
		// set the size of the Frame
		f.setSize(300, 200);
		// create a textfield
		final JTextField textField = new JTextField(30);
		// set the location of the text field
		f.add(textField, BorderLayout.NORTH);
		// create a button
		JButton btn = new JButton("Hit me");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = textField.getText();
				f.setTitle(info);
			}
		});
		f.add(btn);
		f.pack();

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		
		
		});

	}

}
