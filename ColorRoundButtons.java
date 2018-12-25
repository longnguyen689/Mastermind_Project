
package ColorRoundButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  //notice javax
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.util.Random;

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
        resultButton1 = new javax.swing.JButton();
        resultButton2 = new javax.swing.JButton();
        resultButton3 = new javax.swing.JButton();
        resultButton4 = new javax.swing.JButton();
        resultButton5 = new javax.swing.JButton();
        resultButton6 = new javax.swing.JButton();
        resultButton7 = new javax.swing.JButton();
        resultButton8 = new javax.swing.JButton();
        resultButton9 = new javax.swing.JButton();
        resultButton10 = new javax.swing.JButton();
        resultButton11 = new javax.swing.JButton();
        resultButton12 = new javax.swing.JButton();
        resultButton13 = new javax.swing.JButton();
        resultButton14 = new javax.swing.JButton();
        resultButton15 = new javax.swing.JButton();
        resultButton16 = new javax.swing.JButton();
        resultButton17 = new javax.swing.JButton();
        resultButton18 = new javax.swing.JButton();
        resultButton19 = new javax.swing.JButton();
        resultButton20 = new javax.swing.JButton();
        resultButton21 = new javax.swing.JButton();
        resultButton22 = new javax.swing.JButton();
        resultButton23 = new javax.swing.JButton();
        resultButton24 = new javax.swing.JButton();
        resultButton25 = new javax.swing.JButton();
        resultButton26 = new javax.swing.JButton();
        resultButton27 = new javax.swing.JButton();
        resultButton28 = new javax.swing.JButton();
        resultButton29 = new javax.swing.JButton();
        resultButton30 = new javax.swing.JButton();
        resultButton31 = new javax.swing.JButton();
        resultButton32 = new javax.swing.JButton();
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
        hiddenColor1 = new javax.swing.JButton();
        hiddenColor2 = new javax.swing.JButton();
        hiddenColor3 = new javax.swing.JButton();
        hiddenColor4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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

        resultButton1.setBackground(new java.awt.Color(102, 102, 102));

        resultButton2.setBackground(new java.awt.Color(102, 102, 102));

        resultButton3.setBackground(new java.awt.Color(102, 102, 102));

        resultButton4.setBackground(new java.awt.Color(102, 102, 102));

        resultButton5.setBackground(new java.awt.Color(102, 102, 102));

        resultButton6.setBackground(new java.awt.Color(102, 102, 102));

        resultButton7.setBackground(new java.awt.Color(102, 102, 102));

        resultButton8.setBackground(new java.awt.Color(102, 102, 102));

        resultButton9.setBackground(new java.awt.Color(102, 102, 102));

        resultButton10.setBackground(new java.awt.Color(102, 102, 102));

        resultButton11.setBackground(new java.awt.Color(102, 102, 102));

        resultButton12.setBackground(new java.awt.Color(102, 102, 102));

        resultButton13.setBackground(new java.awt.Color(102, 102, 102));

        resultButton14.setBackground(new java.awt.Color(102, 102, 102));

        resultButton15.setBackground(new java.awt.Color(102, 102, 102));

        resultButton16.setBackground(new java.awt.Color(102, 102, 102));

        resultButton17.setBackground(new java.awt.Color(102, 102, 102));

        resultButton18.setBackground(new java.awt.Color(102, 102, 102));

        resultButton19.setBackground(new java.awt.Color(102, 102, 102));

        resultButton20.setBackground(new java.awt.Color(102, 102, 102));

        resultButton21.setBackground(new java.awt.Color(102, 102, 102));

        resultButton22.setBackground(new java.awt.Color(102, 102, 102));

        resultButton23.setBackground(new java.awt.Color(102, 102, 102));

        resultButton24.setBackground(new java.awt.Color(102, 102, 102));

        resultButton25.setBackground(new java.awt.Color(102, 102, 102));

        resultButton26.setBackground(new java.awt.Color(102, 102, 102));

        resultButton27.setBackground(new java.awt.Color(102, 102, 102));

        resultButton28.setBackground(new java.awt.Color(102, 102, 102));

        resultButton29.setBackground(new java.awt.Color(102, 102, 102));

        resultButton30.setBackground(new java.awt.Color(102, 102, 102));

        resultButton31.setBackground(new java.awt.Color(102, 102, 102));

        resultButton32.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout resultDisplayLayout = new javax.swing.GroupLayout(resultDisplay);
        resultDisplay.setLayout(resultDisplayLayout);
        resultDisplayLayout.setHorizontalGroup(
            resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultDisplayLayout.createSequentialGroup()
                        .addComponent(resultButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultDisplayLayout.setVerticalGroup(
            resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addGap(0, 0, 0)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(initialColors, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalPanelLayout.createSequentialGroup()
                        .addComponent(trialBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        hiddenColor1.setBackground(new java.awt.Color(255, 0, 0));
        hiddenColor1.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(hiddenColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        hiddenColor2.setBackground(new java.awt.Color(0, 0, 255));
        hiddenColor2.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(hiddenColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        hiddenColor3.setBackground(new java.awt.Color(255, 0, 0));
        hiddenColor3.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(hiddenColor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        hiddenColor4.setBackground(new java.awt.Color(0, 0, 255));
        hiddenColor4.setPreferredSize(new java.awt.Dimension(23, 23));
        getContentPane().add(hiddenColor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        /*this method checks from left to right for any blank/black button
        *and fill it with any color clicked*/
        switch(numOfGuess){ 
            case 1:
                blankButtons[0] = blankButton1; blankButtons[1] = blankButton2;
                blankButtons[2] = blankButton3; blankButtons[3] = blankButton4;
                break;
            case 2:
                blankButtons[0] = blankButton5; blankButtons[1] = blankButton6;
                blankButtons[2] = blankButton7; blankButtons[3] = blankButton8;
                break;
            case 3:
                blankButtons[0] = blankButton9; blankButtons[1] = blankButton10;
                blankButtons[2] = blankButton11; blankButtons[3] = blankButton12;
                break;
            case 4:
                blankButtons[0] = blankButton13; blankButtons[1] = blankButton14;
                blankButtons[2] = blankButton15; blankButtons[3] = blankButton16;
                break;
            case 5:
                blankButtons[0] = blankButton17; blankButtons[1] = blankButton18;
                blankButtons[2] = blankButton19; blankButtons[3] = blankButton20;
                break;
            case 6:
                blankButtons[0] = blankButton21; blankButtons[1] = blankButton22;
                blankButtons[2] = blankButton23; blankButtons[3] = blankButton24;
                break;
            case 7:
                blankButtons[0] = blankButton25; blankButtons[1] = blankButton26;
                blankButtons[2] = blankButton27; blankButtons[3] = blankButton28;
                break;
            case 8:
                blankButtons[0] = blankButton29; blankButtons[1] = blankButton30;
                blankButtons[2] = blankButton31; blankButtons[3] = blankButton32;  
                break;
            default:
                break;
        }
        //need a loop to fill the row from left to right
        //if there's any unfilled button in the middle, fill it
        for(int index = 0; index < 4; index++){ 
            if(blankButtons[index].getBackground().equals(Color.BLACK)){
                if(evt.getSource() == redButton  ){
                    blankButtons[index].setBackground(redButton.getBackground());
                    break;
                }
                else if(evt.getSource() == blueButton){
                    blankButtons[index].setBackground(blueButton.getBackground());
                    break;
                }
                else if(evt.getSource() == greenButton){
                    blankButtons[index].setBackground(greenButton.getBackground());
                    break;
                }
                else if(evt.getSource() == orangeButton){
                    blankButtons[index].setBackground(orangeButton.getBackground());
                    break;
                }
                else if(evt.getSource() == yellowButton){
                    blankButtons[index].setBackground(yellowButton.getBackground());
                    break;
                }
                else if(evt.getSource() == purpleButton){
                    blankButtons[index].setBackground(purpleButton.getBackground());
                    break;
                }     
            }
        }
        if( numOfGuess == 1 &&
            !blankButton1.getBackground().equals(Color.BLACK) &&
            !blankButton2.getBackground().equals(Color.BLACK) &&
            !blankButton3.getBackground().equals(Color.BLACK) &&
            !blankButton4.getBackground().equals(Color.BLACK)){
                guessButton.setEnabled(true);
                redButton.setEnabled(false); blueButton.setEnabled(false);
                greenButton.setEnabled(false); yellowButton.setEnabled(false);
                orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }                
        else if(numOfGuess ==2 &&
        !blankButton5.getBackground().equals(Color.BLACK) &&
        !blankButton6.getBackground().equals(Color.BLACK) &&
        !blankButton7.getBackground().equals(Color.BLACK) &&
        !blankButton8.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);            
        }
        else if(numOfGuess == 3 &&
        !blankButton9.getBackground().equals(Color.BLACK) &&
        !blankButton10.getBackground().equals(Color.BLACK) &&
        !blankButton11.getBackground().equals(Color.BLACK) &&
        !blankButton12.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }
        else if(numOfGuess == 4 &&
        !blankButton13.getBackground().equals(Color.BLACK) &&
        !blankButton14.getBackground().equals(Color.BLACK) &&
        !blankButton15.getBackground().equals(Color.BLACK) &&
        !blankButton16.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }
        else if(numOfGuess == 5 &&
        !blankButton17.getBackground().equals(Color.BLACK) &&
        !blankButton18.getBackground().equals(Color.BLACK) &&
        !blankButton19.getBackground().equals(Color.BLACK) &&
        !blankButton20.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }
        else if(numOfGuess == 6 &&
        !blankButton21.getBackground().equals(Color.BLACK) &&
        !blankButton22.getBackground().equals(Color.BLACK) &&
        !blankButton23.getBackground().equals(Color.BLACK) &&
        !blankButton24.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }
        else if(numOfGuess == 7 &&
        !blankButton25.getBackground().equals(Color.BLACK) &&
        !blankButton26.getBackground().equals(Color.BLACK) &&
        !blankButton27.getBackground().equals(Color.BLACK) &&
        !blankButton28.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }
        else if(numOfGuess == 8 &&
        !blankButton29.getBackground().equals(Color.BLACK) &&
        !blankButton30.getBackground().equals(Color.BLACK) &&
        !blankButton31.getBackground().equals(Color.BLACK) &&
        !blankButton32.getBackground().equals(Color.BLACK)){
            guessButton.setEnabled(true);
            redButton.setEnabled(false); blueButton.setEnabled(false);
            greenButton.setEnabled(false); yellowButton.setEnabled(false);
            orangeButton.setEnabled(false); purpleButton.setEnabled(false);
        }       
    }//GEN-LAST:event_colorButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        guessButton.setEnabled(false); //after the OK button is pressed, reset its state to false
        redButton.setEnabled(true); blueButton.setEnabled(true);
        greenButton.setEnabled(true); yellowButton.setEnabled(true);
        orangeButton.setEnabled(true); purpleButton.setEnabled(true);
        
        JButton temp[] = new JButton[4]; //this array acts as an intermediate, re-use purposes
        
        /*there are 32 blankButtons and 32 resultButtons.
        * Divide them into each case where a case is the nth trial*/
        switch (numOfGuess) {
            case 1:
                temp[0] = blankButton1; temp[1] = blankButton2;
                temp[2] = blankButton3; temp[3] = blankButton4;
                
                resultButtons[0] = resultButton1; resultButtons[1] = resultButton2;
                resultButtons[2] = resultButton3; resultButtons[3] = resultButton4;                
                break;
            case 2:
                temp[0] = blankButton5; temp[1] = blankButton6;
                temp[2] = blankButton7; temp[3] = blankButton8;
                
                resultButtons[0] = resultButton5; resultButtons[1] = resultButton6;
                resultButtons[2] = resultButton7; resultButtons[3] = resultButton8;                
                break;
            case 3:
                temp[0] = blankButton9; temp[1] = blankButton10;
                temp[2] = blankButton11; temp[3] = blankButton12;
                
                resultButtons[0] = resultButton9; resultButtons[1] = resultButton10;
                resultButtons[2] = resultButton11; resultButtons[3] = resultButton12;
                break;
            case 4:
                temp[0] = blankButton13; temp[1] = blankButton14;
                temp[2] = blankButton15; temp[3] = blankButton16;
                
                resultButtons[0] = resultButton13; resultButtons[1] = resultButton14;
                resultButtons[2] = resultButton15; resultButtons[3] = resultButton16;      
                break;
            case 5:
                temp[0] = blankButton17; temp[1] = blankButton18;
                temp[2] = blankButton19; temp[3] = blankButton20;
                
                resultButtons[0] = resultButton17; resultButtons[1] = resultButton18;
                resultButtons[2] = resultButton19; resultButtons[3] = resultButton20;      
                break;  
            case 6:
                temp[0] = blankButton21; temp[1] = blankButton22;
                temp[2] = blankButton23; temp[3] = blankButton24;
                
                resultButtons[0] = resultButton21; resultButtons[1] = resultButton22;
                resultButtons[2] = resultButton23; resultButtons[3] = resultButton24;      
                break;
            case 7:
                temp[0] = blankButton25; temp[1] = blankButton26;
                temp[2] = blankButton27; temp[3] = blankButton28;
                
                resultButtons[0] = resultButton25; resultButtons[1] = resultButton26;
                resultButtons[2] = resultButton27; resultButtons[3] = resultButton28;      
                break;
            case 8:
                temp[0] = blankButton29; temp[1] = blankButton30;
                temp[2] = blankButton31; temp[3] = blankButton32;
                
                resultButtons[0] = resultButton29; resultButtons[1] = resultButton30;
                resultButtons[2] = resultButton31; resultButtons[3] = resultButton32;      
                break;
            default:
                break;
        }        
        numOfGuess++; //this number keeps track of the nth trial and acts as a condition
        
        //check
        JButton[] inputCopy = new JButton[4];
        JButton[] hiddenCopy = new JButton[4]; //empty array, need to put some buttons in
        //need to create temp buttons so that we can setBackground to these
        //buttons instead of copying the buttons from the hiddenColor[]
        hiddenCopy[0] = new JButton("");
        hiddenCopy[1] = new JButton("");
        hiddenCopy[2] = new JButton("");
        hiddenCopy[3] = new JButton("");
        
        //CHECK POSITION AND COLOR - BLACK
        int black = 0, white = 0, i = 0, j = 0;
        for(i = 0; i < 4; i++){
            if( temp[i].getBackground().equals(hiddenColor[i].getBackground()) )
            {
                black++; //count number of matching color and position
            }
            else{ //not black then save to an other arr for check color
                inputCopy[j] = temp[i];
                hiddenCopy[j].setBackground(hiddenColor[i].getBackground());
                j++; 
            }
        }
        //CHECK FOR MATCHING COLOR - WHITE
        for(i = 0; i < 4 - black; i++){
            for(j = 0; j < 4 - black; j++){
                if(inputCopy[i].getBackground().equals(hiddenCopy[j].getBackground())){
                    white++;//count number of matching color, exclude the one that already mark as black
                    hiddenCopy[j].setBackground(Color.CYAN); //mark off by using another color
                    break;
                }
            }
        }
        //FILL RESULT
        int pos = 0;
        for(i = 0; i < black; i++){
            resultButtons[pos++].setBackground(Color.BLACK);
        }
        for(i = 0; i < white; i++){
            resultButtons[pos++].setBackground(Color.WHITE);
        }
        
        //FILL THE REST OF RESULT WITH NONE
        if(black + white < 4){
            for(i = 0; i < 4 - (black+white); i++){
                resultButtons[pos++].setBackground(new Color(102,102,102)); //gray is blank
            }
        }       
    }//GEN-LAST:event_guessButtonActionPerformed

    private void blankButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blankButtonMouseClicked
        /*if a filled (colored) slot is double-clicked, it'll turn blank/black*/
        if (evt.getClickCount() == 2) {
            //If a button is deselected, Disable the OK button and Enable the color buttons again
            //until 4 buttons in a row are filled.
            guessButton.setEnabled(false); 
            redButton.setEnabled(true); blueButton.setEnabled(true);
            greenButton.setEnabled(true); yellowButton.setEnabled(true);
            orangeButton.setEnabled(true); purpleButton.setEnabled(true);
            switch(numOfGuess){
                case 1:
                    if(evt.getSource() == blankButton1)
                        blankButton1.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton2)
                        blankButton2.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton3)
                        blankButton3.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton4)
                        blankButton4.setBackground(Color.BLACK);
                    break;
                case 2:
                    if(evt.getSource() == blankButton5)
                        blankButton5.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton6)
                        blankButton6.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton7)
                        blankButton7.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton8)
                        blankButton8.setBackground(Color.BLACK);
                    break;
                case 3:
                    if(evt.getSource() == blankButton9)
                        blankButton9.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton10)
                        blankButton10.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton11)
                        blankButton11.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton12)
                        blankButton12.setBackground(Color.BLACK);
                    break;
                case 4:
                    if(evt.getSource() == blankButton13)
                        blankButton13.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton14)
                        blankButton14.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton15)
                        blankButton15.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton16)
                        blankButton16.setBackground(Color.BLACK);
                    break;
                case 5:
                    if(evt.getSource() == blankButton17)
                        blankButton17.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton18)
                        blankButton18.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton19)
                        blankButton19.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton20)
                        blankButton20.setBackground(Color.BLACK);
                    break;    
                case 6:
                    if(evt.getSource() == blankButton21)
                        blankButton21.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton22)
                        blankButton22.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton23)
                        blankButton23.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton24)
                        blankButton24.setBackground(Color.BLACK);
                    break;
                case 7:
                    if(evt.getSource() == blankButton25)
                    blankButton25.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton26)
                        blankButton26.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton27)
                        blankButton27.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton28)
                        blankButton28.setBackground(Color.BLACK);
                    break;   
                case 8:
                    if(evt.getSource() == blankButton29)
                        blankButton29.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton30)
                        blankButton30.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton31)
                        blankButton31.setBackground(Color.BLACK);
                    else if(evt.getSource() == blankButton32)
                        blankButton32.setBackground(Color.BLACK);   
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_blankButtonMouseClicked

