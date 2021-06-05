package com.Amit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame extends JFrame implements ActionListener {
    JButton one,two,three,four,five,six,seven,eight,nine,zero,ac,cross,equal,p,m,mul,div;
    JLabel display,out;
    long i=0;
    double ans=0;
    char c='x';

    NewFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setBounds(0,0,450,600);
        this.setTitle("Hello from Jfame.");
        this.setVisible(true); // make frame true

        JLabel label = new JLabel();
        label.setForeground(Color.blue);
        label.setSize(500,500);

        display = new JLabel();
        display.setForeground(Color.blue);
        display.setFont(new Font("Comic Sans",Font.BOLD,24));
        display.setSize(450,75);

        out = new JLabel();
        out.setForeground(Color.orange);
        out.setFont(new Font("Comic Sans",Font.BOLD,24));
        out.setBounds(0,76,450,75);

        this.add(display);
        this.add(out);
        this.add(label);
        label.setLayout(new GridLayout(4,4));
        label.setBounds(0,150,400,400);

        one = new JButton("1");
        one.setSize(100,100);
        one.addActionListener(this);
        one.setFont(new Font("Coic Sans",Font.BOLD,20));
        one.setForeground(Color.blue);
        one.setBackground(Color.PINK);
        one.setBorder(BorderFactory.createEtchedBorder());

        two = new JButton("2");
        two.setSize(100,100);
        two.addActionListener(this);
        two.setFont(new Font("Coic Sans",Font.BOLD,20));
        two.setForeground(Color.blue);
        two.setBackground(Color.PINK);
        two.setBorder(BorderFactory.createEtchedBorder());

        three = new JButton("3");
        three.setSize(100,100);
        three.addActionListener(this);
        three.setFont(new Font("Coic Sans",Font.BOLD,20));
        three.setForeground(Color.blue);
        three.setBackground(Color.PINK);
        three.setBorder(BorderFactory.createEtchedBorder());

        four = new JButton("4");
        four.setSize(100,100);
        four.addActionListener(this);
        four.setFont(new Font("Coic Sans",Font.BOLD,20));
        four.setForeground(Color.blue);
        four.setBackground(Color.PINK);
        four.setBorder(BorderFactory.createEtchedBorder());

        five = new JButton("5");
        five.setSize(100,100);
        five.addActionListener(this);
        five.setFont(new Font("Coic Sans",Font.BOLD,20));
        five.setForeground(Color.blue);
        five.setBackground(Color.PINK);
        five.setBorder(BorderFactory.createEtchedBorder());

        six = new JButton("6");
        six.setSize(100,100);
        six.addActionListener(this);
        six.setFont(new Font("Coic Sans",Font.BOLD,20));
        six.setForeground(Color.blue);
        six.setBackground(Color.PINK);
        six.setBorder(BorderFactory.createEtchedBorder());

        seven = new JButton("7");
        seven.setSize(100,100);
        seven.addActionListener(this);
        seven.setFont(new Font("Coic Sans",Font.BOLD,20));
        seven.setForeground(Color.blue);
        seven.setBackground(Color.PINK);
        seven.setBorder(BorderFactory.createEtchedBorder());

        eight = new JButton("8");
        eight.setSize(100,100);
        eight.addActionListener(this);
        eight.setFont(new Font("Coic Sans",Font.BOLD,20));
        eight.setForeground(Color.blue);
        eight.setBackground(Color.PINK);
        eight.setBorder(BorderFactory.createEtchedBorder());

        nine = new JButton("9");
        nine.setSize(100,100);
        nine.addActionListener(this);
        nine.setFont(new Font("Coic Sans",Font.BOLD,20));
        nine.setForeground(Color.blue);
        nine.setBackground(Color.PINK);
        nine.setBorder(BorderFactory.createEtchedBorder());

        zero = new JButton("0");
        zero.setSize(100,100);
        zero.addActionListener(this);
        zero.setFont(new Font("Coic Sans",Font.BOLD,20));
        zero.setForeground(Color.blue);
        zero.setBackground(Color.PINK);
        zero.setBorder(BorderFactory.createEtchedBorder());


        ac = new JButton("AC");
        ac.setSize(100,100);
        ac.addActionListener(this);
        ac.setFont(new Font("Coic Sans",Font.BOLD,20));
        ac.setForeground(Color.blue);
        ac.setBackground(Color.PINK);
        ac.setBorder(BorderFactory.createEtchedBorder());

        cross = new JButton("X");
        cross.setSize(100,100);
        cross.addActionListener(this);
        cross.setFont(new Font("Coic Sans",Font.BOLD,20));
        cross.setForeground(Color.blue);
        cross.setBackground(Color.PINK);
        cross.setBorder(BorderFactory.createEtchedBorder());

        equal = new JButton("=");
        equal.setSize(100,100);
        equal.addActionListener(this);
        equal.setFont(new Font("Coic Sans",Font.BOLD,20));
        equal.setForeground(Color.blue);
        equal.setBackground(Color.PINK);
        equal.setBorder(BorderFactory.createEtchedBorder());

        p = new JButton("+");
        p.setSize(100,100);
        p.addActionListener(this);
        p.setFont(new Font("Coic Sans",Font.BOLD,20));
        p.setForeground(Color.blue);
        p.setBackground(Color.PINK);
        p.setBorder(BorderFactory.createEtchedBorder());

        m = new JButton("-");
        m.setSize(100,100);
        m.addActionListener(this);
        m.setFont(new Font("Coic Sans",Font.BOLD,20));
        m.setForeground(Color.blue);
        m.setBackground(Color.PINK);
        m.setBorder(BorderFactory.createEtchedBorder());

        mul = new JButton("*");
        mul.setSize(100,100);
        mul.addActionListener(this);
        mul.setFont(new Font("Coic Sans",Font.BOLD,20));
        mul.setForeground(Color.blue);
        mul.setBackground(Color.PINK);
        mul.setBorder(BorderFactory.createEtchedBorder());

        div = new JButton("/");
        div.setSize(100,100);
        div.addActionListener(this);
        div.setFont(new Font("Coic Sans",Font.BOLD,20));
        div.setForeground(Color.blue);
        div.setBackground(Color.PINK);
        div.setBorder(BorderFactory.createEtchedBorder());

        label.add(one);
        label.add(two);
        label.add(three);
        label.add(p);
        label.add(four);
        label.add(five);
        label.add(six);
        label.add(m);
        label.add(seven);
        label.add(eight);
        label.add(nine);
        label.add(mul);
        label.add(zero);
        label.add(ac);
        label.add(equal);
        label.add(div);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==one){
            i*=10;
            i+=1;
            display.setText(""+ i);
        }
        if (e.getSource()==two){
            i*=10;
            i+=2;
            display.setText(""+ i);
        }
        if (e.getSource()==three){
            i*=10;
            i+=3;
            display.setText(""+ i);
        }
        if (e.getSource()==four){
            i*=10;
            i+=4;
            display.setText(""+ i);
        }
        if (e.getSource()==five){
            i*=10;
            i+=5;
            display.setText(""+ i);
        }
        if (e.getSource()==six){
            i*=10;
            i+=6;
            display.setText(""+ i);
        }
        if (e.getSource()==seven){
            i*=10;
            i+=7;
            display.setText(""+ i);
        }
        if (e.getSource()==eight){
            i*=10;
            i+=8;
            display.setText(""+ i);
        }
        if (e.getSource()==nine){
            i*=10;
            i+=9;
            display.setText(""+ i);
        }
        if (e.getSource()==zero){
            i*=10;
            display.setText(""+ i);
        }

        if (e.getSource()==p){
            c = e.getActionCommand().charAt(0);
            ans+=i;
            out.setText(""+(int)ans);
            i=0;
            display.setText(""+ i);
        }
        if (e.getSource()==m){
            c = e.getActionCommand().charAt(0);
            if (ans==0)ans=i;
            else
                ans-=i;

            out.setText(""+(int)ans);
            i=0;
            display.setText(""+ i);
        }
        if (e.getSource()==mul){
            c = e.getActionCommand().charAt(0);
            if (ans==0.0)ans=i;
            else{
                if (i!=0)
                    ans*=i;
            }
            out.setText(""+(int)ans);
            i=0;
            display.setText(""+ i);
        }
        if (e.getSource()==div){
            c = e.getActionCommand().charAt(0);
            if (ans==0)ans=i;
            else{
                if (i!=0)
                    ans/=i;
            }
            out.setText(""+ans);
            i=0;
            display.setText(""+ i);
        }

        if (e.getSource()==ac){
            ans=0;
            out.setText("");
            i=0;
            display.setText("");
        }



        if (e.getSource()==equal){
            if (c=='+'){
                ans+=i;
                out.setText(""+(int)ans);
                i=0;
                display.setText(""+i);
            }
            if (c=='-'){
                ans-=i;
                out.setText(""+(int)ans);
                i=0;
                display.setText(""+i);
            }
            if (c=='*'){
                ans*=i;
                out.setText(""+(int)ans);
                i=0;
                display.setText(""+i);
            }
            if (c=='/'){
                if (i==0){
                    out.setText("Dividend can't be 0.");
                }
                else {
                    if(i==0)i=1;
                    ans/=i;
                    out.setText(""+ans);
                    i=0;
                    display.setText(""+i);
                }

            }
        }

    }
}
