package com.apple.chapter.six;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.apple.chapter.ten.Ceshi.closeThis;

public class UserInte {
    public static void main(String[] args) {
        JFrame frame = new JFrame("用户登录");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("用户名:");

        userLabel.setBounds(10,20,100,35);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(90,30,180,20);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("登录密码:");
        passwordLabel.setBounds(10,50,100,35);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(90,60,180,20);
        panel.add(passwordText);

        JButton loginButton = new JButton("登录");
        loginButton.setBounds(20, 120, 90, 25);
        panel.add(loginButton);

        JButton retrievePasswordButton = new JButton("找回密码");
        retrievePasswordButton.setBounds(240, 120, 90, 25);
        panel.add(retrievePasswordButton);
        retrievePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeThis();

                JFrame frame3 = new JFrame("找回密码");

                frame3.setLocation(100,50);

                frame3.setSize(300,150);

                JPanel panel3 = new JPanel();

                frame3.add(panel3);

                placeComponents(panel3);

                frame3.setVisible(true);

            }
            private void placeComponents(JPanel panel3){
                JLabel retrieveLabel = new JLabel("多吃点脑白金啦，兄die！！！");

                retrieveLabel.setBounds(30, 80, 250, 50);
                panel3.add(retrieveLabel);
            }

        });

        JButton registerButton = new JButton("注册");
        registerButton.setBounds(130, 120, 90, 25);
        panel.add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeThis();
                JFrame frame2 = new JFrame("用户注册");
                frame2.setSize(450, 200);
//                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
                JPanel panel2 = new JPanel();

                frame2.add(panel2);
//
                placeComponents(panel2);

                frame2.setVisible(true);
            }

            private void placeComponents(JPanel panel2) {

                panel2.setLayout(null);

                JLabel userLabel = new JLabel("用户名:");

                userLabel.setBounds(10, 20, 100, 35);
                panel2.add(userLabel);

                JTextField userText = new JTextField(20);
                userText.setBounds(90, 30, 180, 20);
                panel2.add(userText);

                JLabel passwordLabel = new JLabel("登录密码:");
                passwordLabel.setBounds(10, 50, 100, 35);
                panel2.add(passwordLabel);

                JPasswordField passwordText = new JPasswordField(20);
                passwordText.setBounds(90, 60, 180, 20);
                panel2.add(passwordText);

                JLabel mailLabel = new JLabel("用户邮箱:");
                mailLabel.setBounds(10, 80, 100, 35);
                panel2.add(mailLabel);

                JPasswordField mailText = new JPasswordField(20);
                mailText.setBounds(90, 90, 180, 20);
                panel2.add(mailText);

                JButton registerButton = new JButton("注册");
                registerButton.setBounds(270, 120, 90, 25);
                panel2.add(registerButton);
            }
        });
    }
}
