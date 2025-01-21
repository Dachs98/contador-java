package com.iplacex.contador;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador {
    private int contador = 0;

    public Contador() {
        // Crear el marco de la aplicación
        JFrame frame = new JFrame("Contador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        // Etiqueta para mostrar el contador
        JLabel etiquetaContador = new JLabel("Contador: " + contador, SwingConstants.CENTER);
        etiquetaContador.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(etiquetaContador, BorderLayout.CENTER);

        // Botón para incrementar el contador
        JButton botonIncrementar = new JButton("Incrementar");
        frame.add(botonIncrementar, BorderLayout.SOUTH);

        // Acción para el botón
        botonIncrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                etiquetaContador.setText("Contador: " + contador);
            }
        });

        // Mostrar el marco
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Contador();
            }
        });
    }
}
