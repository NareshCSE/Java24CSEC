package practice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Calculator {
   public static void main(String[] args) {
	   JFrame frame=new JFrame();
	     Calculator(){
		   
	   
	   frame.setVisible(true);
	   frame.setLayout(null);
	   frame.setBounds( 100,50,500, 600);
	   GridLayout g=new GridLayout(4,4);
	   TextField t=new TextField();
	   
	   Button n1=new Button();
	   Button n2=new Button();
	   Button n3=new Button();
	   Button n4=new Button();
	   Button n5=new Button();
	   Button n6=new Button();
	   Button n7=new Button();
	   Button n8=new Button();
	   Button n9=new Button();
	   Button mul=new Button();
	   Button add=new Button();
	   Button div=new Button();
	   Button sub=new Button();
	   Button equal=new Button();
	   g.addLayoutComponent("textfeild", t);
	   g.addLayoutComponent("1", n1);
	   g.addLayoutComponent("2", n2);
	   g.addLayoutComponent("3", n3);
	   g.addLayoutComponent("+", add);
	   g.addLayoutComponent("4", n4);
	   g.addLayoutComponent("5", n5);
	   g.addLayoutComponent("6", n6);
	   g.addLayoutComponent("-", sub);
	   g.addLayoutComponent("7", n7);
	   g.addLayoutComponent("8", n8);
	   g.addLayoutComponent("9", n9);
	   g.addLayoutComponent("*", mul);
	   g.addLayoutComponent("=", equal);
	   g.addLayoutComponent("/", div);
	   frame.add();
	   frame.setVisible(true);
	   frame.setLayout(null);
	   frame.setBounds( 100,50,500, 600);
	   }
	  
	}

}
