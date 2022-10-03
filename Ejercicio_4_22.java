package Ejercicios_tercer_corte;
public class Ejercicio_4_22 extends javax.swing.JFrame {
    String emp;
    double horas,valor,salario;
    public Ejercicio_4_22() {
        initComponents();
    }
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        nombre_empleado = new javax.swing.JLabel();
        salario_basico = new javax.swing.JLabel();
        horas_mes = new javax.swing.JLabel();
        texto_emp = new javax.swing.JTextField();
        texto_horas_mes = new javax.swing.JTextField();
        texto_salario = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18));
        titulo.setText("Ejercicio 22 capítulo 4");

        nombre_empleado.setFont(new java.awt.Font("Arial", 0, 14));
        nombre_empleado.setText("Nombre empleado:");

        salario_basico.setFont(new java.awt.Font("Arial", 0, 14));
        salario_basico.setText("Salario básico hora:");

        horas_mes.setFont(new java.awt.Font("Arial", 0, 14));
        horas_mes.setText("Horas trabajadas por mes:");

        texto_emp.setFont(new java.awt.Font("Arial", 0, 14));

        texto_horas_mes.setFont(new java.awt.Font("Arial", 0, 14));

        texto_salario.setFont(new java.awt.Font("Arial", 0, 14));

        boton.setFont(new java.awt.Font("Arial", 0, 14));
        boton.setText("Calcular");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
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
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombre_empleado)
                        .addGap(18, 18, 18)
                        .addComponent(texto_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salario_basico)
                        .addGap(18, 18, 18)
                        .addComponent(texto_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(horas_mes)
                        .addGap(18, 18, 18)
                        .addComponent(texto_horas_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_empleado)
                            .addComponent(texto_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salario_basico)
                            .addComponent(texto_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horas_mes)
                            .addComponent(texto_horas_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(boton)
                        .addGap(62, 62, 62))))
        );

        pack();
    }
    private void botonActionPerformed(java.awt.event.ActionEvent evt) {
        emp = (String)texto_emp.getText();
        horas = Double.parseDouble(texto_salario.getText());
        valor = Double.parseDouble(texto_horas_mes.getText());
        salario = horas*valor;
        if(salario > 450000){
            texto_info.setText(emp+"\nSalario mensual: "+salario);
        }else{
        texto_info.setText(emp);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_4_22().setVisible(true);
            }
        });
    }

    private javax.swing.JButton boton;
    private javax.swing.JLabel horas_mes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre_empleado;
    private javax.swing.JLabel salario_basico;
    private javax.swing.JTextField texto_emp;
    private javax.swing.JTextField texto_horas_mes;
    private javax.swing.JTextArea texto_info;
    private javax.swing.JTextField texto_salario;
    private javax.swing.JLabel titulo;

}
