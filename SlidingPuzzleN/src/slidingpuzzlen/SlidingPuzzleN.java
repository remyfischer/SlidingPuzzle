/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidingpuzzlen;

import java.util.*;

/**
 *
 * @author HANRIAT Calliste FISCHER Rémy
 */
public class SlidingPuzzleN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SlidingPuzzle puzzle = new SlidingPuzzle(3);
        puzzle.affichage();
        
        
        
    }
    
    public SlidingPuzzle resolution (SlidingPuzzle _puzzle){
        
        // test si le puzzle arrive déjà trié
        
        if (_puzzle.estTrie() == true) return _puzzle;

        
        ArrayList<SlidingPuzzle> tabPuzzle = new ArrayList<>();
        //ArrayList<SlidingPuzzle> tabPred = null;
        HashMap <SlidingPuzzle,SlidingPuzzle> pred = new HashMap<>();
        
        tabPuzzle.add(_puzzle);
        pred.put(_puzzle, null);
        
        SlidingPuzzle eSolution = null;
        SlidingPuzzle e;
        
        ArrayList<SlidingPuzzle> ensembleTransfo = new ArrayList<>();
        ArrayList<SlidingPuzzle> visited = new ArrayList<>();
        
        
        while(!tabPuzzle.isEmpty() && eSolution == null){
            
            e = tabPuzzle.get(0);
            tabPuzzle.remove(e);
            
            
            
        }    
                
        return _puzzle;
        
        
        
    }
    
    
    /*
    public ArrayList<SlidingPuzzle> interversion(SlidingPuzzle _puzzle){
        
        for
        
    }*/
    
}
