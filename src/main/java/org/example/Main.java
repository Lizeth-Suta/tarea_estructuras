package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        class CalculadoraGUI extends JFrame implements ActionListener {
            private final JTextField pantalla;
            private double num1;
            private String operador;

            public CalculadoraGUI() {
                setTitle("Calculadora");
                setSize(350, 450);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                pantalla = new JTextField();
                pantalla.setEditable(false);
                pantalla.setFont(new Font("Arial", Font.BOLD, 24));
                add(pantalla, BorderLayout.NORTH);

                JPanel panelBotones = new JPanel();
                panelBotones.setLayout(new GridLayout(5, 4, 5, 5));

                String[] botones = {
                        "7", "8", "9", "/",
                        "4", "5", "6", "*",
                        "1", "2", "3", "-",
                        "0", "C", "=", "+",
                        "^", "√", "%", "C→F"
                };

                for (String texto : botones) {
                    JButton boton = new JButton(texto);
                    boton.setFont(new Font("Arial", Font.BOLD, 20));
                    boton.addActionListener(this);
                    panelBotones.add(boton);
                }

                add(panelBotones, BorderLayout.CENTER);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String comando = e.getActionCommand();

                try {
                    if (comando.matches("[0-9]")) {
                        pantalla.setText(pantalla.getText() + comando);
                    } else if (comando.equals("C")) {
                        pantalla.setText("");
                        num1 = 0;
                        operador = "";
                    } else if (comando.equals("√")) {
                        num1 = Double.parseDouble(pantalla.getText());
                        pantalla.setText(String.valueOf(Math.sqrt(num1)));
                    } else if (comando.equals("C→F")) {
                        double celsius = Double.parseDouble(pantalla.getText());
                        double fahrenheit = (celsius * 9/5) + 32;
                        pantalla.setText(String.format("%.2f", fahrenheit));

                    }else if (comando.matches("[+\\-*/\\^%]") || comando.equals("√")) {

                        num1 = Double.parseDouble(pantalla.getText());
                        operador = comando;
                        pantalla.setText("");
                    } else if (comando.equals("C→F")) {
                        double celsius = Double.parseDouble(pantalla.getText());
                        double fahrenheit = (celsius * 9/5) + 32;
                        pantalla.setText(String.format("%.2f", fahrenheit));
                    } else if (comando.equals("=")) {
                        double num2 = Double.parseDouble(pantalla.getText());
                        double resultado = 0;
                        switch (operador) {
                            case "+": resultado = num1 + num2; break;
                            case "-": resultado = num1 - num2; break;
                            case "*": resultado = num1 * num2; break;
                            case "/": resultado = (num2 != 0) ? num1 / num2 : 0; break;
                            case "^": resultado = Math.pow(num1, num2); break;
                            case "%": resultado = num1 % num2; break;
                        }
                        pantalla.setText(String.valueOf(resultado));
                    } else if (operador.equals("√")) {
                        pantalla.setText(String.valueOf(Math.sqrt(num1)));
                    }
                } catch (Exception ex) {
                    pantalla.setText("Error");
                }
            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> new CalculadoraGUI().setVisible(true));
            }
        }