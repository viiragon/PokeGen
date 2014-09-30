/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokeMaker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wojtek
 */
public class Pokedex extends javax.swing.JFrame {

    PokeMaker parent;

    public Pokedex(PokeMaker parent) {
        this.parent = parent;
        list.add(new PokemonBase());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListCB = new javax.swing.JComboBox();
        LoadBt = new javax.swing.JButton();
        SortBt = new javax.swing.JButton();
        DeleteBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ListCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCBActionPerformed(evt);
            }
        });

        LoadBt.setText("Load");
        LoadBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtActionPerformed(evt);
            }
        });

        SortBt.setText("Sort");
        SortBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortBtActionPerformed(evt);
            }
        });

        DeleteBt.setText("Delete");
        DeleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SortBt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadBt)
                    .addComponent(SortBt)
                    .addComponent(DeleteBt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortBtActionPerformed
        sortDexNumber();
        parent.repaint();
    }//GEN-LAST:event_SortBtActionPerformed

    private void LoadBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtActionPerformed
        parent.setPokemon((PokemonBase) ListCB.getSelectedItem());
    }//GEN-LAST:event_LoadBtActionPerformed

    private void DeleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtActionPerformed
        if (PokeMaker.question("Are you sure")) {
            list.remove((PokemonBase)ListCB.getSelectedItem());
            parent.repaint();
        }
    }//GEN-LAST:event_DeleteBtActionPerformed

    private void ListCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListCBActionPerformed

    private ArrayList<PokemonBase> list = new ArrayList<>();

    public void addPokemon(PokemonBase poke) {
        int decoy;

        if ((decoy = findPokemonIndex(poke.getName())) == -1) {
            list.add(poke);
            return;
        }
        if (PokeMaker.question("Pokemon with this name already exist! Replace?")) {
            list.set(decoy, poke);
        }
    }

    public void deletePokemon(PokemonBase poke) {
        if (PokeMaker.question("Are you sure")) {
            list.remove(poke);
        }
    }
    
    public PokemonBase findPokemon(String name) {
        for (PokemonBase poke : list) {
            if (poke.getName().equals(name)) {
                return poke;
            }
        }
        return null;
    }

    public int findPokemonIndex(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Object[] getArray() {
        return list.toArray();
    }

    public int dexSize() {
        return list.size();
    }

    public void sortDexNumber() {
        Collections.sort(list);
    }

    @Override
    public void repaint() {
        ListCB.setModel(new javax.swing.DefaultComboBoxModel(list.toArray()));
        super.repaint();
    }

    @Override
    public void dispose() {
        this.setVisible(false);
    }

    public void saveList(String file) {
        try (PrintWriter save = new PrintWriter(file)) {
            for (PokemonBase poke : list) {
                //System.out.println(poke.toString());
                if (poke.getIndex() != 0) {
                    save.println(poke.getDataString());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void loadList(String file) throws Exception {
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = read.readLine()) != null) {
                String[] tab = line.split(";");
                //System.out.println(tab.length);
                //for (int i = 0; i < tab.length; i++) {
                //    System.out.println(i + " " + tab[i]);
                //}
                String descrOne = tab[35].replace("@", "\n");
                String descrTwo = tab[36].replace("@", "\n");
                addPokemon(new PokemonBase(
                        Integer.parseInt(tab[1]),
                        tab[2],
                        tab[3],
                        new String[]{tab[4], tab[5], tab[6]},
                        new int[]{Integer.parseInt(tab[7]), Integer.parseInt(tab[8]), Integer.parseInt(tab[9]),
                            Integer.parseInt(tab[10]), Integer.parseInt(tab[11]), Integer.parseInt(tab[12])},
                        new Object[]{tab[13], tab[14], tab[15]},
                        findPokemon(tab[16]),
                        tab[17],
                        Integer.parseInt(tab[18]),
                        tab[19],
                        Integer.parseInt(tab[20]),
                        new int[]{Integer.parseInt(tab[21]), Integer.parseInt(tab[22]), Integer.parseInt(tab[23]),
                            Integer.parseInt(tab[24]), Integer.parseInt(tab[25]), Integer.parseInt(tab[26])},
                        Integer.parseInt(tab[27]),
                        tab[28],
                        Integer.parseInt(tab[29]),
                        Integer.parseInt(tab[30]),
                        new Object[]{tab[31], tab[32]},
                        tab[33],
                        Integer.parseInt(tab[34]),
                        new String[]{descrOne, descrTwo},
                        tab[37].equals("null") ? null : findPokemon(tab[37])));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBt;
    private javax.swing.JComboBox ListCB;
    private javax.swing.JButton LoadBt;
    private javax.swing.JButton SortBt;
    // End of variables declaration//GEN-END:variables
}
