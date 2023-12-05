/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import espacial.OperacionesBasicas;
import bufferedimage.HerramientasImagen;
import espacial.Convolucion2;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Kira
 */
public class JFrameConvolucion extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConvolucion
     */
    Image img;
    int v0  = 0, v1  = 0, v2  = 0, v3  = 0, v4  = 0;
    int v5  = 0, v6  = 0, v7  = 0, v8  = 0, v9  = 0;
    int v10 = 0, v11 = 0, v12 = 1, v13 = 0, v14 = 0;
    int v15 = 0, v16 = 0, v17 = 0, v18 = 0, v19 = 0;
    int v20 = 0, v21 = 0, v22 = 0, v23 = 0, v24 = 0;
    int div = 1;
    
    private void modificar(){
        Convolucion2 convo = new Convolucion2(HerramientasImagen.toBufferedImage(img));
        int[] mascara = new int[]{v6,v7,v8,v11,v12,v13,v16,v17,v18};
        if(div == 0){
            div = -1;
            this.boxDiv.setValue(div);
        }
        Image convolucionada = convo.convolucionar(mascara, div);
        ImageIcon img3 = new ImageIcon(convolucionada.getScaledInstance(this.jLabel1.getWidth(), 
                this.jLabel1.getHeight(), Image.SCALE_SMOOTH));
        this.jLabel1.setIcon(img3);
    }
    
    public JFrameConvolucion(Image imagen) {
        initComponents();
        this.img = imagen;
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(this.jLabel1.getWidth(), 
                this.jLabel1.getHeight(), Image.SCALE_SMOOTH));
        this.jLabel2.setIcon(img2);
        this.box0.setValue(v0);
        this.box1.setValue(v1);
        this.box2.setValue(v2);
        this.box3.setValue(v3);
        this.box4.setValue(v4);
        this.box5.setValue(v5);
        this.box6.setValue(v6);
        this.box7.setValue(v7);
        this.box8.setValue(v8);
        this.box9.setValue(v9);
        this.box10.setValue(v10);
        this.box11.setValue(v11);
        this.box12.setValue(v12);
        this.box13.setValue(v13);
        this.box14.setValue(v14);
        this.box15.setValue(v15);
        this.box16.setValue(v16);
        this.box17.setValue(v17);
        this.box18.setValue(v18);
        this.box19.setValue(v19);
        this.box20.setValue(v20);
        this.box21.setValue(v21);
        this.box22.setValue(v22);
        this.box23.setValue(v23);
        this.box24.setValue(v24);
        this.boxDiv.setValue(div);
        modificar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        box4 = new javax.swing.JSpinner();
        box22 = new javax.swing.JSpinner();
        box1 = new javax.swing.JSpinner();
        box15 = new javax.swing.JSpinner();
        box19 = new javax.swing.JSpinner();
        box8 = new javax.swing.JSpinner();
        box24 = new javax.swing.JSpinner();
        box20 = new javax.swing.JSpinner();
        box12 = new javax.swing.JSpinner();
        box10 = new javax.swing.JSpinner();
        box5 = new javax.swing.JSpinner();
        box23 = new javax.swing.JSpinner();
        box0 = new javax.swing.JSpinner();
        box18 = new javax.swing.JSpinner();
        box3 = new javax.swing.JSpinner();
        box16 = new javax.swing.JSpinner();
        box14 = new javax.swing.JSpinner();
        box21 = new javax.swing.JSpinner();
        box17 = new javax.swing.JSpinner();
        box2 = new javax.swing.JSpinner();
        box13 = new javax.swing.JSpinner();
        box9 = new javax.swing.JSpinner();
        box11 = new javax.swing.JSpinner();
        box6 = new javax.swing.JSpinner();
        box7 = new javax.swing.JSpinner();
        boxDiv = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convolucion");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(810, 750));
        setMinimumSize(new java.awt.Dimension(810, 750));
        setPreferredSize(new java.awt.Dimension(810, 750));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 300));

        jLabel2.setMaximumSize(new java.awt.Dimension(400, 334));
        jLabel2.setMinimumSize(new java.awt.Dimension(400, 334));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 334));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 334));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Mascara");

        box4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box4StateChanged(evt);
            }
        });

        box22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box22StateChanged(evt);
            }
        });

        box1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box1StateChanged(evt);
            }
        });

        box15.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box15StateChanged(evt);
            }
        });

        box19.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box19StateChanged(evt);
            }
        });

        box8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box8StateChanged(evt);
            }
        });

        box24.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box24StateChanged(evt);
            }
        });

        box20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box20StateChanged(evt);
            }
        });

        box12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box12StateChanged(evt);
            }
        });

        box10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box10StateChanged(evt);
            }
        });

        box5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box5StateChanged(evt);
            }
        });

        box23.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box23StateChanged(evt);
            }
        });

        box0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box0StateChanged(evt);
            }
        });
        box0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box0KeyTyped(evt);
            }
        });

        box18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box18StateChanged(evt);
            }
        });

        box3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box3StateChanged(evt);
            }
        });

        box16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box16StateChanged(evt);
            }
        });

        box14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box14StateChanged(evt);
            }
        });

        box21.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box21StateChanged(evt);
            }
        });

        box17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box17StateChanged(evt);
            }
        });

        box2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box2StateChanged(evt);
            }
        });

        box13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box13StateChanged(evt);
            }
        });

        box9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box9StateChanged(evt);
            }
        });

        box11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box11StateChanged(evt);
            }
        });

        box6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box6StateChanged(evt);
            }
        });

        box7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box7StateChanged(evt);
            }
        });

        boxDiv.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boxDivStateChanged(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Divisor");

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(139, 139, 139)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(box0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(boxDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box0KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_box0KeyTyped

    private void box0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box0StateChanged
        v0 = (int) this.box0.getValue();
        //modificar();
    }//GEN-LAST:event_box0StateChanged

    private void box1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box1StateChanged
        v1 = (int) this.box1.getValue();
        //modificar();
    }//GEN-LAST:event_box1StateChanged

    private void box2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box2StateChanged
        v2 = (int) this.box2.getValue();
        //modificar();
    }//GEN-LAST:event_box2StateChanged

    private void box3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box3StateChanged
        v3 = (int) this.box3.getValue();
        //modificar();
    }//GEN-LAST:event_box3StateChanged

    private void box4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box4StateChanged
        v4 = (int) this.box4.getValue();
        //modificar();
    }//GEN-LAST:event_box4StateChanged

    private void box5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box5StateChanged
        v5 = (int) this.box5.getValue();
        //modificar();
    }//GEN-LAST:event_box5StateChanged

    private void box6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box6StateChanged
        v6 = (int) this.box6.getValue();
        //modificar();
    }//GEN-LAST:event_box6StateChanged

    private void box7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box7StateChanged
        v7 = (int) this.box7.getValue();
        //modificar();
    }//GEN-LAST:event_box7StateChanged

    private void box8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box8StateChanged
        v8 = (int) this.box8.getValue();
        //modificar();
    }//GEN-LAST:event_box8StateChanged

    private void box9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box9StateChanged
        v9 = (int) this.box9.getValue();
        //modificar();
    }//GEN-LAST:event_box9StateChanged

    private void box10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box10StateChanged
        v10 = (int) this.box10.getValue();
        //modificar();
    }//GEN-LAST:event_box10StateChanged

    private void box11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box11StateChanged
        v11 = (int) this.box11.getValue();
        //modificar();
    }//GEN-LAST:event_box11StateChanged

    private void box12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box12StateChanged
        v12 = (int) this.box12.getValue();
        //modificar();
    }//GEN-LAST:event_box12StateChanged

    private void box13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box13StateChanged
        v13 = (int) this.box13.getValue();
        //modificar();
    }//GEN-LAST:event_box13StateChanged

    private void box14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box14StateChanged
        v14 = (int) this.box14.getValue();
        //modificar();
    }//GEN-LAST:event_box14StateChanged

    private void box15StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box15StateChanged
        v15 = (int) this.box15.getValue();
        //modificar();
    }//GEN-LAST:event_box15StateChanged

    private void box16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box16StateChanged
        v16 = (int) this.box16.getValue();
        //modificar();
    }//GEN-LAST:event_box16StateChanged

    private void box17StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box17StateChanged
        v17 = (int) this.box17.getValue();
        //modificar();
    }//GEN-LAST:event_box17StateChanged

    private void box18StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box18StateChanged
        v18 = (int) this.box18.getValue();
        //modificar();
    }//GEN-LAST:event_box18StateChanged

    private void box19StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box19StateChanged
        v19 = (int) this.box19.getValue();
        //modificar();
    }//GEN-LAST:event_box19StateChanged

    private void box20StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box20StateChanged
        v20 = (int) this.box20.getValue();
        //modificar();
    }//GEN-LAST:event_box20StateChanged

    private void box21StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box21StateChanged
        v21 = (int) this.box21.getValue();
        //modificar();
    }//GEN-LAST:event_box21StateChanged

    private void box22StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box22StateChanged
        v22 = (int) this.box22.getValue();
        //modificar();
    }//GEN-LAST:event_box22StateChanged

    private void box23StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box23StateChanged
        v23 = (int) this.box23.getValue();
        //modificar();
    }//GEN-LAST:event_box23StateChanged

    private void box24StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box24StateChanged
        v24 = (int) this.box24.getValue();
        //modificar();
    }//GEN-LAST:event_box24StateChanged

    private void boxDivStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boxDivStateChanged
        div = (int) this.boxDiv.getValue();
        //modificar();
    }//GEN-LAST:event_boxDivStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        v0 = (int) this.box0.getValue();
        v1 = (int) this.box1.getValue();
        v2 = (int) this.box2.getValue();
        v3 = (int) this.box3.getValue();
        v4 = (int) this.box4.getValue();
        v5 = (int) this.box5.getValue();
        v6 = (int) this.box6.getValue();
        v7 = (int) this.box7.getValue();
        v8 = (int) this.box8.getValue();
        v9 = (int) this.box9.getValue();
        v10 = (int) this.box10.getValue();
        v11 = (int) this.box11.getValue();
        v12 = (int) this.box12.getValue();
        v13 = (int) this.box13.getValue();
        v14 = (int) this.box14.getValue();
        v15 = (int) this.box15.getValue();
        v16 = (int) this.box16.getValue();
        v17 = (int) this.box17.getValue();
        v18 = (int) this.box18.getValue();
        v19 = (int) this.box19.getValue();
        v20 = (int) this.box20.getValue();
        v21 = (int) this.box21.getValue();
        v22 = (int) this.box22.getValue();
        v23 = (int) this.box23.getValue();
        v24 = (int) this.box24.getValue();
        div = (int) this.boxDiv.getValue();
        modificar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Image imagen = bufferedimage.HerramientasImagen.abrirImagen();
                new JFrameConvolucion(imagen).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner box0;
    private javax.swing.JSpinner box1;
    private javax.swing.JSpinner box10;
    private javax.swing.JSpinner box11;
    private javax.swing.JSpinner box12;
    private javax.swing.JSpinner box13;
    private javax.swing.JSpinner box14;
    private javax.swing.JSpinner box15;
    private javax.swing.JSpinner box16;
    private javax.swing.JSpinner box17;
    private javax.swing.JSpinner box18;
    private javax.swing.JSpinner box19;
    private javax.swing.JSpinner box2;
    private javax.swing.JSpinner box20;
    private javax.swing.JSpinner box21;
    private javax.swing.JSpinner box22;
    private javax.swing.JSpinner box23;
    private javax.swing.JSpinner box24;
    private javax.swing.JSpinner box3;
    private javax.swing.JSpinner box4;
    private javax.swing.JSpinner box5;
    private javax.swing.JSpinner box6;
    private javax.swing.JSpinner box7;
    private javax.swing.JSpinner box8;
    private javax.swing.JSpinner box9;
    private javax.swing.JSpinner boxDiv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
