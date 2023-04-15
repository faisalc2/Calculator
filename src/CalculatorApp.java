import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp implements ActionListener {
    public double num1,num2,calculation,result;
    JFrame frame;
    ImageIcon icon;
    JLabel jLabel=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onButton,offButton;
    JButton zero,one,two,three,four,five,six,seven,eight,nine,dot,clear,delete,equal,mul,div,plus,minus,square,reciprocal,Sqrt;


    public CalculatorApp() {
        frame=new JFrame("CALCULATOR");
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);//aita na dile left corner e start hobe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        icon = new ImageIcon("images.png");
        frame.setIconImage(icon.getImage());

        jLabel.setBounds(80,-5,150,50);
        jLabel.setFont(new Font("Arial",Font.BOLD,20));
        jLabel.setForeground(Color.WHITE);
        frame.add(jLabel);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);
        frame.add(textField);

        onButton=new JRadioButton("ON");
        onButton.setBounds(10,95,60,40);
        onButton.setSelected(true);
        onButton.setFont(new Font("Arial",Font.BOLD,14));
        onButton.setBackground(Color.black);
        onButton.setForeground(Color.white);
        onButton.setFocusable(false);
        onButton.addActionListener(this);
        frame.add(onButton);

        offButton=new JRadioButton("OFF");
        offButton.setBounds(10,120,60,40);
        offButton.setSelected(false);
        offButton.setFont(new Font("Arial",Font.BOLD,14));
        offButton.setBackground(Color.black);
        offButton.setForeground(Color.white);
        offButton.setFocusable(false);
        offButton.addActionListener(this);
        frame.add(offButton);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onButton);
        buttonGroup.add(offButton);

        seven=new JButton("7");
        seven.setFont(new Font("Arial",Font.BOLD,20));
        seven.setBounds(10,230,60,40);
        seven.setFocusable(false);
        seven.addActionListener(this);
        frame.add(seven);

        eight=new JButton("8");
        eight.setFont(new Font("Arial",Font.BOLD,20));
        eight.setBounds(80,230,60,40);
        eight.setFocusable(false);
        eight.addActionListener(this);
        frame.add(eight);

        nine=new JButton("9");
        nine.setFont(new Font("Arial",Font.BOLD,20));
        nine.setBounds(150,230,60,40);
        nine.setFocusable(false);
        nine.addActionListener(this);
        frame.add(nine);

        four=new JButton("4");
        four.setFont(new Font("Arial",Font.BOLD,20));
        four.setBounds(10,290,60,40);
        four.setFocusable(false);
        four.addActionListener(this);
        frame.add(four);

        five=new JButton("5");
        five.setFont(new Font("Arial",Font.BOLD,20));
        five.setBounds(80,290,60,40);
        five.setFocusable(false);
        five.addActionListener(this);
        frame.add(five);

        six=new JButton("6");
        six.setFont(new Font("Arial",Font.BOLD,20));
        six.setBounds(150,290,60,40);
        six.setFocusable(false);
        six.addActionListener(this);
        frame.add(six);

        one=new JButton("1");
        one.setFont(new Font("Arial",Font.BOLD,20));
        one.setBounds(10,350,60,40);
        one.setFocusable(false);
        one.addActionListener(this);
        frame.add(one);

        two=new JButton("2");
        two.setFont(new Font("Arial",Font.BOLD,20));
        two.setBounds(80,350,60,40);
        two.setFocusable(false);
        two.addActionListener(this);
        frame.add(two);

        three=new JButton("3");
        three.setFont(new Font("Arial",Font.BOLD,20));
        three.setBounds(150,350,60,40);
        three.setFocusable(false);
        three.addActionListener(this);
        frame.add(three);

        zero=new JButton("0");
        zero.setFont(new Font("Arial",Font.BOLD,20));
        zero.setBounds(10,410,130,40);
        zero.setFocusable(false);
        zero.addActionListener(this);
        frame.add(zero);

        dot=new JButton(".");
        dot.setFont(new Font("Arial",Font.BOLD,20));
        dot.setBounds(150,410,60,40);
        dot.setFocusable(false);
        dot.addActionListener(this);
        frame.add(dot);

        equal=new JButton("=");
        equal.setFont(new Font("Arial",Font.BOLD,20));
        equal.setBounds(220,350,60,100);
        equal.setBackground(Color.YELLOW);
        equal.setFocusable(false);
        equal.addActionListener(this);
        frame.add(equal);

        plus=new JButton("+");
        plus.setFont(new Font("Arial",Font.BOLD,20));
        plus.setBounds(220,290,60,40);
        plus.setBackground(Color.YELLOW);
        plus.setFocusable(false);
        plus.addActionListener(this);
        frame.add(plus);

        minus=new JButton("-");
        minus.setFont(new Font("Arial",Font.BOLD,20));
        minus.setBounds(220,230,60,40);
        minus.setBackground(Color.YELLOW);
        minus.setFocusable(false);
        minus.addActionListener(this);
        frame.add(minus);

        mul=new JButton("x");
        mul.setFont(new Font("Arial",Font.BOLD,20));
        mul.setBounds(220,170,60,40);
        mul.setBackground(Color.YELLOW);
        mul.setFocusable(false);
        mul.addActionListener(this);
        frame.add(mul);

        div=new JButton("÷");
        div.setFont(new Font("Arial",Font.BOLD,20));
        div.setBounds(220,110,60,40);
        div.setBackground(Color.YELLOW);
        div.setFocusable(false);
        div.addActionListener(this);
        frame.add(div);

        delete=new JButton("DEL");
        delete.setFont(new Font("Arial",Font.BOLD,13));
        delete.setBounds(150,110,60,40);
        delete.setBackground(Color.red);
        delete.setFocusable(false);
        delete.addActionListener(this);
        frame.add(delete);

        clear=new JButton("C");
        clear.setFont(new Font("Arial",Font.BOLD,13));
        clear.setBounds(80,110,60,40);
        clear.setBackground(Color.red);
        clear.setFocusable(false);
        clear.addActionListener(this);
        frame.add(clear);

        reciprocal=new JButton("1/x");
        reciprocal.setFont(new Font("Arial",Font.BOLD,13));
        reciprocal.setBounds(150,170,60,40);
        reciprocal.setBackground(Color.YELLOW);
        reciprocal.setFocusable(false);
        reciprocal.addActionListener(this);
        frame.add(reciprocal);

        square=new JButton("X\u00B2");
        square.setFont(new Font("Arial",Font.BOLD,13));
        square.setBounds(80,170,60,40);
        square.setBackground(Color.YELLOW);
        square.setFocusable(false);
        square.addActionListener(this);
        frame.add(square);

        Sqrt=new JButton("\u221A");
        Sqrt.setFont(new Font("Arial",Font.BOLD,20));
        Sqrt.setBounds(10,170,60,40);
        Sqrt.setBackground(Color.YELLOW);
        Sqrt.setFocusable(false);
        Sqrt.addActionListener(this);
        frame.add(Sqrt);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        if(source==onButton){
            onButton.setEnabled(false);
            offButton.setEnabled(true);
            textField.setEnabled(true);
            jLabel.setEnabled(true);
            clear.setEnabled(true);
            delete.setEnabled(true);
            div.setEnabled(true);
            square.setEnabled(true);
            Sqrt.setEnabled(true);
            reciprocal.setEnabled(true);
            minus.setEnabled(true);
            plus.setEnabled(true);
            mul.setEnabled(true);
            equal.setEnabled(true);
            zero.setEnabled(true);
            dot.setEnabled(true);
            one.setEnabled(true);
            two.setEnabled(true);
            three.setEnabled(true);
            four.setEnabled(true);
            five.setEnabled(true);
            six.setEnabled(true);
            seven.setEnabled(true);
            eight.setEnabled(true);
            nine.setEnabled(true);
        }else if(source==offButton){
            onButton.setEnabled(true);
            offButton.setEnabled(false);
            textField.setEnabled(false);
            jLabel.setEnabled(false);
            clear.setEnabled(false);
            delete.setEnabled(false);
            div.setEnabled(false);
            square.setEnabled(false);
            Sqrt.setEnabled(false);
            reciprocal.setEnabled(false);
            minus.setEnabled(false);
            plus.setEnabled(false);
            mul.setEnabled(false);
            equal.setEnabled(false);
            zero.setEnabled(false);
            dot.setEnabled(false);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
            eight.setEnabled(false);
            nine.setEnabled(false);
        }else if(source==clear){
            jLabel.setText("");
            textField.setText("");
        } else if (source==delete) {
            int length= textField.getText().length();
            if(length>0){
                StringBuilder back =new StringBuilder(textField.getText());/////buji nai kisu
                back.deleteCharAt(length-1);
                textField.setText(back.toString());//??
            }if(textField.getText().endsWith("")){//???
                jLabel.setText("");
            }
        } else if (source==zero) {
            if(textField.getText().equals("0")){
                return ;// return nothing
            }else{
                textField.setText(textField.getText()+"0");
            }
        } else if (source==one) {
            textField.setText(textField.getText()+"1");
        } else if (source==two) {
            textField.setText(textField.getText()+"2");
        } else if (source== three) {
            textField.setText(textField.getText()+"3");
        } else if (source==four) {
            textField.setText(textField.getText()+"4");
        } else if (source==five) {
            textField.setText(textField.getText()+"5");
        }else if (source==six){
            textField.setText(textField.getText()+"6");
        } else if (source==seven) {
            textField.setText(textField.getText()+"7");
        } else if (source==eight) {
            textField.setText(textField.getText()+"8");
        } else if (source==nine) {
            textField.setText(textField.getText()+"9");
        } else if (source==dot) {
            if(textField.getText().contains(".")){//equals dile hobena??
                return;
            }else {
                textField.setText(textField.getText()+".");
            }
        } else if (source==plus) {
            if(textField.getText().equals("")) {
                return;
            }else {
                String str = textField.getText();//?????
                num1 = Double.parseDouble(textField.getText());
                calculation = 1;
                textField.setText("");
                jLabel.setText(str + "+");//????????????????
            }
            
        } else if (source==minus) {
            if(textField.getText().equals("")) {
                jLabel.setText("No Input");
            }else {
                String str = textField.getText();//?????
                num1 = Double.parseDouble(textField.getText());
                calculation = 2;
                textField.setText("");
                jLabel.setText(str + "-");//????????????????
            }
        } else if (source==mul) {
            if(textField.getText().equals("")) {
                return;
            }else {
                String str = textField.getText();//?????
                num1 = Double.parseDouble(textField.getText());
                calculation = 3;
                textField.setText("");
                jLabel.setText(str + "X");//????????????????
            }
        } else if (source==div) {
            if(textField.getText().equals("")) {
                return;
            }else {
                String str = textField.getText();//?????
                num1 = Double.parseDouble(textField.getText());
                calculation = 4;
                textField.setText("");
                jLabel.setText(str + "/");//????????????????
            }
        } else if (source==square) {
            if(textField.getText().equals("")) {
                return;
            }else {
                num1 = Double.parseDouble(textField.getText());
                double res = Math.pow(num1, 2);
                String str = Double.toString(res);///////////
                if (str.endsWith(".0")) {
                    textField.setText(str.replace(".0", ""));
                } else {
                    textField.setText(str);
                }
            }
        } else if (source==Sqrt) {
            if(textField.getText().equals("")) {
                return;
            }else {
                num1 = Double.parseDouble(textField.getText());
                double res = Math.sqrt(num1);
                textField.setText(Double.toString(res));
            }
        } else if (source==reciprocal) {
            if(textField.getText().equals("")) {
                return;
            }else {
                num1 = Double.parseDouble(textField.getText());
                double res = 1 / num1;
                String str = Double.toString(res);
                if (str.endsWith(".0")) {
                    textField.setText(str.replace(".0", ""));
                } else {
                    textField.setText(str);
                }
            }
        } else if (source == equal) {
            if(textField.getText().equals("")) {
                return;
            }else {
                num2 = Double.parseDouble(textField.getText());
                switch ((int) calculation) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1 / num2;
                }
                if (Double.toString(result).endsWith(".0")) {
                    textField.setText(Double.toString(result).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(result));
                }
                jLabel.setText("");
                num1 = result;
            }
        }

    }
}