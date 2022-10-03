package Ejercicios_tercer_corte;
public class Ejercicio_4_10 extends javax.swing.JFrame {
    double patrim,est,matricula;
    String nom,cod;

    public Ejercicio_4_10() {
        initComponents();
    }
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        numero_inscripcion = new javax.swing.JLabel();
        nombre_estud = new javax.swing.JLabel();
        patrimonio = new javax.swing.JLabel();
        estrato_social = new javax.swing.JLabel();
        texto_num_inscripcion = new javax.swing.JTextField();
        texto_nombre = new javax.swing.JTextField();
        texto_estrato = new javax.swing.JTextField();
        texto_patrimonio = new javax.swing.JTextField();
        boton_calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18));
        titulo.setText("Ejercicio 10 capítulo 4");

        numero_inscripcion.setFont(new java.awt.Font("Arial", 0, 14));
        numero_inscripcion.setText("Número de inscripción:");

        nombre_estud.setFont(new java.awt.Font("Arial", 0, 14));
        nombre_estud.setText("Nombre estudiante:");

        patrimonio.setFont(new java.awt.Font("Arial", 0, 14));
        patrimonio.setText("Patrimonio:");

        estrato_social.setFont(new java.awt.Font("Arial", 0, 14));
        estrato_social.setText("Estrato social:");

        texto_num_inscripcion.setFont(new java.awt.Font("Arial", 0, 14));

        texto_nombre.setFont(new java.awt.Font("Arial", 0, 14));
        
        texto_estrato.setFont(new java.awt.Font("Arial", 0, 14));

        texto_patrimonio.setFont(new java.awt.Font("Arial", 0, 14));

        boton_calcular.setFont(new java.awt.Font("Arial", 0, 14));
        boton_calcular.setText("Calcular matrícula");
        boton_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_calcularActionPerformed(evt);
            }
        });

        texto_info.setColumns(20);
        texto_info.setFont(new java.awt.Font("Arial", 0, 14));
        texto_info.setRows(5);
        jScrollPane1.setViewportView(texto_info);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre_estud)
                            .addComponent(numero_inscripcion)
                            .addComponent(patrimonio)
                            .addComponent(estrato_social))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_num_inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_estrato, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(titulo)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_inscripcion)
                    .addComponent(texto_num_inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_estud)
                    .addComponent(texto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patrimonio)
                    .addComponent(texto_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estrato_social)
                    .addComponent(texto_estrato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton_calcular)
                        .addGap(34, 34, 34)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }
    private void boton_calcularActionPerformed(java.awt.event.ActionEvent evt) {
        nom = (String)texto_nombre.getText();
        cod = (String)texto_num_inscripcion.getText();
        patrim = Double.parseDouble(texto_patrimonio.getText());
        est = Double.parseDouble(texto_estrato.getText());
        matricula = 50000 + ((3*patrim)/100);
        if((patrim > 2000000) && (est > 3)){
            texto_info.setText("Código: "+cod+"\nNombre: "+nom+"\nValor matrícula: "+matricula);   
        } else{
            texto_info.setText("Código: "+cod+"\nNombre: "+nom+"\nValor matrícula: 50.000");
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_4_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_4_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_4_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_4_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_4_10().setVisible(true);
            }
        });
    }

    private javax.swing.JButton boton_calcular;
    private javax.swing.JLabel estrato_social;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre_estud;
    private javax.swing.JLabel numero_inscripcion;
    private javax.swing.JLabel patrimonio;
    private javax.swing.JTextField texto_estrato;
    private javax.swing.JTextArea texto_info;
    private javax.swing.JTextField texto_nombre;
    private javax.swing.JTextField texto_num_inscripcion;
    private javax.swing.JTextField texto_patrimonio;
    private javax.swing.JLabel titulo;
}
