package com.zhoujg77;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class keymain {
	private static Robot robot;

	public static void main(String[] args) throws InterruptedException {
		try {
			robot = new Robot();//创建Robot对象
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
		int a= 0;
		while(true){
			a++;
			if(a==10){
				System.exit(0);
			}
			//Thread.sleep(2000);
		  //  Point mousepoint = MouseInfo.getPointerInfo().getLocation();
	      //  Color color = robot.getPixelColor(mousepoint.x, mousepoint.y);
	        // System.out.println(color);
	      //  if(color.getRed()==102&&color.getGreen()==0&&color.getBlue()==255){
	        //	System.out.println("鼠标在蓝色停留了第"+a+"次");
	       // }
//	        	robot.mouseMove(680, 448);
//	    		robot.mousePress(KeyEvent.BUTTON1_MASK);
//	    		robot.mouseRelease(KeyEvent.BUTTON1_MASK);
//	    		robot.mousePress(KeyEvent.BUTTON1_MASK);
//	    		robot.mouseRelease(KeyEvent.BUTTON1_MASK);
//	    		robot.delay(500);
//	    		
//	    		robot.keyPress(KeyEvent.VK_F1);
//	    		robot.keyRelease(KeyEvent.VK_F1);
//	    		robot.delay(1600);
//	    		robot.delay(1600);
//	    		robot.keyPress(KeyEvent.VK_F2);
//	    		robot.keyRelease(KeyEvent.VK_F2);
//	    		robot.delay(1600);
	    		
	    		//table(robot,a);
				//robot.mouseMove(10, 20);//移动鼠标到(10,20)点

			    robot.mousePress(InputEvent.BUTTON3_MASK);//按下右键
			    //robot.delay(4000);
			    robot.mouseMove(100, 200);
			    robot.mouseRelease(InputEvent.BUTTON3_MASK);
			    robot.delay(1600);
//	    		robot.keyPress(KeyEvent.VK_F3);
//	    		robot.keyRelease(KeyEvent.VK_F3);
//	    		robot.delay(1600);
//	    		table(robot,a);
//	    		robot.keyPress(KeyEvent.VK_F4);
//	    		robot.keyRelease(KeyEvent.VK_F4);
//	    		robot.delay(1600);
//	    		table(robot,a);
//	    		robot.keyPress(KeyEvent.VK_F5);
//	    		robot.keyRelease(KeyEvent.VK_F5);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F6);
//	    		robot.keyRelease(KeyEvent.VK_F6);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F7);
//	    		robot.keyRelease(KeyEvent.VK_F7);
//	    		robot.delay(1600);
//	    		robot.delay(1600);
//	    		robot.keyPress(KeyEvent.VK_F8);
//	    		robot.keyRelease(KeyEvent.VK_F8);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F9);
//	    		robot.keyRelease(KeyEvent.VK_F9);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F10);
//	    		robot.keyRelease(KeyEvent.VK_F10);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F11);
//	    		robot.keyRelease(KeyEvent.VK_F11);
//	    		robot.delay(1600);
//	    	
//	    		robot.keyPress(KeyEvent.VK_F12);
//	    		robot.keyRelease(KeyEvent.VK_F12);
//	    		robot.delay(1600);
	    		
		}
		
		
		
		
	}

	private static void table(Robot robot2,int a) {
		
		keyboard(robot,KeyEvent.VK_KP_LEFT,2);
		if(a%2==0){
			keyboard(robot,KeyEvent.VK_KP_RIGHT,2);
		}
	}

	private static void keyboard(Robot robot2, int vkLeft,int num) {
		int a = 0;
		while(true){
			System.out.println("当前按键："+vkLeft+"次数："+num);	
			
			if(a==num){
				break;
			}
			System.out.println(a);
			robot.keyPress(vkLeft);
			robot.keyRelease(vkLeft);
			robot.delay(500); 
			a++;
		}
	}	
	
	
	private static void keyboard2(Robot robot2, int v1,int v2,int num) {
		int a = 0;
		while(true){
			
			if(a==num){
				break;
			}
			System.out.println(a);
			robot.keyPress(v1);
			robot.keyPress(v2);
			robot.keyRelease(v1);
			robot.keyRelease(v2);
			robot.delay(500); 
			a++;
		}
	}	
	
	
}
