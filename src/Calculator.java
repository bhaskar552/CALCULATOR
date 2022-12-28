import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel my_panel;
    private JTextField Display;
    private JPanel keyspanel;
    private JButton ACButton;
    private JButton backspaceButton;
    private JButton changesignButton;
    private JButton plusButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton SixButton;
    private JButton FiveButton;
    private JButton fourButton;
    private JButton DivideButton;
    private JButton ThreeButton;
    private JButton TwoButton;
    private JButton oneButton;
    private JButton equalsButton;
    private JButton dotButton;
    private JButton zeroButton;
    private JButton doublezeroButton;
    private JButton ANSWER_BUTTON;
    private String opA;
    private String opB;
    private String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("");
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"7");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"4");
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"1");
            }
        });
        doublezeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"00");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"0");
            }
        });
        TwoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"2");
            }
        });
        FiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"5");
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"9");
            }
        });
        SixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"6");
            }
        });
        ThreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText()+"3");
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.contains("."))
                {
                    disp=disp+".";
                    Display.setText(disp);
                }
            }
        });
        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    disp=disp.substring(0,disp.length()-1);
                }
                Display.setText(disp);
            }
        });
        changesignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    if (disp.contains("=")) {
                        String str=disp.substring(disp.indexOf("=")+1);
                        str=str.substring(0,str.indexOf("."));
                        double anotherdisp = Double.parseDouble(str);
                        anotherdisp=-anotherdisp;
                        Display.setText(Double.toString(anotherdisp));

                    } else if (disp.contains(".")) {
                        double anotherdisp = Double.parseDouble(disp);
                        anotherdisp=-anotherdisp;
                        Display.setText(Double.toString(anotherdisp));

                    } else {
                        int intDisp =Integer.parseInt(disp);
                        intDisp=-intDisp;
                        Display.setText(Integer.toString(intDisp));
                    }
                }
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="+";
                    Display.setText(disp+"+");
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="-";
                    Display.setText(disp+"-");

                }
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="*";
                    Display.setText(disp+"*");
                }
            }
        });

        DivideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="/";
                    Display.setText(disp+"/");
                }
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=Display.getText();
                if(!disp.isEmpty())
                {
                    double a=Double.parseDouble(opA);
                    //double b=Double.parseDouble(opB);
                    String result="";
                    if(op.equals("+"))
                    {
                        opB=disp.substring(disp.indexOf("+")+1);
                        double b=Double.parseDouble(opB);
                        result=Double.toString(a+b);
                    } else if (op.equals("-")) {
                        opB=disp.substring(disp.indexOf("-")+1);
                        double b=Double.parseDouble(opB);
                        result=Double.toString(a-b);
                    } else if (op.equals("*")) {
                        opB=disp.substring(disp.indexOf("*")+1);
                        double b=Double.parseDouble(opB);
                        result=Double.toString(a*b);
                    } else if (op.equals("/")) {
                        opB=disp.substring(disp.indexOf("/")+1);
                        double b=Double.parseDouble(opB);
                        result=Double.toString(a/b);
                    }
                    Display.setText(disp+"="+result);
                }
            }
        });
        ANSWER_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ab=Display.getText();
                try
                {
                    ab=ab.substring(ab.indexOf("=")+1);
                    Display.setText(ab);
                }
                catch (Exception q)
                {
                    Display.setText("Error");
                }
            }
        });
    }

    public JPanel getRoot()
    {
        return my_panel;
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("Calculator");
        frame.setContentPane((new Calculator()).getRoot());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
