import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JFrame f;
    JPanel p1,p2;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    JButton barrowr,barrowl,b1,b2,b3,b4,b5,b6;
    Integer i=0,j=0;




    public Frame() {
        ImageIcon arrowright = new ImageIcon("out/Images/arrowright.png");
        Image i2 = arrowright.getImage();
        Image new_img2 = i2.getScaledInstance(75, 55, Image.SCALE_SMOOTH);
        arrowright = new ImageIcon(new_img2);
        ImageIcon finalarrowright=arrowright;
        //arrow right image


        ImageIcon arrowleft = new ImageIcon("out/Images/arrowleft.png");
        Image i1 = arrowleft.getImage();
        Image new_img1 = i1.getScaledInstance(75, 55, Image.SCALE_SMOOTH);
        arrowleft = new ImageIcon(new_img1);
        ImageIcon finalarrowleft=arrowleft;
        //arrow left image



        ImageIcon darksucc = new ImageIcon("out/Images/darksucc.png");
        Image i6 = darksucc.getImage();
        Image new_img6 = i6.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        darksucc = new ImageIcon(new_img6);
        ImageIcon finaldarksucc = darksucc;     //fifth book image



        ImageIcon dowryblood = new ImageIcon("out/Images/dowry blood.png");
        Image i3 = dowryblood.getImage();
        Image new_img3 = i3.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        dowryblood = new ImageIcon(new_img3);
        ImageIcon finaldowryblood = dowryblood;     //fifth book image


        ImageIcon lisaj = new ImageIcon("out/Images/lisaj.png");
        Image i4 = lisaj.getImage();
        Image new_img4 = i4.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        lisaj = new ImageIcon(new_img4);
        ImageIcon finallisaj = lisaj;     //fifth book image

        ImageIcon myroommate = new ImageIcon("out/Images/myroommate.png");
        Image i5 = myroommate.getImage();
        Image new_img5 = i5.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        myroommate = new ImageIcon(new_img5);
        ImageIcon finalmyroommate = myroommate;     //fifth book image


        ImageIcon thefriendzone = new ImageIcon("out/Images/thefriendzone.png");
        Image i7 = thefriendzone.getImage();
        Image new_img7 = i7.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        thefriendzone = new ImageIcon(new_img7);
        ImageIcon finalthefriendzone = thefriendzone;


        ImageIcon toolate = new ImageIcon("out/Images/toolate.png");
        Image i8 = toolate.getImage();
        Image new_img8 = i8.getScaledInstance(230, 325, Image.SCALE_SMOOTH);
        toolate = new ImageIcon(new_img8);
        ImageIcon finaltoolate = toolate; //fifth book image




        f = new JFrame("Home");
        f.setExtendedState(MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(0x2C2B2B));
        f.setVisible(true);










        lb1 = new JLabel();
        lb1.setBounds(250, 30, 230, 325);
        lb1.setIcon(finaldarksucc);
        lb1.setBorder(BorderFactory.createEtchedBorder());



        lb2 = new JLabel();
        lb2.setBounds(550, 30, 230, 325);
        lb2.setIcon(finaldowryblood);
        lb2.setBorder(BorderFactory.createEtchedBorder());



        lb3 = new JLabel();
        lb3.setBounds(850, 30, 230, 325);
        lb3.setIcon(finallisaj);
        lb3.setBorder(BorderFactory.createEtchedBorder());




        barrowr=new JButton();
        barrowr.setBounds(1100,120,75,55);
        barrowr.setIcon(finalarrowright);
        barrowr.setBackground(null);
        barrowr.setFocusPainted(false);
        barrowr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i==0) {
                    lb1.setIcon(finalmyroommate);
                    lb2.setIcon(finalthefriendzone);
                    lb3.setIcon(finaltoolate);
                    i=1;
                } else if (i==1) {
                    lb1.setIcon(finaldarksucc);
                    lb2.setIcon(finaldowryblood);
                    lb3.setIcon(finallisaj);
                    i=0;

                }
            }
        });
        barrowr.setBorder(null);



        barrowl=new JButton();
        barrowl.setBounds(150,120,75,55);
        barrowl.setIcon(finalarrowleft);
        barrowl.setBackground(null);
        barrowl.setBorder(null);
        barrowl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i==0) {
                    lb1.setIcon(finalmyroommate);
                    lb2.setIcon(finalthefriendzone);
                    lb3.setIcon(finaltoolate);
                    i=1;
                } else if (i==1) {
                    lb1.setIcon(finaldarksucc);
                    lb2.setIcon(finaldowryblood);
                    lb3.setIcon(finallisaj);
                    i=0;

                }
            }
        });
        barrowl.setFocusPainted(false);


        b1=new JButton("Buy");
        b1.setBounds(320,400,100,40);
        b1.setBackground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 if (j==0) {
                    if (lb1.getIcon().equals(finaldarksucc)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("Dark Succession 20$");
                    } else if (lb1.getIcon().equals(finalmyroommate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("My Roommate is a vampire 15$");
                    }
                    j=1;
                } else if (j==1) {
                    if (lb1.getIcon().equals(finaldarksucc)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("Dark Succession 20$");
                    } else if (lb1.getIcon().equals(finalmyroommate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("My Roommate is a vampire 15$");
                    }
                    j=2;
                } else if (j==2) {
                    if (lb1.getIcon().equals(finaldarksucc)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("Dark Succession 20$");
                    } else if (lb1.getIcon().equals(finalmyroommate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("My Roommate is a vampire 15$");
                    }
                    j=3;
                } else if (j==3) {
                    JOptionPane.showMessageDialog(p1,"Cart is full","Cart",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b1.setFocusPainted(false);


        b2=new JButton("Buy");
        b2.setBounds(620,400,100,40);
        b2.setBackground(Color.white);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (j==0) {
                    if (lb2.getIcon().equals(finaldowryblood)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("Dowry blood 10$");
                    } else if (lb2.getIcon().equals(finalthefriendzone)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("The friend zone 15$");
                    }
                    j=1;
                } else if (j==1) {
                    if (lb2.getIcon().equals(finaldowryblood)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("Dowry blood 20$");
                    } else if (lb2.getIcon().equals(finalthefriendzone)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("The friendzone 15$");
                    }
                    j=2;
                } else if (j==2) {
                    if (lb2.getIcon().equals(finaldowryblood)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("Dowry blood 20$");
                    } else if (lb2.getIcon().equals(finalthefriendzone)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("The friend zone 15$");
                    }
                    j=3;
                } else if (j==3) {
                    JOptionPane.showMessageDialog(p1,"Cart is full","Cart",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b2.setFocusPainted(false);


        b3=new JButton("Buy");
        b3.setBounds(920,400,100,40);
        b3.setBackground(Color.white);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (j==0) {
                    if (lb3.getIcon().equals(finallisaj)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("Lisa Jewel 20$");
                    } else if (lb3.getIcon().equals(finaltoolate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb4.setText("Too Late 25$");
                    }
                    j=1;
                } else if (j==1) {
                    if (lb3.getIcon().equals(finallisaj)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("Lisa Jewel 20$");
                    } else if (lb3.getIcon().equals(finaltoolate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb5.setText("Too Late 25$");
                    }
                    j=2;
                } else if (j==2) {
                    if (lb3.getIcon().equals(finallisaj)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("Lisa Jewel 20$");
                    } else if (lb3.getIcon().equals(finaltoolate)) {
                        JOptionPane.showMessageDialog(p1,"Item added to cart","Cart",JOptionPane.INFORMATION_MESSAGE);
                        lb6.setText("Too Late 25$");
                    }
                    j=3;
                } else if (j==3) {
                    JOptionPane.showMessageDialog(p1,"Cart is full","Cart",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b3.setFocusPainted(false);

        b4=new JButton("Cart");
        b4.setBounds(1250,3,100,40);
        b4.setBackground(Color.white);
        b4.setFocusPainted(false);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(true);
                p1.setVisible(false);
            }
        });



        b5=new JButton("Back");
        b5.setBounds(200,500,100,40);
        b5.setBackground(Color.white);
        b5.setFocusPainted(false);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(false);
                p1.setVisible(true);
            }
        });


        b6=new JButton("Check Out");
        b6.setBounds(340,500,100,40);
        b6.setBackground(Color.white);
        b6.setFocusPainted(false);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(p2,"Item(s) have been bought successfully","Cart",JOptionPane.INFORMATION_MESSAGE);
                lb4.setVisible(false);
                lb5.setVisible(false);
                lb6.setVisible(false);
            }
        });



        lb4=new JLabel("test");
        lb4.setBounds(100,100,300,100);
        lb4.setForeground(Color.black);
        lb4.setFont(new Font("Arial",Font.BOLD,20));
        lb4.setBackground(null);



        lb5=new JLabel("test");
        lb5.setBounds(100,250,300,100);
        lb5.setForeground(Color.black);
        lb5.setFont(new Font("Arial",Font.BOLD,20));
        lb5.setBackground(null);


        lb6=new JLabel("test");
        lb6.setBounds(100,400,300,100);
        lb6.setForeground(Color.black);
        lb6.setFont(new Font("Arial",Font.BOLD,20));
        lb6.setBackground(null);







        p2=new JPanel();
        p2.setBackground(new Color(0x2C2B2B));
        p2.setSize(getToolkit().getScreenSize());
        p2.setLayout(null);
        p2.setVisible(false);
        p2.add(b5);
        p2.add(lb4);
        p2.add(lb5);
        p2.add(lb6);
        p2.add(b6);
        f.add(p2);



        p1=new JPanel();
        p1.setBackground(new Color(0x2C2B2B));
        p1.setSize(getToolkit().getScreenSize());
        p1.setLayout(null);
        p1.setVisible(true);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(barrowr);
        p1.add(barrowl);
        p1.add(lb1);
        p1.add(lb2);
        p1.add(lb3);
        p1.add(b4);
        f.add(p1);



    }

}
