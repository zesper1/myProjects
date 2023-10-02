package com.mycompany.espere;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Espere extends JFrame {
private JLabel oneJL, twoJL, threeJL, fourJL;

private JTextField  oneTF, twoTF, threeTF, fourTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;

private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    oneJL = new JLabel("Height in Centimeters: ", SwingConstants.RIGHT);
    twoJL = new JLabel("Weight in Kilograms: ", SwingConstants.RIGHT);
    threeJL = new JLabel("Body Mass Index: ", SwingConstants.RIGHT); 
    fourJL = new JLabel("Classification: ", SwingConstants.RIGHT);
    // Jtextfield
    oneTF = new JTextField(5);
    twoTF = new JTextField(5);
    threeTF = new JTextField(5);
    fourTF = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);   
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(5,2));
    
    cont.add(oneJL);
    cont.add(oneTF);
    cont.add(twoJL);
    cont.add(twoTF);
    cont.add(threeJL);
    cont.add(threeTF);   
    cont.add(fourJL);
    cont.add(fourTF);         
    cont.add(calculateB);
    cont.add(exitB);
    
    
    setTitle("Area Perimeter Calculator");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        double heinput,hei , wei, aids, BMI;
        heinput = Double.parseDouble(oneTF.getText());
        hei = heinput * 0.01;
        wei = Double.parseDouble(twoTF.getText());
        BMI = wei / (hei * hei);
        threeTF.setText("" + BMI);
        if (BMI > 18.5 && BMI < 24.9)
        {
            fourTF.setText("Your BMI is normal");
        } else {
            if (BMI > 25 && BMI < 29.9){
            fourTF.setText("Your BMI is above normal");    
            } else 
            {
            fourTF.setText("YOU ARE OBESE");
            }
        }
        
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}
/*public class Espere extends JFrame {
private JLabel oneJL, twoJL, threeJL, fourJL;

private JTextField  oneTF, twoTF, threeTF, fourTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;

private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    oneJL = new JLabel("Enter Amount of Peso: ", SwingConstants.RIGHT);
    twoJL = new JLabel("Peso converted to Hongkong Dollar: ", SwingConstants.RIGHT);
    threeJL = new JLabel("Peso converted to Chinese Yuan: ", SwingConstants.RIGHT); 
    fourJL = new JLabel("Peso converted to United States Dollar", SwingConstants.RIGHT);
    // Jtextfield
    oneTF = new JTextField(5);
    twoTF = new JTextField(5);
    threeTF = new JTextField(5);
    fourTF = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);   
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(5,2));
    
    cont.add(oneJL);
    cont.add(oneTF);
    cont.add(twoJL);
    cont.add(twoTF);
    cont.add(threeJL);
    cont.add(threeTF);   
    cont.add(fourJL);
    cont.add(fourTF);         
    cont.add(calculateB);
    cont.add(exitB);
    
    
    setTitle("Area Perimeter Calculator");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        double peso, hk, chn, dollar;
        peso = Double.parseDouble(oneTF.getText());
        hk = peso * 0.14;
        chn = peso * 0.12;
        dollar = peso * 0.018;
        twoTF.setText("" + hk);
        threeTF.setText("" + chn);
        fourTF.setText("" + dollar);
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}
public class Espere extends JFrame {
private JLabel oneJL, twoJL, threeJL;

private JTextField  oneTF, twoTF, threeTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;

private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    oneJL = new JLabel("Enter Diameter: ", SwingConstants.RIGHT);
    twoJL = new JLabel("Radius: ", SwingConstants.RIGHT);
    threeJL = new JLabel("Circumference: ", SwingConstants.RIGHT); 
    
    // Jtextfield
    oneTF = new JTextField(5);
    twoTF = new JTextField(5);
    threeTF = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);   
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(4,2));
    
    cont.add(oneJL);
    cont.add(oneTF);
    cont.add(twoJL);
    cont.add(twoTF);
    cont.add(threeJL);
    cont.add(threeTF);           
    cont.add(calculateB);
    cont.add(exitB);
    
    
    setTitle("Area Perimeter Calculator");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        double dia, rad, cum;
        double pie = 3.14;
        dia = Double.parseDouble(oneTF.getText());
        rad = dia / 2;
        cum = (2 * pie) * rad;
        twoTF.setText(""+rad);
        threeTF.setText(""+cum);
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}
public class Espere extends JFrame {
private JLabel oneJL, twoJL, threeJL, fourJL;

private JTextField  oneTF, twoTF, threeTF, fourTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;

private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    oneJL = new JLabel("Enter Fahrenheit ", SwingConstants.RIGHT);
    twoJL = new JLabel("Enter Celcius: ", SwingConstants.RIGHT);
    threeJL = new JLabel("Celcius: ", SwingConstants.RIGHT); 
    fourJL = new JLabel("Fahrenheit: ", SwingConstants.RIGHT);
    
    // Jtextfield
    oneTF = new JTextField(5);
    twoTF = new JTextField(5);
    threeTF = new JTextField(5);
    fourTF = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);   
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(5,2));
    
    cont.add(oneJL);
    cont.add(oneTF);
    cont.add(twoJL);
    cont.add(twoTF);
    cont.add(threeJL);
    cont.add(threeTF);   
    cont.add(fourJL);
    cont.add(fourTF);         
    cont.add(calculateB);
    cont.add(exitB);
    
    
    setTitle("Area Perimeter Calculator");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        double tempo, fah;
        tempo = Double.parseDouble(oneTF.getText());
        fah = (tempo * 1.8) + 32;
        
        threeTF.setText("" + fah);
        
        double tempi, calc;
        tempi = Double.parseDouble(twoTF.getText());
        calc = (tempi - 0.5556) - 32;
        fourTF.setText("" + calc);
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}
/*public class Espere extends JFrame {
private JLabel oneJL, twoJL, threeJL, fourJL;

private JTextField  oneTF, twoTF, threeTF, fourTF;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;
private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    oneJL = new JLabel("Length: ", SwingConstants.RIGHT);
    twoJL = new JLabel("Width: ", SwingConstants.RIGHT);
    threeJL = new JLabel("Area: ", SwingConstants.RIGHT);
    fourJL = new JLabel("Perimeter: ", SwingConstants.RIGHT);
    
    // Jtextfield
    oneTF = new JTextField(5);
    twoTF = new JTextField(5);
    threeTF = new JTextField(5);
    fourTF = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(5,2));
    
    cont.add(oneJL);
    cont.add(oneTF);
    cont.add(twoJL);
    cont.add(twoTF);
    cont.add(threeJL);
    cont.add(threeTF);
    cont.add(fourJL);
    cont.add(fourTF);
    cont.add(calculateB);
    cont.add(exitB);
    
    
    setTitle("Area Perimeter Calculator");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
    double length, width, area2, perimeter2;
        length = Double.parseDouble(oneTF.getText());
        width = Double.parseDouble(twoTF.getText());
        
        area2 = length * width;
        perimeter2 = (length * 2) + (width * 2);
        
        threeTF.setText(""+ area2);
        fourTF.setText("" + perimeter2);    
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}
public class Espere extends JFrame {
private JFrame frfr = new JFrame("Decimal to Binary");

private JLabel decimal, binary, hexa;

private JTextField  decimaltwo, binarytwo, hexadecimal;

private JButton calculateB, exitB;

private CalculateButtonHandler cbHandler;
private ExitButtonHandler ebHandler;

public static int WIDTH = 600;
public static int HEIGHT = 400;

public Espere(){
    // Jlabel
    decimal = new JLabel("Enter Decimal: ", SwingConstants.RIGHT);
    binary = new JLabel("Binary: ", SwingConstants.RIGHT);
    hexa = new JLabel("Hexadecimal: ", SwingConstants.RIGHT);

    // Jtextfield
    decimaltwo = new JTextField(5);
    binarytwo = new JTextField(5);
    hexadecimal = new JTextField(5);
    //calculate button
    calculateB = new JButton ("Convert");
    cbHandler = new CalculateButtonHandler();
    calculateB.addActionListener((ActionListener)cbHandler);
    // exit button
    exitB = new JButton ("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    // window pane
    Container cont = getContentPane();
    cont.setLayout(new GridLayout(4,2));
    
    cont.add(decimal);
    cont.add(decimaltwo);
    cont.add(binary);
    cont.add(binarytwo);
    cont.add(hexa);
    cont.add(hexadecimal);
    cont.add(calculateB);
    cont.add(exitB);
    
    setTitle("Decimal to Binary/Hexadecimal");
    setSize (WIDTH,HEIGHT);
    setVisible (true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);   
}
private class CalculateButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
    double bin;
    int dec = Integer.parseInt(decimaltwo.getText());
    binarytwo.setText(Integer.toBinaryString(dec));
    hexadecimal.setText(Integer.toHexString(dec));    
    }
}

private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
public static void main(String[] args)
    {
        Espere wAveObject = new Espere();
    }
}*/
