package Ejercicios_tercer_corte;
public class Ejercicio_4_23 extends javax.swing.JFrame {
    double a,b,c,raiz_1,raiz_2,discriminante;
    public Ejercicio_4_23() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        coeficientea = new javax.swing.JLabel();
        coeficientec = new javax.swing.JLabel();
        coeficienteb = new javax.swing.JLabel();
        texto_coeficienteb = new javax.swing.JTextField();
        texto_coeficientea = new javax.swing.JTextField();
        texto_coeficientec = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setText("Ejercicio 23 capítulo 4");

        coeficientea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coeficientea.setText("Coeficiente a:");

        coeficientec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coeficientec.setText("Coeficiente c:");

        coeficienteb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        coeficienteb.setText("Coeficiente b:");

        texto_coeficienteb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_coeficienteb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_coeficientebActionPerformed(evt);
            }
        });

        texto_coeficientea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        texto_coeficientec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        boton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boton.setText("Calcular raíces");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        texto_info.setColumns(20);
        texto_info.setRows(5);
        jScrollPane1.setViewportView(texto_info);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coeficienteb)
                                    .addComponent(coeficientea)
                                    .addComponent(coeficientec))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto_coeficienteb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto_coeficientea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto_coeficientec, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(titulo)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficientea)
                    .addComponent(texto_coeficientea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficienteb)
                    .addComponent(texto_coeficienteb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficientec)
                    .addComponent(texto_coeficientec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(boton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_coeficientebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_coeficientebActionPerformed

    }//GEN-LAST:event_texto_coeficientebActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        a = Double.parseDouble(texto_coeficientea.getText());
        b = Double.parseDouble(texto_coeficienteb.getText());
        c = Double.parseDouble(texto_coeficientec.getText());
        discriminante = Math.sqrt(Math.pow(b, 2)-(4*a*c));
        raiz_1 = (-b + discriminante)/(2*a);
        raiz_2 = (-b - discriminante)/(2*a);
        texto_info.setText("Raíz: "+raiz_1+"\nRaiz: "+raiz_2);
    }//GEN-LAST:event_botonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_4_23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel coeficientea;
    private javax.swing.JLabel coeficienteb;
    private javax.swing.JLabel coeficientec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField texto_coeficientea;
    private javax.swing.JTextField texto_coeficienteb;
    private javax.swing.JTextField texto_coeficientec;
    private javax.swing.JTextArea texto_info;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
