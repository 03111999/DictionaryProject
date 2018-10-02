package view;

import service.SearchCloseCorrect;
import api.text.speech.google.Speak;
import api.google.translate.EnglishVietnamese;
import dto.AcessDatabase;
import dto.ExecuteDatabase;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Dictionary;
import org.json.simple.parser.ParseException;

public class ViewDictionary extends javax.swing.JFrame {

    // Inlitialize variable
        
    public static List<Dictionary> listDict;
    public static WindowInsert windowInsert = new WindowInsert();
    public String var = "Hello";

    // Inlitialization class
    public ViewDictionary() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setLocation(screenWidth / 4, screenHeight / 4);
        this.setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        search = new javax.swing.JButton();
        jTWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetail = new javax.swing.JTextArea();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListWord = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInsert = new javax.swing.JMenu();
        jMEdit = new javax.swing.JMenu();
        jMDelete = new javax.swing.JMenu();
        jMExit = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary_TomCatTeam");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Translate.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        jTWord.setBackground(new java.awt.Color(204, 255, 255));
        jTWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTWordKeyPressed(evt);
            }
        });
        getContentPane().add(jTWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 180, 25));

        jTDetail.setBackground(new java.awt.Color(255, 255, 255));
        jTDetail.setColumns(20);
        jTDetail.setLineWrap(true);
        jTDetail.setRows(5);
        jTDetail.setWrapStyleWord(true);
        jTDetail.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(jTDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 84, 340, 240));

        button2.setText("Text");
        button2.setActionCommand("");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 71, -1));

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Clean.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 30, -1));

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Speak.jpg"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 30, -1));

        jListWord.setBackground(new java.awt.Color(255, 255, 204));
        jListWord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListWordValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListWord);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 218, 240));

        jText.setBackground(new java.awt.Color(204, 255, 255));
        jText.setColumns(20);
        jText.setLineWrap(true);
        jText.setRows(5);
        jText.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jText);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, 310, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 590, 470));

        jMInsert.setText("Insert");
        jMInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMInsertMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMInsert);

        jMEdit.setText("Edit");
        jMEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMEditMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMEdit);

        jMDelete.setText("Delete");
        jMDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMDeleteMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMDelete);

        jMExit.setText("Exit");
        jMExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Search word from database

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String varRun = jTWord.getText().trim();
        var = varRun + "demo";
        int i = 0;
        for (Dictionary word : listDict) {
            if (word.getWord().equals(varRun)) {
                String wordDetail = word.getDetail();
                String var1 = wordDetail.replaceAll("<C><F><I><N><Q>", "\n      ");
                String var2 = var1.replaceAll("<br />", "\n      ");
                String var3 = var2.replaceAll("</Q></N></I></F></C>", "");
                jTDetail.setText(word.getWord() + " : " + var3);
                i = 1;
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, "This word doesn't inside my dictionary.");
            jTWord.requestFocus();
        }
    }//GEN-LAST:event_searchActionPerformed

    // get current Word
    
    public String getCurrentWord() {
        return var;
    }

    // get current Detail of word
    
    public String getCurrentDetail() {
        return jTDetail.getText()+"detail";
    }
    
    // Translate text use api.google.translate

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String text = jText.getText();        
        EnglishVietnamese en_vi = new EnglishVietnamese();
        try {
            setText3(en_vi.translate(text));
        } catch (IOException ex) {
            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button2ActionPerformed

    // Clear all

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        jText.setText(" ");
        jTDetail.setText(" ");
        jTWord.setText(" ");
        initData("");
    }//GEN-LAST:event_button3ActionPerformed

    // Speak English word or text

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        Speak speak = new Speak();
        if (jTWord.getText() != null) {
            speak.speech(jTWord.getText());
        }
        if (jText.getText() != null) {
            speak.speech(jText.getText());
        }
    }//GEN-LAST:event_button4ActionPerformed

    // Value box search = word is choosen

    private void jListWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListWordValueChanged
        // TODO add your handling code here:
        String word = jListWord.getSelectedValue().toString();
        jTWord.setText(word);
    }//GEN-LAST:event_jListWordValueChanged

    // Update listWord

    private void jTWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTWordKeyPressed
        // TODO add your handling code here:
        String text = jTWord.getText();
        text = text + evt.getKeyChar();
        initData(text);
    }//GEN-LAST:event_jTWordKeyPressed

    // Execute when exit

    private void jMExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMExitMouseClicked
        // TODO add your handling code here:
        int click = JOptionPane.showConfirmDialog(null, "Do you want to exit.", "Question", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMExitMouseClicked

    // Reset list is read from database
    
    public void resetListDict() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        listDict = AcessDatabase.readDatabase();
    }

    // Execute when delete word outside database

    private void jMDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMDeleteMouseClicked
        // TODO add your handling code here:
        ExecuteDatabase executeDatabase = new ExecuteDatabase();
        String text = jTWord.getText();
        if (jListWord.getModel().getElementAt(0).equals(jTWord.getText())) {
            int click = JOptionPane.showConfirmDialog(null, "Do you want to delete" + "'" +jTWord.getText() + "'", "Question", JOptionPane.YES_NO_OPTION);
            if (click == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Delete sucess");
                if (executeDatabase.deleteElement(text)) {
                    try {
                        resetListDict();
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jText.setText(" ");
                    jTDetail.setText(" ");
                    jTWord.setText(" ");
                    initData("");
                } else {
                    JOptionPane.showMessageDialog(null, "Delete fail");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, jTWord.getText() + " not inside database.");
        }
    }//GEN-LAST:event_jMDeleteMouseClicked

    // Open windowInsert

    private void jMInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMInsertMouseClicked
        // TODO add your handling code here:        
        windowInsert.openWindowInsert();
    }//GEN-LAST:event_jMInsertMouseClicked

    // Open windowEditw
    
    private void jMEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEditMouseClicked
        // TODO add your handling code here:    
        WindowEdit windowEdit = new WindowEdit(jTWord.getText(), jTDetail.getText());
//        WindowEdit windowEdit = new WindowEdit();
        windowEdit.openWindowEdit();                
    }//GEN-LAST:event_jMEditMouseClicked

    // Function get listWord closest with word
    public void initData(String word) {
        DefaultListModel model = new DefaultListModel();
        SearchCloseCorrect searchClosest = new SearchCloseCorrect();
        if (word == "") {
            jListWord.setModel(model);
        } else {
            for (Dictionary dict : listDict) {
                if (searchClosest.Compare(word, dict.getWord())) {
                    if (dict.getWord().equals(word)) {
                        model.add(0, dict.getWord());
                    } else {
                        model.addElement(dict.getWord());
                    }
                }
            }
            jListWord.setModel(model);
        }
    }

    // Set value for Detail area
    public void setText3(String str) {
        jTDetail.setText(str);
    }

    // View
    public static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        listDict = AcessDatabase.readDatabase();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListWord;
    private javax.swing.JMenu jMDelete;
    private javax.swing.JMenu jMEdit;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenu jMInsert;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTDetail;
    private javax.swing.JTextField jTWord;
    private javax.swing.JTextArea jText;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

    private void setResizeable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
