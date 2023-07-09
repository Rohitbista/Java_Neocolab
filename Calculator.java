import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 50);
    JLabel lbCalculator;
    JTextField tfcalculate;
    private String cal = "";
    public void initialize(){
        tfcalculate = new JTextField();
        tfcalculate.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 1, 5, 5));
        formPanel.add(tfcalculate);

        //Calculator label
        lbCalculator = new JLabel();
        lbCalculator.setFont(mainFont);


        //Buttons Panel
        JButton btn0 = new JButton("0");
        btn0.setFont(mainFont);
        btn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "0");
                cal+="0";
            }
        });

        JButton btn1 = new JButton("1");
        btn1.setFont(mainFont);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "1");
                cal+="1";
            }
        });

        JButton btn2 = new JButton("2");
        btn2.setFont(mainFont);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "2");
                cal+="2";
            }
        });

        JButton btn3 = new JButton("3");
        btn3.setFont(mainFont);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "3");
                cal+="3";
            }
        });

        JButton btn4 = new JButton("4");
        btn4.setFont(mainFont);
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "4");
                cal+="4";
            }
        });

        JButton btn5 = new JButton("5");
        btn5.setFont(mainFont);
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "5");
                cal+="5";
            }
        });

        JButton btn6 = new JButton("6");
        btn6.setFont(mainFont);
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "6");
                cal+="6";
            }
        });

        JButton btn7 = new JButton("7");
        btn7.setFont(mainFont);
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "7");
                cal+="7";
            }
        });

        JButton btn8 = new JButton("8");
        btn8.setFont(mainFont);
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "8");
                cal+="8";
            }
        });

        JButton btn9 = new JButton("9");
        btn9.setFont(mainFont);
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "9");
                cal+="9";
            }
        });

        //Clear button
        JButton btnC = new JButton("C");
        btnC.setFont(mainFont);
        btnC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cal="";
                tfcalculate.setText(cal);
            }
        });

        JButton btnplus = new JButton("+");
        btnplus.setFont(mainFont);
        btnplus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "+");
                cal+="+";
            }
        });

        JButton btnminus = new JButton("-");
        btnminus.setFont(mainFont);
        btnminus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "-");
                cal+="-";
            }
        });

        JButton btndiv = new JButton("/");
        btndiv.setFont(mainFont);
        btndiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "/");
                cal+="/";
            }
        });

        JButton btnmul = new JButton("*");
        btnmul.setFont(mainFont);
        btnmul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tfcalculate.setText(tfcalculate.getText() + "*");
                cal+="*";
            }
        });

        JButton btnequal = new JButton("=");
        btnequal.setFont(mainFont);
        btnequal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal.equals("")){
                    
                }else{
                    int l = cal.length();
                    //System.out.println(cal);

                    int count =1;
                    for(int i=0;i<l;i++){
                        char ch = cal.charAt(i);
                        //System.out.println(ch);
                        if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                            count+=1;
                        }
                    }
                    double[] Arr = new double[count];
                    char[] chra = new char[count-1];
                    int c1= 0;
                    int c3 = 0;
                    String s12 = "";
                    for(int i=0;i<l;i++){
                        char ch = cal.charAt(i);
                        //System.out.println(ch);

                        if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                            chra[c1] = ch;
                            Arr[c3] = Double.parseDouble(s12);
                            s12 = "";
                            c1++;
                            c3++;
                        }else{
                            System.out.println(ch);
                            System.out.println(10*Arr[c3]);
                            s12+=String.valueOf(ch);

                        }
                        
                    }
                    Arr[c3] = Double.parseDouble(s12);
                    //System.out.println(Arr[0]);
                    double fin = 0.0;
                    fin = Arr[0];
                    c3 = 1;
                    for(int j=0;j<c1;j++){
                        if(chra[j]=='+'){
                            fin+=Arr[c3];
                        }else if(chra[j]=='-'){
                            fin-=Arr[c3];
                        }else if(chra[j]=='*'){
                            fin*=Arr[c3];
                        }else if(chra[j]=='/'){
                            fin/=Arr[c3];
                        }
                        c3++;
                    }
                    System.out.println(fin);
                    String answer = String.valueOf(fin);
                    cal="";
                    tfcalculate.setText(answer);
                }
                //dispose();
            }
        });

        JPanel bp = new JPanel();
        bp.setLayout(new GridLayout(4, 4, 5, 5));
        bp.add(btn7);
        bp.add(btn8);
        bp.add(btn9);
        bp.add(btndiv);
        bp.add(btn4);
        bp.add(btn5);
        bp.add(btn6);
        bp.add(btnmul);
        bp.add(btn1);
        bp.add(btn2);
        bp.add(btn3);
        bp.add(btnminus);
        bp.add(btnC);
        bp.add(btn0);
        bp.add(btnequal);
        bp.add(btnplus);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(bp, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("Calculator");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.initialize();
    }
}