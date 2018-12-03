
package ColorRoundButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  //notice javax
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class ColorRoundButtons extends javax.swing.JFrame {


    public ColorRoundButtons() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        totalPanel = new javax.swing.JPanel();
        initialColors = new javax.swing.JPanel();
        redButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        orangeButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        purpleButton = new javax.swing.JButton();
        guessButton = new javax.swing.JButton();
        resultDisplay = new javax.swing.JPanel();
        result1 = new javax.swing.JPanel();
        result3 = new javax.swing.JPanel();
        result2 = new javax.swing.JPanel();
        result8 = new javax.swing.JPanel();
        result4 = new javax.swing.JPanel();
        result7 = new javax.swing.JPanel();
        result6 = new javax.swing.JPanel();
        result5 = new javax.swing.JPanel();
        trialBoard = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        trial1 = new javax.swing.JPanel();
        blankButton1 = new javax.swing.JButton();
        blankButton2 = new javax.swing.JButton();
        blankButton3 = new javax.swing.JButton();
        blankButton4 = new javax.swing.JButton();
        trial2 = new javax.swing.JPanel();
        blankButton5 = new javax.swing.JButton();
        blankButton6 = new javax.swing.JButton();
        blankButton7 = new javax.swing.JButton();
        blankButton8 = new javax.swing.JButton();
        trial3 = new javax.swing.JPanel();
        blankButton9 = new javax.swing.JButton();
        blankButton10 = new javax.swing.JButton();
        blankButton11 = new javax.swing.JButton();
        blankButton12 = new javax.swing.JButton();
        trial4 = new javax.swing.JPanel();
        blankButton13 = new javax.swing.JButton();
        blankButton14 = new javax.swing.JButton();
        blankButton15 = new javax.swing.JButton();
        blankButton16 = new javax.swing.JButton();
        trial5 = new javax.swing.JPanel();
        blankButton17 = new javax.swing.JButton();
        blankButton18 = new javax.swing.JButton();
        blankButton19 = new javax.swing.JButton();
        blankButton20 = new javax.swing.JButton();
        trial6 = new javax.swing.JPanel();
        blankButton21 = new javax.swing.JButton();
        blankButton22 = new javax.swing.JButton();
        blankButton23 = new javax.swing.JButton();
        blankButton24 = new javax.swing.JButton();
        trial7 = new javax.swing.JPanel();
        blankButton25 = new javax.swing.JButton();
        blankButton26 = new javax.swing.JButton();
        blankButton27 = new javax.swing.JButton();
        blankButton28 = new javax.swing.JButton();
        trial8 = new javax.swing.JPanel();
        blankButton29 = new javax.swing.JButton();
        blankButton30 = new javax.swing.JButton();
        blankButton31 = new javax.swing.JButton();
        blankButton32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(385, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalPanel.setPreferredSize(new java.awt.Dimension(345, 500));

        initialColors.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        initialColors.setPreferredSize(new java.awt.Dimension(330, 40));

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        redButton.setPreferredSize(new java.awt.Dimension(23, 23));
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        blueButton.setPreferredSize(new java.awt.Dimension(23, 23));
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        greenButton.setBackground(new java.awt.Color(0, 204, 51));
        greenButton.setPreferredSize(new java.awt.Dimension(23, 23));
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        orangeButton.setBackground(new java.awt.Color(255, 102, 0));
        orangeButton.setPreferredSize(new java.awt.Dimension(23, 23));
        orangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        yellowButton.setBackground(new java.awt.Color(255, 255, 0));
        yellowButton.setPreferredSize(new java.awt.Dimension(23, 23));
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        purpleButton.setBackground(new java.awt.Color(204, 0, 204));
        purpleButton.setPreferredSize(new java.awt.Dimension(23, 23));
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        guessButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        guessButton.setText("OK");
        guessButton.setIconTextGap(1);
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout initialColorsLayout = new javax.swing.GroupLayout(initialColors);
        initialColors.setLayout(initialColorsLayout);
        initialColorsLayout.setHorizontalGroup(
            initialColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initialColorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(purpleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        initialColorsLayout.setVerticalGroup(
            initialColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initialColorsLayout.createSequentialGroup()
                .addGroup(initialColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(initialColorsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(initialColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yellowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(purpleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultDisplay.setPreferredSize(new java.awt.Dimension(40, 454));

        result1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result1.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result1Layout = new javax.swing.GroupLayout(result1);
        result1.setLayout(result1Layout);
        result1Layout.setHorizontalGroup(
            result1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result1Layout.setVerticalGroup(
            result1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result3.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result3Layout = new javax.swing.GroupLayout(result3);
        result3.setLayout(result3Layout);
        result3Layout.setHorizontalGroup(
            result3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result3Layout.setVerticalGroup(
            result3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result2.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result2Layout = new javax.swing.GroupLayout(result2);
        result2.setLayout(result2Layout);
        result2Layout.setHorizontalGroup(
            result2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result2Layout.setVerticalGroup(
            result2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result8.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result8Layout = new javax.swing.GroupLayout(result8);
        result8.setLayout(result8Layout);
        result8Layout.setHorizontalGroup(
            result8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result8Layout.setVerticalGroup(
            result8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result4.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result4Layout = new javax.swing.GroupLayout(result4);
        result4.setLayout(result4Layout);
        result4Layout.setHorizontalGroup(
            result4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result4Layout.setVerticalGroup(
            result4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result7.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result7Layout = new javax.swing.GroupLayout(result7);
        result7.setLayout(result7Layout);
        result7Layout.setHorizontalGroup(
            result7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result7Layout.setVerticalGroup(
            result7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result6.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result6Layout = new javax.swing.GroupLayout(result6);
        result6.setLayout(result6Layout);
        result6Layout.setHorizontalGroup(
            result6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result6Layout.setVerticalGroup(
            result6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        result5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        result5.setPreferredSize(new java.awt.Dimension(45, 34));

        javax.swing.GroupLayout result5Layout = new javax.swing.GroupLayout(result5);
        result5.setLayout(result5Layout);
        result5Layout.setHorizontalGroup(
            result5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        result5Layout.setVerticalGroup(
            result5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout resultDisplayLayout = new javax.swing.GroupLayout(resultDisplay);
        resultDisplay.setLayout(resultDisplayLayout);
        resultDisplayLayout.setHorizontalGroup(
            resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        resultDisplayLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {result1, result2, result3, result4, result5, result6, result7, result8});

        resultDisplayLayout.setVerticalGroup(
            resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayLayout.createSequentialGroup()
                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(result3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(result5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        resultDisplayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {result1, result2, result3, result4, result5, result6, result7, result8});

        trialBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trialBoard.setPreferredSize(new java.awt.Dimension(294, 443));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        trial1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial1.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton1.setBackground(new java.awt.Color(0, 0, 0));
        blankButton1.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton2.setBackground(new java.awt.Color(0, 0, 0));
        blankButton2.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton3.setBackground(new java.awt.Color(0, 0, 0));
        blankButton3.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton4.setBackground(new java.awt.Color(0, 0, 0));
        blankButton4.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial1Layout = new javax.swing.GroupLayout(trial1);
        trial1.setLayout(trial1Layout);
        trial1Layout.setHorizontalGroup(
            trial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial1Layout.setVerticalGroup(
            trial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial2.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton5.setBackground(new java.awt.Color(0, 0, 0));
        blankButton5.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton6.setBackground(new java.awt.Color(0, 0, 0));
        blankButton6.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton7.setBackground(new java.awt.Color(0, 0, 0));
        blankButton7.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton8.setBackground(new java.awt.Color(0, 0, 0));
        blankButton8.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial2Layout = new javax.swing.GroupLayout(trial2);
        trial2.setLayout(trial2Layout);
        trial2Layout.setHorizontalGroup(
            trial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial2Layout.setVerticalGroup(
            trial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial3.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton9.setBackground(new java.awt.Color(0, 0, 0));
        blankButton9.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton10.setBackground(new java.awt.Color(0, 0, 0));
        blankButton10.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton11.setBackground(new java.awt.Color(0, 0, 0));
        blankButton11.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton12.setBackground(new java.awt.Color(0, 0, 0));
        blankButton12.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial3Layout = new javax.swing.GroupLayout(trial3);
        trial3.setLayout(trial3Layout);
        trial3Layout.setHorizontalGroup(
            trial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial3Layout.setVerticalGroup(
            trial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial4.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton13.setBackground(new java.awt.Color(0, 0, 0));
        blankButton13.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton14.setBackground(new java.awt.Color(0, 0, 0));
        blankButton14.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton15.setBackground(new java.awt.Color(0, 0, 0));
        blankButton15.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton16.setBackground(new java.awt.Color(0, 0, 0));
        blankButton16.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial4Layout = new javax.swing.GroupLayout(trial4);
        trial4.setLayout(trial4Layout);
        trial4Layout.setHorizontalGroup(
            trial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial4Layout.setVerticalGroup(
            trial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial5.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton17.setBackground(new java.awt.Color(0, 0, 0));
        blankButton17.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton18.setBackground(new java.awt.Color(0, 0, 0));
        blankButton18.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton19.setBackground(new java.awt.Color(0, 0, 0));
        blankButton19.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton20.setBackground(new java.awt.Color(0, 0, 0));
        blankButton20.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial5Layout = new javax.swing.GroupLayout(trial5);
        trial5.setLayout(trial5Layout);
        trial5Layout.setHorizontalGroup(
            trial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial5Layout.setVerticalGroup(
            trial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial6.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton21.setBackground(new java.awt.Color(0, 0, 0));
        blankButton21.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton22.setBackground(new java.awt.Color(0, 0, 0));
        blankButton22.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton23.setBackground(new java.awt.Color(0, 0, 0));
        blankButton23.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton24.setBackground(new java.awt.Color(0, 0, 0));
        blankButton24.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial6Layout = new javax.swing.GroupLayout(trial6);
        trial6.setLayout(trial6Layout);
        trial6Layout.setHorizontalGroup(
            trial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial6Layout.setVerticalGroup(
            trial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial7.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton25.setBackground(new java.awt.Color(0, 0, 0));
        blankButton25.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton26.setBackground(new java.awt.Color(0, 0, 0));
        blankButton26.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton27.setBackground(new java.awt.Color(0, 0, 0));
        blankButton27.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton28.setBackground(new java.awt.Color(0, 0, 0));
        blankButton28.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial7Layout = new javax.swing.GroupLayout(trial7);
        trial7.setLayout(trial7Layout);
        trial7Layout.setHorizontalGroup(
            trial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial7Layout.setVerticalGroup(
            trial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trial8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trial8.setPreferredSize(new java.awt.Dimension(199, 46));

        blankButton29.setBackground(new java.awt.Color(0, 0, 0));
        blankButton29.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton30.setBackground(new java.awt.Color(0, 0, 0));
        blankButton30.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton31.setBackground(new java.awt.Color(0, 0, 0));
        blankButton31.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        blankButton32.setBackground(new java.awt.Color(0, 0, 0));
        blankButton32.setPreferredSize(new java.awt.Dimension(23, 23));
        blankButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blankButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout trial8Layout = new javax.swing.GroupLayout(trial8);
        trial8.setLayout(trial8Layout);
        trial8Layout.setHorizontalGroup(
            trial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(blankButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blankButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        trial8Layout.setVerticalGroup(
            trial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trial8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout trialBoardLayout = new javax.swing.GroupLayout(trialBoard);
        trialBoard.setLayout(trialBoardLayout);
        trialBoardLayout.setHorizontalGroup(
            trialBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trialBoardLayout.createSequentialGroup()
                .addGroup(trialBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trialBoardLayout.createSequentialGroup()
                        .addComponent(trial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(trial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        trialBoardLayout.setVerticalGroup(
            trialBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trialBoardLayout.createSequentialGroup()
                .addComponent(trial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(trialBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trial5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(trial6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trial7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout totalPanelLayout = new javax.swing.GroupLayout(totalPanel);
        totalPanel.setLayout(totalPanelLayout);
        totalPanelLayout.setHorizontalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(initialColors, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPanelLayout.createSequentialGroup()
                        .addComponent(trialBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        totalPanelLayout.setVerticalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPanelLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trialBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(resultDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initialColors, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(totalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 270, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        blankButtons[0] = blankButton1;
        blankButtons[1] = blankButton2;
        blankButtons[2] = blankButton3;
        blankButtons[3] = blankButton4;
        blankButtons[4] = blankButton5;
        blankButtons[5] = blankButton6;
        blankButtons[6] = blankButton7;
        blankButtons[7] = blankButton8;
        blankButtons[8] = blankButton9;
        blankButtons[9] = blankButton10;
        blankButtons[10] = blankButton11;
        blankButtons[11] = blankButton12;
        blankButtons[12] = blankButton13;
        blankButtons[13] = blankButton14;
        blankButtons[14] = blankButton15;
        blankButtons[15] = blankButton16;
        blankButtons[16] = blankButton17;
        blankButtons[17] = blankButton18;
        blankButtons[18] = blankButton19;
        blankButtons[19] = blankButton20;
        blankButtons[20] = blankButton21;
        blankButtons[21] = blankButton22;
        blankButtons[22] = blankButton23;
        blankButtons[23] = blankButton24;
        blankButtons[24] = blankButton25;
        blankButtons[25] = blankButton26;
        blankButtons[26] = blankButton27;
        blankButtons[27] = blankButton28;
        blankButtons[28] = blankButton29;
        blankButtons[29] = blankButton30;
        blankButtons[30] = blankButton31;
        blankButtons[31] = blankButton32;
        
        //while(finishedGuessing == false){
        for(int i = 0; i < blankButtons.length; i++){ 
            if(blankButtons[i].getBackground().equals(Color.BLACK)){
                if(evt.getSource() == redButton  ){
                    blankButtons[i].setBackground(redButton.getBackground());
                    break;
                }
                else if(evt.getSource() == blueButton){
                    blankButtons[i].setBackground(blueButton.getBackground());
                    break;
                }
                else if(evt.getSource() == greenButton){
                    blankButtons[i].setBackground(greenButton.getBackground());
                    break;
                }
                else if(evt.getSource() == orangeButton){
                    blankButtons[i].setBackground(orangeButton.getBackground());
                    break;
                }
                else if(evt.getSource() == yellowButton){
                    blankButtons[i].setBackground(yellowButton.getBackground());
                    break;
                }
                else if(evt.getSource() == purpleButton){
                    blankButtons[i].setBackground(purpleButton.getBackground());
                    break;
                }
                else if(evt.getSource() == blankButton1){
                    if(evt.getSource() == redButton){
                        blankButton1.setBackground(redButton.getBackground());
                    }
                }
            }
        }
               // i++;
    }//GEN-LAST:event_colorButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        if(evt.getSource() == guessButton){
            finishedGuessing = true;
            blankButton32.setBackground(redButton.getBackground());
        }
        finishedGuessing = false;
        if(finishedGuessing == false)
            blankButton31.setBackground(blueButton.getBackground());
    }//GEN-LAST:event_guessButtonActionPerformed

    private void blankButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blankButtonMouseClicked
        if (evt.getClickCount() == 2) {
            if(evt.getSource() == blankButton1)
                blankButton1.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton2)
                blankButton2.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton3)
                blankButton3.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton4)
                blankButton4.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton5)
                blankButton5.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton6)
                blankButton6.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton7)
                blankButton7.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton8)
                blankButton8.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton9)
                blankButton9.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton10)
                blankButton10.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton11)
                blankButton11.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton12)
                blankButton12.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton13)
                blankButton13.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton14)
                blankButton14.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton15)
                blankButton15.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton16)
                blankButton16.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton17)
                blankButton17.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton18)
                blankButton18.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton19)
                blankButton19.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton20)
                blankButton20.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton21)
                blankButton21.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton22)
                blankButton22.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton23)
                blankButton23.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton24)
                blankButton24.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton25)
                blankButton25.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton26)
                blankButton26.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton27)
                blankButton27.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton28)
                blankButton28.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton29)
                blankButton29.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton30)
                blankButton30.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton31)
                blankButton31.setBackground(Color.BLACK);
            else if(evt.getSource() == blankButton32)
                blankButton32.setBackground(Color.BLACK);
            
            
        }
        
    }//GEN-LAST:event_blankButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ColorRoundButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorRoundButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorRoundButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorRoundButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorRoundButtons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton blankButton1;
    private javax.swing.JButton blankButton10;
    private javax.swing.JButton blankButton11;
    private javax.swing.JButton blankButton12;
    private javax.swing.JButton blankButton13;
    private javax.swing.JButton blankButton14;
    private javax.swing.JButton blankButton15;
    private javax.swing.JButton blankButton16;
    private javax.swing.JButton blankButton17;
    private javax.swing.JButton blankButton18;
    private javax.swing.JButton blankButton19;
    public javax.swing.JButton blankButton2;
    private javax.swing.JButton blankButton20;
    private javax.swing.JButton blankButton21;
    private javax.swing.JButton blankButton22;
    private javax.swing.JButton blankButton23;
    private javax.swing.JButton blankButton24;
    private javax.swing.JButton blankButton25;
    private javax.swing.JButton blankButton26;
    private javax.swing.JButton blankButton27;
    private javax.swing.JButton blankButton28;
    private javax.swing.JButton blankButton29;
    public javax.swing.JButton blankButton3;
    private javax.swing.JButton blankButton30;
    private javax.swing.JButton blankButton31;
    private javax.swing.JButton blankButton32;
    public javax.swing.JButton blankButton4;
    private javax.swing.JButton blankButton5;
    private javax.swing.JButton blankButton6;
    private javax.swing.JButton blankButton7;
    private javax.swing.JButton blankButton8;
    private javax.swing.JButton blankButton9;
    public javax.swing.JButton blueButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JPanel initialColors;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JButton orangeButton;
    private javax.swing.JButton purpleButton;
    public javax.swing.JButton redButton;
    private javax.swing.JPanel result1;
    private javax.swing.JPanel result2;
    private javax.swing.JPanel result3;
    private javax.swing.JPanel result4;
    private javax.swing.JPanel result5;
    private javax.swing.JPanel result6;
    private javax.swing.JPanel result7;
    private javax.swing.JPanel result8;
    private javax.swing.JPanel resultDisplay;
    private javax.swing.JPanel totalPanel;
    private javax.swing.JPanel trial1;
    private javax.swing.JPanel trial2;
    private javax.swing.JPanel trial3;
    private javax.swing.JPanel trial4;
    private javax.swing.JPanel trial5;
    private javax.swing.JPanel trial6;
    private javax.swing.JPanel trial7;
    private javax.swing.JPanel trial8;
    private javax.swing.JPanel trialBoard;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
        private JButton[] blankButtons = new JButton[32];
        boolean finishedGuessing = false;
        int i = 0;

}
