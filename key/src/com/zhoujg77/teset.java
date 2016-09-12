package com.zhoujg77;
import java.awt.*;
import java.awt.event.*;

class qs extends Frame implements ActionListener
{
		TextField t1=new TextField();
		Button b1=new Button("红色");
		
		qs()
		{
		super("简单的取色测试");
		t1.setText("请取色");
		b1.addActionListener(this);
		this.add(t1,BorderLayout.NORTH);
		this.add(b1,BorderLayout.CENTER);
		this.setSize(200,40);
		this.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
		if(e.getActionCommand()=="红色")
		t1.setText("红色");
		}
	

}