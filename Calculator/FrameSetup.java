package Calculator;
import java.awt.event.*;
import javax.swing.*;

public class FrameSetup
{ 
 private JFrame box;
 private int width;
 private int height;
 
 private JTextField first;
 private JTextField second;
 private JTextField result;
 
 private JLabel yems;
 private JLabel reslut;
 
 private JButton multi;
 private JButton divya;
 private JButton subway;
 private JButton addison;
 
 public FrameSetup(int width,int height)
 {
  box=new JFrame("kennyculator");
  this.width=width;
  this.height=height;
  first=new JTextField("First key");
  first.setBounds(280,60,150,25);
  second=new JTextField("Second moon");
  second.setBounds(280,90,150,25);
  result=new JTextField();
  result.setBounds(280,240,150,25);
  
  addison=new JButton("+");
  addison.setBounds(180,150,50,35);
  
  subway=new JButton("-");
  subway.setBounds(280,150,50,35);
  
  multi=new JButton("x");
  multi.setBounds(380,150,50,35);
  
  divya=new JButton("/");
  divya.setBounds(480,150,50,35);
  
  
  
}
public void guisetup()
{
 box.setSize(width,height);
 box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 box.add(first);
 box.add(second);
 box.add(result);
 box.add(addison);
 box.add(multi);
 box.add(divya);
 box.add(subway);
 box.setLayout(null);
 box.setVisible(true);
}
public void listener()
{
 ActionListener bt=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent E)
    {
        //System.out.println(E);
        String op=((JButton)E.getSource()).getText();
        //System.out.println(op);
        int a=Integer.parseInt(first.getText());
         int b=Integer.parseInt(second.getText());
         int c;
        if(op=="+")
        {
         c=a+b;
         
        }
        else if(op=="-")
        {
         c=a-b;
         
        }
         else if(op=="x")
        {
         c=a*b;
        
        }
        else{
            c=a/b;
            
        }
        String out=String.valueOf(c);
         result.setText(out);
}

    
};
addison.addActionListener(bt);
subway.addActionListener(bt);    
multi.addActionListener(bt);
divya.addActionListener(bt);    
}
}