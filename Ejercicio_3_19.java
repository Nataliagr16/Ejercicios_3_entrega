package Ejercicios_tercer_corte;

public class Ejercicio_3_19 extends javax.swing.JFrame {
    double lado_triang,perimetro,area,altura;

    public Ejercicio_3_19() {
        initComponents();
    }

    private void initComponents() {

        titulo = new javax.swing.JLabel();
        lado = new javax.swing.JLabel();
        texto_lado = new javax.swing.JTextField();
        boton_info = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo.setText("Ejercicio 19 capítulo 3");

        lado.setText("Lado del triángulo equilátero:");

        texto_lado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ladoActionPerformed(evt);
            }
        });

        boton_info.setText("Obtener información del triángulo");
        boton_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_infoActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(boton_info)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lado)
                                .addGap(18, 18, 18)
                                .addComponent(texto_lado, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(titulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lado)
                    .addComponent(texto_lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_info)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }

    private void boton_infoActionPerformed(java.awt.event.ActionEvent evt) {
        lado_triang = Double.parseDouble(texto_lado.getText());
        perimetro = 3*lado_triang;
        altura = Math.sqrt(Math.pow(lado_triang,2)-Math.pow(lado_triang/2,2));
        area = (lado_triang*altura)/2;
        texto_info.setText("Altura: "+altura+"\nPerímetro: "+perimetro+"\nArea: "+area);
    }

    private void texto_ladoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_3_19().setVisible(true);
            }
        });
    }

    private javax.swing.JButton boton_info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lado;
    private javax.swing.JTextArea texto_info;
    private javax.swing.JTextField texto_lado;
    private javax.swing.JLabel titulo;

}
