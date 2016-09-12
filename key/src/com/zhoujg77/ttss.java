package com.zhoujg77;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class quse extends Frame implements ActionListener, MouseListener
{
  
  Button red=new Button("Red");
  Button green=new Button("Green");
  Button black=new Button("Black");
  Panel p1=new Panel();
  Panel p2=new Panel();
  Color c1=new Color(10,10,10);
  Color c2=new Color(255,255,255);
  Color c3=new Color(0,255,64);
  Graphics g;
  int xz;
  int x,y; //用来保存用户按下鼠标开始坐标
  boolean draw=false; //判断用户是否已经选择了要画图
  quse()
  {
    xz=x=y=0;//初始化参数
    
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.CENTER);
    p1.setSize(400,10);
    p1.setLayout(new GridLayout(1,3,2,1));
    p1.add(red);
    p1.add(green);
    p1.add(black);
    
    red.addActionListener(this);
    green.addActionListener(this);
    black.addActionListener(this);
    p2.addMouseListener(this);
    p2.setSize(400,390);
    p2.setBackground(c2);
    this.setBackground(c1);
    this.setResizable(false);
    this.setSize(400,400);
    double w=Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    double h=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    this.setLocation((int)(w-400)/2,(int)(h-400)/2);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter()
      {
        public void windowClosing(WindowEvent e)
        {
          System.exit(0);
        }
      });  
      
  }
  public void getg()
  {
    g=p2.getGraphics();
  }
  
  public static void main(String[] args)
  {
    quse q1=new quse();
    q1.getg();
  }

  public void actionPerformed(ActionEvent e) 
  {
    String str=e.getActionCommand();
    if(str.equals("Red"))
    {
      xz=1;
      draw=true;
      c3=Color.red;
    }
    else if(str.equals("Green"))
    {
      xz=1;
      draw=true;
      c3=Color.green;
    }
    else if(str.equals("Black"))
    {
      xz=1;
      draw=true;
      c3=Color.BLACK;
    }
    else
    c3=Color.blue;
    
  }

  public void mouseClicked(MouseEvent e) {
    // TODO: Add your code here
  }

  public void mousePressed(MouseEvent e) {
    // TODO: Add your code here
    x=e.getX();
    y=e.getY();
    if(draw==true)
      this.setCursor(Cursor.CROSSHAIR_CURSOR);
  }

  public void mouseReleased(MouseEvent e) {
    // TODO: Add your code here
    if(draw==true)
      this.setCursor(Cursor.DEFAULT_CURSOR);
    if(draw==true)
    {
      g.setColor(c3);//首先将画笔的颜色设置为用户选择的颜色
      switch(xz)
      {
        case 1:
          g.drawLine(x,y,e.getX(),e.getY());
          break;
        
      }
    }
  }

  public void mouseEntered(MouseEvent e) {
    // TODO: Add your code here
  }

  public void mouseExited(MouseEvent e) {
    // TODO: Add your code here
  }
  
}