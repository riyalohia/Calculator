import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator implements ActionListener{
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
	TextField t;
	Choice ch1,ch2,ch3;
	 String q= new String("");
	 String w= new String("");
	  String y;
	int i=0,b,j,x;
    Calculator()
	{
		f=new Frame("font size");
		f.setLayout(null);
		t=new TextField();
		t.setBounds(20,60,290,50);
		f.add(t);
		b1=new Button("MC");
		b1.setBackground(Color.green);
		b1.setBounds(20,120,50,50);
		f.add(b1);
		b2=new Button("MR");
		b2.setBackground(Color.green);
		b2.setBounds(80,120,50,50);
		f.add(b2);
		b3=new Button("MS");
		b3.setBackground(Color.green);
		b3.setBounds(140,120,50,50);
		f.add(b3);
		b4=new Button("M+");
		b4.setBackground(Color.green);
		b4.setBounds(200,120,50,50);
		f.add(b4);
		b5=new Button("M-");
		b5.setBackground(Color.green);
		b5.setBounds(260,120,50,50);
		f.add(b5);
		b6=new Button("<-");
		b6.setBackground(Color.green);
		b6.setBounds(20,180,50,50);
		f.add(b6);
		b7=new Button("CE");
		b7.setBackground(Color.green);
		b7.setBounds(80,180,50,50);
		f.add(b7);
		b8=new Button("C");
		b8.setBackground(Color.green);
		b8.setBounds(140,180,50,50);
		f.add(b8);
		b9=new Button("+_");
		b9.setBackground(Color.green);
		b9.setBounds(200,180,50,50);
		f.add(b9);
		b10=new Button("V");
		b10.setBackground(Color.green);
		b10.setBounds(260,180,50,50);
		f.add(b10);
		b11=new Button("7");
		b11.setBackground(Color.green);
		b11.setBounds(20,240,50,50);
		f.add(b11);
		b12=new Button("8");
		b12.setBackground(Color.green);
		b12.setBounds(80,240,50,50);
		f.add(b12);
		b13=new Button("9");
		b13.setBackground(Color.green);
		b13.setBounds(140,240,50,50);
		f.add(b13);
		b14=new Button("/");
		b14.setBackground(Color.green);
		b14.setBounds(200,240,50,50);
		f.add(b14);
		b15=new Button("%");
		b15.setBackground(Color.green);
		b15.setBounds(260,240,50,50);
		f.add(b15);
		b16=new Button("4");
		b16.setBackground(Color.green);
		b16.setBounds(20,300,50,50);
		f.add(b16);
		b17=new Button("5");
		b17.setBackground(Color.green);
		b17.setBounds(80,300,50,50);
		f.add(b17);
		b18=new Button("6");
		b18.setBackground(Color.green);
		b18.setBounds(140,300,50,50);
		f.add(b18);
		b19=new Button("*");
		b19.setBackground(Color.green);
		b19.setBounds(200,300,50,50);
		f.add(b19);
		b20=new Button("1/x");
		b20.setBackground(Color.green);
		b20.setBounds(260,300,50,50);
		f.add(b20);
		b21=new Button("1");
		b21.setBackground(Color.green);
		b21.setBounds(20,360,50,50);
		f.add(b21);
		b22=new Button("2");
		b22.setBackground(Color.green);
		b22.setBounds(80,360,50,50);
		f.add(b22);
		b23=new Button("3");
		b23.setBackground(Color.green);
		b23.setBounds(140,360,50,50);
		f.add(b23);
		b24=new Button("-");
		b24.setBackground(Color.green);
		b24.setBounds(200,360,50,50);
		f.add(b24);
		b25=new Button("=");
		b25.setBackground(Color.green);
		b25.setBounds(260,360,50,110);
		f.add(b25);
		b26=new Button("0");
		b26.setBackground(Color.green);
		b26.setBounds(20,420,110,50);
		f.add(b26);
		b27=new Button(".");
		b27.setBackground(Color.green);
		b27.setBounds(140,420,50,50);
		f.add(b27);
		b28=new Button("+");
		b28.setBackground(Color.green);
		b28.setBounds(200,420,50,50);
		f.add(b28);
		ch1=new Choice();
		ch1.add("Standard");
		ch1.add("scientific");
		ch1.add("programmer");
		ch1.add("statistics");
		ch1.add("History");
		ch1.add("Digital grouping");
		ch1.add("basic");
		ch1.add("unit conversion");
		ch1.add("date calculations");
		ch1.add("workshwwts");
		ch1.setBounds(20,30,90,20);
		f.add(ch1);
		ch2=new Choice();
		ch2.add("Copy");
		ch2.add("Paste");
		ch2.add("History");
		ch2.setBounds(120,30,80,20);
		f.add(ch2);
		ch3=new Choice();
		ch3.add("View help");
		ch3.add("About calculator");
		ch3.setBounds(210,30,90,20);
		f.add(ch3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		f.setSize(330,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String w=new String("");
		
		Object ob=ae.getSource();
		
			
		if(ob==b11)
		{
			
			 q=q+(b11.getLabel());
			
			
		}
		if(ob==b12)
		{
			
			  q=q+(b12.getLabel());
			  
			
		}
		if(ob==b13)
		{
			
			  q=q+(b13.getLabel());
			
		}
		if(ob==b16)
		{
			
			  q=q+(b16.getLabel());
			 
			
		}
		if(ob==b17)
		{
			
			  q=q+(b17.getLabel());
			
		
		}
		if(ob==b18)
		{
			
			  q=q+(b18.getLabel());
			
			
		}
		if(ob==b21)
		{
		
			  q=q+(b21.getLabel());
			  
			
		}
		if(ob==b22)
		{
			
			  q=q+(b22.getLabel());
			
		}
		if(ob==b23)
		{
			
			  q=q+(b23.getLabel());
			
		}
		if(ob==b26)
		{
			 q=q+(b26.getLabel());
			
		}
		if(ob==b27)
		{
			
			  q=q+(b27.getLabel());
			  		
			
		}
		if(ob==b14)
		{
			
			  q=q+(b14.getLabel());
			  x=3;
				
		}
		if(ob==b19)
		{
			
			  q=q+(b19.getLabel());
			  x=1;
			
		}
		if(ob==b24)
		{
			
			  q=q+(b24.getLabel());
				x=2;
		}
		if(ob==b28)
		{
			q=q+(b28.getLabel());

			x=0;
			 
		}
		if(ob==b9)
		{
			q=""+(Float.parseFloat(t.getText()))*(-1.0);
		}
		if(ob==b20)
		{
			float n;
			n=1/Float.parseFloat(t.getText());
			q="Reciporcal of("+t.getText()+") = " +n;
		
		}
		
		if(ob==b25)
		{
			String t1;
			int count=0,l;
			float s=0;
			char d[]=(t.getText()).toCharArray();
			for(i=0;i<(t.getText()).length();i++)
			{
				if(d[i]=='+'||d[i]=='-'||d[i]=='*'||d[i]=='/')
				{
					count++;
					
				}
				if(d[0]=='+'||d[0]=='-'||d[0]=='*'||d[0]=='/')
				{
					count--;
				}
				if(d[(t.getText()).length()-1]=='+'||d[(t.getText()).length()-1]=='-'||d[(t.getText()).length()-1]=='*'||d[(t.getText()).length()-1]=='/')
				{
					count--;
				}
			}
			
			
			t1=new String(d);
			if(x==0)
			{
			int h=-1;
				String b[]=new String[count+1];
				 i=t1.indexOf("+",h);
				 b[0]=t1.substring(0,i);
				if(count>1)
				{
				for(l=0;l<count-1;l++)
				{
				 i=t1.indexOf("+",h);
				 h=t1.indexOf("+",i+1);
				 b[l+1]=t1.substring(i+1,h);
				
				}
				
				b[count]=t1.substring(h+1,t1.length());
				}
				else
				{
					b[count]=t1.substring(i+1,t1.length());
				}
				for(j=0;j<=count;j++)
				{
					s=s+Float.parseFloat(b[j]);
				}
				q=""+s;
				}
				if(x==1)
				{
					float m1=1;
					int h=-1;
				String b[]=new String[count+1];
				 i=t1.indexOf("*",h);
				 b[0]=t1.substring(0,i);
				if(count>1)
				{
				for(l=0;l<count-1;l++)
				{
				 i=t1.indexOf("*",h);
				 h=t1.indexOf("*",i+1);
				 b[l+1]=t1.substring(i+1,h);
				
				}
				
				b[count]=t1.substring(h+1,t1.length());
				}
				else
				{
					b[count]=t1.substring(i+1,t1.length());
				}
				for(j=0;j<=count;j++)
				{
					m1=m1*(Float.parseFloat(b[j]));
				}
				q=""+m1;
				}
				if(x==2)
				{
						float s1 =0;
					int h=-1;
				String b[]=new String[count+1];
				 i=t1.indexOf("-",h);
				 b[0]=t1.substring(0,i);
				if(count>1)
				{
				for(l=0;l<count-1;l++)
				{
				 i=t1.indexOf("-",h);
				 h=t1.indexOf("-",i+1);
				 b[l+1]=t1.substring(i+1,h);
				
				}
				
				b[count]=t1.substring(h+1,t1.length());
				}
				else
				{
					b[count]=t1.substring(i+1,t1.length());
				}
				for(j=1;j<=count;j++)
				{
					s1=s1-(Float.parseFloat(b[j]));
				}
				s1=s1+(Float.parseFloat(b[0]));
				q=""+s1;
				}
				if(x==3)
				{
							float s1 =1;
					int h=-1;
				String b[]=new String[count+1];
				 i=t1.indexOf("/",h);
				 b[0]=t1.substring(0,i);
				if(count>1)
				{
				for(l=0;l<count-1;l++)
				{
				 i=t1.indexOf("/",h);
				 h=t1.indexOf("/",i+1);
				 b[l+1]=t1.substring(i+1,h);
				
				}
				
				b[count]=t1.substring(h+1,t1.length());
				}
				else
				{
					b[count]=t1.substring(i+1,t1.length());
				}
				for(j=0;j<count;j++)
				{
					s1=s1/(Float.parseFloat(b[j+1]));
				}
				s1=s1*(Float.parseFloat(b[0]));
				q=""+s1;
				}
				
		}
		
		if(ob==b6)
		{
			char e[]=(t.getText()).toCharArray();
			char g[]=new char[(t.getText()).length()-1];
				for(i=0;i<((t.getText()).length()-1);i++)
				{
					 g[i]=e[i];
				}
				
				q=new String(g);
		}
		t.setText(q);
		if(ob==b7||ob==b8)
		{
			t.setText("");
			q=new String("");
			
		}
		
		
		
		
	}
public static void main(String z[])
	{
		Calculator a=new Calculator();
	}	
}