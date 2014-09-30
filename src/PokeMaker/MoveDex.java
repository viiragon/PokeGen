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
public class MoveDex {

    private ArrayList<MoveBase> list = new ArrayList<>();

    public MoveBase findMove(String name) {
        for (MoveBase move : list) {
            if (move.getName().equals(name)) {
                return move;
            }
        }
        return null;
    }

    public int findMoveIndex(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addMove(MoveBase move) {
        int decoy;

        if ((decoy = findMoveIndex(move.getName())) == -1) {
            list.add(move);
            return;
        }
        if (PokeMaker.question("Move with this name already exist! Replace?")) {
            list.set(decoy, move);
        }
    }

    public void deleteMove(MoveBase move) {
        if (PokeMaker.question("Are you sure")) {
            list.remove(move);
        }
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

    public void saveList(String file) {
        sortDexNumber();        
        try (PrintWriter save = new PrintWriter(file)) {
            for (MoveBase move : list) {
                //System.out.println(move.toString());
                save.println(move.getDataString());
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
                String descrOne = tab[48].replace("@", "\n");
                /*System.out.println(tab.length);
                for (int i = 0; i < tab.length; i++) {
                    System.out.println(i + " " + tab[i]);
                }*/
                addMove(new MoveBase(tab[0], new String[] {tab[1], tab[2]}, tab[3],
                Integer.parseInt(tab[4]), Integer.parseInt(tab[5]), Integer.parseInt(tab[6]),
                tab[7], Integer.parseInt(tab[8]), tab[9], Integer.parseInt(tab[10]),
                Boolean.getBoolean(tab[11]), new int[] {Integer.parseInt(tab[12]),  
                Integer.parseInt(tab[13]), Integer.parseInt(tab[14]), Integer.parseInt(tab[15])
                , Integer.parseInt(tab[16]), Integer.parseInt(tab[17]), Integer.parseInt(tab[18])},
                Integer.parseInt(tab[19]), Boolean.getBoolean(tab[20]), Boolean.getBoolean(tab[21]),
                Boolean.getBoolean(tab[22]), Integer.parseInt(tab[23]), Integer.parseInt(tab[24]), 
                tab[25], tab[26], new boolean[] {Boolean.getBoolean(tab[27]), Boolean.getBoolean(tab[28])
                , Boolean.getBoolean(tab[29]), Boolean.getBoolean(tab[30]), Boolean.getBoolean(tab[31])
                , Boolean.getBoolean(tab[32]), Boolean.getBoolean(tab[33]), Boolean.getBoolean(tab[34])
                , Boolean.getBoolean(tab[35]), Boolean.getBoolean(tab[36]), Boolean.getBoolean(tab[37])
                , Boolean.getBoolean(tab[38]), Boolean.getBoolean(tab[39]), Boolean.getBoolean(tab[40])
                , Boolean.getBoolean(tab[41]), Boolean.getBoolean(tab[42]), Boolean.getBoolean(tab[43])
                , Boolean.getBoolean(tab[44]), Boolean.getBoolean(tab[45]), Boolean.getBoolean(tab[46])
                , Boolean.getBoolean(tab[47])}, descrOne, Boolean.getBoolean(tab[49]), Integer.parseInt(tab[50]), 
                Boolean.getBoolean(tab[51]), Integer.parseInt(tab[52]), tab[53], Boolean.getBoolean(tab[54]), new int[] {Integer.parseInt(tab[55]), 
                Integer.parseInt(tab[56]), Integer.parseInt(tab[57]), Integer.parseInt(tab[58]), 
                Integer.parseInt(tab[59]), Integer.parseInt(tab[60]), Integer.parseInt(tab[61])}, 
                Boolean.getBoolean(tab[62]), Boolean.getBoolean(tab[63]), Boolean.getBoolean(tab[64])));
            }
        }
    }
}
