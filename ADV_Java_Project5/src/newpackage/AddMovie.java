/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 * 
 * ‘***  Class Name: addMovie
‘***  Class Author: Angelica Jones
‘******************************************************
‘*** Purpose of the class (Why did you write this class?)
‘***: for user to add items/objects/attributes for the movie class
* Creating a gui was suggested by classmate Emily Farias.
‘******************************************************
‘*** Date 10/3/17
‘******************************************************
‘*** List of changes with dates. 
* 10/14/17 added try catches
* 10/9/17 - got rid of array with actors/actresses as instructed by Dr. Woodcock
‘******************************************************
 */
 
public class AddMovie extends javax.swing.JFrame {

    /**
     * Creates new form AddMovie
     */
    //create an array list of store items
    ArrayList<StoreItem> storeItems;
    
    ArrayList<String> actorsList;
    ArrayList<String> actressesList;
    
    
    //this is the constructor
    public AddMovie(ArrayList<StoreItem> al) 
    
    {
        initComponents();
        storeItems = al;
        //array list is al.
        
        actorsList = new ArrayList<>();
        actressesList = new ArrayList<>();
        
    }

    private AddMovie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        moviePurchasePrice = new javax.swing.JTextField();
        saveMovie = new javax.swing.JButton();
        movieAskingPrice = new javax.swing.JTextField();
        movieAuthor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        movieTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        movieActor = new javax.swing.JTextField();
        movieActress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saveActors = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        saveActresses = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addCurrentActors = new javax.swing.JButton();
        addingCurrentActresses = new javax.swing.JButton();
        movieDirectorsz = new javax.swing.JLabel();
        movieDirector = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movieDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieDateActionPerformed(evt);
            }
        });

        jLabel5.setText("Author");

        moviePurchasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviePurchasePriceActionPerformed(evt);
            }
        });

        saveMovie.setText("Add Movie");
        saveMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMovieActionPerformed(evt);
            }
        });

        movieAskingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieAskingPriceActionPerformed(evt);
            }
        });

        movieAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieAuthorActionPerformed(evt);
            }
        });

        jLabel1.setText("Title");

        jLabel2.setText("Date");

        jLabel3.setText("Purchase Price");

        movieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieTitleActionPerformed(evt);
            }
        });

        jLabel4.setText("Asking Price");

        jLabel7.setText("Actor");

        movieActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActorActionPerformed(evt);
            }
        });

        movieActress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActressActionPerformed(evt);
            }
        });

        jLabel8.setText("Actress");

        saveActors.setColumns(20);
        saveActors.setRows(5);
        jScrollPane1.setViewportView(saveActors);

        saveActresses.setColumns(20);
        saveActresses.setRows(5);
        jScrollPane2.setViewportView(saveActresses);

        jLabel6.setText("Current Actors");

        jLabel9.setText("Current Actresses");

        addCurrentActors.setText("Add");
        addCurrentActors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCurrentActorsActionPerformed(evt);
            }
        });

        addingCurrentActresses.setText("Add");
        addingCurrentActresses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingCurrentActressesActionPerformed(evt);
            }
        });

        movieDirectorsz.setText("Director");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel1)
                                    .addGap(94, 94, 94)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(movieActor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(movieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(47, 47, 47)))
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(movieActress)
                                        .addComponent(moviePurchasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addComponent(movieDate)
                                        .addComponent(movieAskingPrice))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(saveMovie)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movieDirectorsz)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(movieDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addingCurrentActresses)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addCurrentActors)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(355, 355, 355))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(movieActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieActress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(addCurrentActors)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieAskingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addingCurrentActresses)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moviePurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(1, 1, 1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(movieDirectorsz)
                        .addComponent(movieDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(saveMovie)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieTitleActionPerformed

    private void movieActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieActorActionPerformed

    private void movieActressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieActressActionPerformed

    private void movieDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieDateActionPerformed

    private void moviePurchasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviePurchasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moviePurchasePriceActionPerformed

    private void movieAskingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieAskingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieAskingPriceActionPerformed

    private void movieAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieAuthorActionPerformed

    private void saveMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMovieActionPerformed
        // TODO add your handling code here:
        String title;
        String author;
        String date = null;
        String director;
        int purchasePrice = 0;
        int askingPrice = 0;
        
        title = movieTitle.getText();
        author = movieAuthor.getText();
 
        director = movieDirector.getText();
        //purchasePrice = Integer.parseInt(moviePurchasePrice.getText());
        //askingPrice = Integer.parseInt(movieAskingPrice.getText());
        
        
        //this is my try catch. it will ensure that the user will enter a number instead of words for the prices.
        try{
            purchasePrice = Integer.parseInt(moviePurchasePrice.getText());
            askingPrice = Integer.parseInt(movieAskingPrice.getText());
        
        }catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null, "Error for price of a movie");
        }
      
        
        //going to turn the actors and actresses list into an array
        
        //create array that is the same size as the list above.
        String[] actorsArray = new String[actorsList.size()];
        actorsArray = actorsList.toArray(actorsArray);
        
        String [] actressesArray = new String[actressesList.size()];
        actressesArray = actressesList.toArray(actressesArray);
        
        //instantiating the movies. creatin a object of type movies that can be stored.
        movies newMovies = new movies(title, author, date, askingPrice, purchasePrice, director, actorsArray, actressesArray);
        
        storeItems.add(newMovies);
        ObjToFile theFile = new ObjToFile();
       theFile.openFile();
       for(StoreItem item: storeItems)
       theFile.writeRecord(item);
       theFile.closeFile();
                
        
        //this will go back to the main GUI when the user leaves.
        mainGui mainScreen = new mainGui();
        //calling the function from the main gui
        mainScreen.updateStoreItems(storeItems);
        this.setVisible(false);
        
        mainScreen.setVisible(true);
        
    }//GEN-LAST:event_saveMovieActionPerformed

    private void addingCurrentActressesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingCurrentActressesActionPerformed
        // TODO add your handling code here:
        actressesList.add(movieActress.getText());
        String actressesString = "";
        
        for(int i = 0; i < actressesList.size(); i++)
        {
            actressesString = actressesString + actressesList.get(i) +"\n";
        }
        saveActresses.setText(actressesString);
        
    }//GEN-LAST:event_addingCurrentActressesActionPerformed

    private void addCurrentActorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCurrentActorsActionPerformed
        // TODO add your handling code here:
        actorsList.add(movieActor.getText());
        String actorsString = "";
        
        for(int i = 0; i < actorsList.size(); i++)
        {
            actorsString = actorsString + actorsList.get(i) +"\n";
        }
        saveActors.setText(actorsString);
        
        
    }//GEN-LAST:event_addCurrentActorsActionPerformed

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
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCurrentActors;
    private javax.swing.JButton addingCurrentActresses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField movieActor;
    private javax.swing.JTextField movieActress;
    private javax.swing.JTextField movieAskingPrice;
    private javax.swing.JTextField movieAuthor;
    private javax.swing.JTextField movieDate;
    private javax.swing.JTextField movieDirector;
    private javax.swing.JLabel movieDirectorsz;
    private javax.swing.JTextField moviePurchasePrice;
    private javax.swing.JTextField movieTitle;
    private javax.swing.JTextArea saveActors;
    private javax.swing.JTextArea saveActresses;
    private javax.swing.JButton saveMovie;
    // End of variables declaration//GEN-END:variables
}