//        public static JButton getRandomColor()
//    {
//        Random random = new Random(); //create an instance of Random class
//        return values()[random.nextInt(values().length)]; //then invoke nextInt() using that instance
//        //values() is of enum. returning any value in values()
//    }
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
                guessButton.setEnabled(false);
                
                hiddenColor[0] = hiddenColor1;
                hiddenColor[1] = hiddenColor2;
                hiddenColor[2] = hiddenColor3;
                hiddenColor[3] = hiddenColor4;                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton blankButton1;
    private static javax.swing.JButton blankButton10;
    private static javax.swing.JButton blankButton11;
    private static javax.swing.JButton blankButton12;
    private static javax.swing.JButton blankButton13;
    private static javax.swing.JButton blankButton14;
    private static javax.swing.JButton blankButton15;
    private static javax.swing.JButton blankButton16;
    private static javax.swing.JButton blankButton17;
    private static javax.swing.JButton blankButton18;
    private static javax.swing.JButton blankButton19;
    public static javax.swing.JButton blankButton2;
    private static javax.swing.JButton blankButton20;
    private static javax.swing.JButton blankButton21;
    private static javax.swing.JButton blankButton22;
    private static javax.swing.JButton blankButton23;
    private static javax.swing.JButton blankButton24;
    private static javax.swing.JButton blankButton25;
    private static javax.swing.JButton blankButton26;
    private static javax.swing.JButton blankButton27;
    private static javax.swing.JButton blankButton28;
    private static javax.swing.JButton blankButton29;
    public static javax.swing.JButton blankButton3;
    private static javax.swing.JButton blankButton30;
    private static javax.swing.JButton blankButton31;
    private static javax.swing.JButton blankButton32;
    public static javax.swing.JButton blankButton4;
    private static javax.swing.JButton blankButton5;
    private static javax.swing.JButton blankButton6;
    private static javax.swing.JButton blankButton7;
    private static javax.swing.JButton blankButton8;
    private static javax.swing.JButton blankButton9;
    public javax.swing.JButton blueButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton greenButton;
    private static javax.swing.JButton guessButton;
    private static javax.swing.JButton hiddenColor1;
    private static javax.swing.JButton hiddenColor2;
    private static javax.swing.JButton hiddenColor3;
    private static javax.swing.JButton hiddenColor4;
    private javax.swing.JPanel initialColors;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JButton orangeButton;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JButton resultButton1;
    private javax.swing.JButton resultButton10;
    private javax.swing.JButton resultButton11;
    private javax.swing.JButton resultButton12;
    private javax.swing.JButton resultButton13;
    private javax.swing.JButton resultButton14;
    private javax.swing.JButton resultButton15;
    private javax.swing.JButton resultButton16;
    private javax.swing.JButton resultButton17;
    private javax.swing.JButton resultButton18;
    private javax.swing.JButton resultButton19;
    private javax.swing.JButton resultButton2;
    private javax.swing.JButton resultButton20;
    private javax.swing.JButton resultButton21;
    private javax.swing.JButton resultButton22;
    private javax.swing.JButton resultButton23;
    private javax.swing.JButton resultButton24;
    private javax.swing.JButton resultButton25;
    private javax.swing.JButton resultButton26;
    private javax.swing.JButton resultButton27;
    private javax.swing.JButton resultButton28;
    private javax.swing.JButton resultButton29;
    private javax.swing.JButton resultButton3;
    private javax.swing.JButton resultButton30;
    private javax.swing.JButton resultButton31;
    private javax.swing.JButton resultButton32;
    private javax.swing.JButton resultButton4;
    private javax.swing.JButton resultButton5;
    private javax.swing.JButton resultButton6;
    private javax.swing.JButton resultButton7;
    private javax.swing.JButton resultButton8;
    private javax.swing.JButton resultButton9;
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
    private JButton[] blankButtons = new JButton[4];
    int numOfGuess = 1;
    private static JButton[] hiddenColor = new JButton[4];
    private JButton[] resultButtons = new JButton[4];
    
}
