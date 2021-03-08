package Naipes;

import javax.swing.*;
import java.util.*;

public class Guerra extends javax.swing.JFrame {

    public Guerra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(325, 100, 0, 0));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Repartir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tirar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("JUGADOR 1");

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        jLabel4.setText("CPU");

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ganadas");

        jLabel6.setText("Ganadas");

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("Cartas");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setText("Cartas");
        jTextField6.setBorder(null);

        jButton4.setText("Que Tire!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("INICIO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel9.setText("Ingrese su nombre");

        jTextField7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("JUGADOR");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Naipes/cartas/fondo2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel11)
            .addGroup(layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(577, 577, 577)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(572, 572, 572)
                .addComponent(jButton2))
            .addComponent(jLabel13)
            .addGroup(layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(jLabel3))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel11)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(jButton2))
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //-------------NUMEROS------------- para cada jugador
    int[] cartas = {13, 13, 13, 13, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12};
    int[] jugador1 = new int[20];
    int[] jugador2 = new int[20];

    /*---------Para seguir Jugando
    int[] masoganado1 = new int[40];
    int[] masoganado2 = new int[40];*/
    //-------------PALOS--------------- para cada jugador
    String[] palos
            = {"espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto",
                "espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto",
                "espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto", "espada", "oro", "copa", "basto",
                "espada", "oro", "copa", "basto"};

    String[] veinte1 = new String[20];
    String[] veinte2 = new String[20];

    /*---------Para seguir Jugando
    String[] cuarenta1 = new String[40];
    String[] cuarenta2 = new String[40];*/
    //-------------RANDOM--------------
    Random rnd = new Random();

    String nombre;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nombre = jTextField7.getText();
        jLabel3.setText(nombre.toUpperCase());
        jTextField7.setVisible(false);
        jLabel9.setVisible(false);

        /* * *------------ BOTON  REPARTIR ----------* * */
        int carta = 0;
        int posicion = 0;

        // ----------------SE REPARTEN LAS CARTAS = LOS NUMEROS Y PALOS ---------------------
        for (int i = 0; i < 20; i++) {

            carta = cartas[posicion = rnd.nextInt(40)];
            if (carta != 0) {
                jugador1[i] = carta;
                veinte1[i] = palos[posicion];
            } else {
                while (carta == 0) {
                    carta = cartas[posicion = rnd.nextInt(40)];
                }
                jugador1[i] = carta;
                veinte1[i] = palos[posicion];
            }
            cartas[posicion] = 0;

            carta = cartas[posicion = rnd.nextInt(40)];
            if (carta != 0) {
                jugador2[i] = carta;
                veinte2[i] = palos[posicion];
            } else {
                while (carta == 0) {
                    carta = cartas[posicion = rnd.nextInt(40)];
                }
                jugador2[i] = carta;
                veinte2[i] = palos[posicion];
            }
            cartas[posicion] = 0;

            System.out.println(jugador1[i] + "   " + jugador2[i]);
        }

        //------------VERIFICACION = NO GUERRA EN ULTIMAS 2 POSICIONES----------
        int cambio1 = 0, cambio2 = 0;

        if (jugador1[18] == jugador2[18]) {
            cambio1 = jugador1[2];
            jugador1[2] = jugador1[18];
            jugador1[18] = cambio1;

            cambio2 = jugador2[2];
            jugador2[2] = jugador2[18];
            jugador2[18] = cambio2;

        }

        if (jugador1[19] == jugador2[19]) {

            cambio1 = jugador1[8];
            jugador1[8] = jugador1[19];
            jugador1[19] = cambio1;

            cambio2 = jugador2[8];
            jugador2[8] = jugador2[19];
            jugador2[19] = cambio2;

        }

        //------------------- RELLENO DEVUELTA ARRAY DE CARTAS ------------------
        int contador = 0, j = 13;
        for (int i = 0; i < 40; i++) {
            if (contador < 4) {
                cartas[i] = j;
                contador++;
            } else {
                j--;
                if (j == 9) {
                    j = j - 2;
                }
                contador = 1;
                cartas[i] = j;
            }
        }

        // -- REINICIO DEL JUEGO --
        ganadas1 = 0;
        ganadas2 = 0;
        tiene1 = 20;
        tiene2 = 20;
        jTextField2.setText(tiene2 + "");
        jTextField4.setText(tiene1 + "");
        jTextField1.setText("");
        jTextField3.setText("");

        jButton1.setVisible(false);

        jTextField1.setText(ganadas1 + "");
        jTextField3.setText(ganadas2 + "");


    }//GEN-LAST:event_jButton1ActionPerformed


    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(java.awt.Color.white);
    }//GEN-LAST:event_formWindowOpened

    int i = 0;
    int posicion = 0;
    int ganadas1 = 0, ganadas2 = 0;
    int tiene1 = 20, tiene2 = 20;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        /* * *------------ BOTON  TIRAR ----------* * */
        if (i >= 20) {
            //--------------- FINAL =  MUESTRA EL GANADOR -----------------------------

            if (ganadas1 > ganadas2) {
                JOptionPane.showMessageDialog(null, "GANADOR CPU");
            } else if (ganadas1 < ganadas2) {
                JOptionPane.showMessageDialog(null, "Ganaste " + nombre.toUpperCase() + "!!");
            } else {
                JOptionPane.showMessageDialog(null, "EMPATE De EMPATAR");
            }
            jButton1.setVisible(true);
            i = 0;

            // Se reinicia el contador con valores nuevos
            ganadas1 = 0;
            ganadas2 = 0;
            tiene1 = ganadas1;
            tiene2 = ganadas2;

            jLabel1.setIcon(new ImageIcon(getClass().getResource("")));
            jLabel2.setIcon(new ImageIcon(getClass().getResource("")));

        } else {
            //------------------------- SE MUESTRAN LAS CARTAS ------------------------

            jLabel1.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte1[i] + jugador1[i] + ".png")));
            jLabel2.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte2[i] + jugador2[i] + ".png")));

            //------------------------- PUNTAJE y GUERRA ------------------------------ 
            if (jugador1[i] > jugador2[i]) {
                // Descuento de Cartas
                tiene2 = tiene2 - 1;
                tiene1 = tiene1 - 1;
                jTextField2.setText(tiene2 + "");
                jTextField4.setText(tiene1 + "");

                //Cartas Ganadas
                ganadas1 = ganadas1 + 2;
                jTextField1.setText(ganadas1 + "");

            } else if (jugador1[i] < jugador2[i]) {
                // Descuento de Cartas
                tiene2 = tiene2 - 1;
                tiene1 = tiene1 - 1;
                jTextField2.setText(tiene2 + "");
                jTextField4.setText(tiene1 + "");

                // Cartas Ganadas
                ganadas2 = ganadas2 + 2;
                jTextField3.setText(ganadas2 + "");

            } else if (jugador1[i] == jugador2[i]) {
                jLabel7.setIcon(new ImageIcon(getClass().getResource("cartas/dorso.jpg")));
                jLabel8.setIcon(new ImageIcon(getClass().getResource("cartas/dorso.jpg")));
                JOptionPane.showMessageDialog(null, "GUERRA");
                posicion = i;
                posicion = posicion + 2;
                jLabel1.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte1[posicion] + jugador1[posicion] + ".png")));
                jLabel2.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte2[posicion] + jugador2[posicion] + ".png")));

                if (jugador1[posicion] > jugador2[posicion]) {
                    // Descuento de Cartas
                    tiene2 = tiene2 - 3;
                    tiene1 = tiene1 - 3;
                    jTextField2.setText(tiene2 + "");
                    jTextField4.setText(tiene1 + "");

                    // Cartas Ganadas
                    ganadas1 = ganadas1 + 6;
                    jTextField1.setText(ganadas1 + "");

                    i = i + 2;

                } else if (jugador1[posicion] < jugador2[posicion]) {
                    // Descuento de Cartas
                    tiene2 = tiene2 - 3;
                    tiene1 = tiene1 - 3;
                    jTextField2.setText(tiene2 + "");
                    jTextField4.setText(tiene1 + "");

                    // Cartas Ganadas
                    ganadas2 = ganadas2 + 6;
                    jTextField3.setText(ganadas2 + "");
                    i = i + 2;
                } else if (jugador1[i] == jugador2[i]) {
                    i = i + 2;
                    posicion = i;
                    posicion = posicion + 2;
                    jLabel7.setIcon(new ImageIcon(getClass().getResource("cartas/dorso.jpg")));
                    jLabel8.setIcon(new ImageIcon(getClass().getResource("cartas/dorso.jpg")));
                    JOptionPane.showMessageDialog(null, "GUERRA");
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte1[posicion] + jugador1[posicion] + ".png")));
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte2[posicion] + jugador2[posicion] + ".png")));

                    if (jugador1[posicion] > jugador2[posicion]) {
                        // Descuento de Cartas
                        tiene2 = tiene2 - 5;
                        tiene1 = tiene1 - 5;
                        jTextField2.setText(tiene2 + "");
                        jTextField4.setText(tiene1 + "");

                        // Cartas Ganadas
                        ganadas1 = ganadas1 + 10;
                        jTextField1.setText(ganadas1 + "");

                        i = i + 2;

                    } else if (jugador1[posicion] < jugador2[posicion]) {
                        // Descuento de Cartas
                        tiene2 = tiene2 - 5;
                        tiene1 = tiene1 - 5;
                        jTextField2.setText(tiene2 + "");
                        jTextField4.setText(tiene1 + "");

                        // Cartas Ganadas
                        ganadas2 = ganadas2 + 10;
                        jTextField3.setText(ganadas2 + "");
                        i = i + 2;

                    }
                }

            }
            jLabel7.setIcon(new ImageIcon(getClass().getResource("")));
            jLabel8.setIcon(new ImageIcon(getClass().getResource("")));
            i++;
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel1.setIcon(new ImageIcon(getClass().getResource("cartas/" + veinte1[i] + jugador1[i] + ".png")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("")));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Bienvenida fr = new Bienvenida();
        fr.setVisible(true);
        Guerra.this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guerra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guerra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guerra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guerra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guerra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
