package Ejercicios_tercer_corte;

import javax.swing.JOptionPane;

public class Ejercicio_4_41 extends javax.swing.JFrame {

    public Ejercicio_4_41() {
        initComponents();
    }
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        numeros = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18));
        titulo.setText("Ejercicio 41 capítulo 4");

        numeros.setFont(new java.awt.Font("Arial", 0, 14));
        numeros.setText("Números:");

        texto.setFont(new java.awt.Font("Arial", 0, 14));
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        boton.setFont(new java.awt.Font("Arial", 0, 14));
        boton.setText("Calcular número mayor");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(numeros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton)
                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {
        String lista = texto.getText();
        String[] lista_sep = lista.split(",");
        double mayor = Double.parseDouble(lista_sep[0]);
        for (int i = 0; i < lista_sep.length; i++) {
            double numero = Double.parseDouble(lista_sep[i]);
            if (numero>mayor) {
                mayor = numero;  
            }   
        } JOptionPane.showMessageDialog(null,"El número mayor es el: "+mayor);
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_4_41().setVisible(true);
            }
        });
    }
    private javax.swing.JButton boton;
    private javax.swing.JLabel numeros;
    private javax.swing.JTextField texto;
    private javax.swing.JLabel titulo;
}
