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
    
    public ArrayList<SlidingPuzzle> transformations(SlidingPuzzle _puzzle){
        
        /*
        boolean coin = ((_puzzle.getCoordonnees()[0] == 0 && _puzzle.getCoordonnees()[1] == 0 ) || 
                        (_puzzle.getCoordonnees()[0] == 0 && _puzzle.getCoordonnees()[1] == _puzzle.getDimension() -1) || 
                        (_puzzle.getCoordonnees()[0] == _puzzle.getDimension()-1 && _puzzle.getCoordonnees()[1] == 0) || 
                        (_puzzle.getCoordonnees()[0] == _puzzle.getDimension() - 1 && _puzzle.getCoordonnees()[1] == _puzzle.getDimension() - 1) );
        
        boolean bord = ((_puzzle.getCoordonnees()[0] == 0 && _puzzle.getCoordonnees()[1] != 0 && _puzzle.getCoordonnees()[1] != _puzzle.getDimension() - 1 ) ||
                        (_puzzle.getCoordonnees()[0] == _puzzle.getDimension() - 1 && _puzzle.getCoordonnees()[1] != 0 && _puzzle.getCoordonnees()[1] != _puzzle.getDimension() - 1 ) ||
                        (_puzzle.getCoordonnees()[1] == 0 && _puzzle.getCoordonnees()[0] != 0 && _puzzle.getCoordonnees()[0] != _puzzle.getDimension() - 1 ) ||
                        (_puzzle.getCoordonnees()[1] == _puzzle.getDimension() - 1 && _puzzle.getCoordonnees()[0] != 0 && _puzzle.getCoordonnees()[0] != _puzzle.getDimension() - 1 ) );
        
        if ( coin == true ){

        */
        
        ArrayList<SlidingPuzzle> transformations = new ArrayList<>();
        
        SlidingPuzzle e = _puzzle;
        int valeur;
        int copyPuzzle[][] = new int[e.getDimension()][e.getDimension()];
        for(int i = 0 ; i < 4 ; i++){
            
            if( e.getCoordonnees()[1] - 1 >= 0 ){
                copyPuzzle = e.getPuzzle();
                valeur = e.getPuzzle()[e.getCoordonnees()[0]][e.getCoordonnees()[1]-1];
                copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]-1] = 0;
                copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]] = valeur;
                e.setPuzzle(copyPuzzle);
                
                
            } 
            
        }
        
    }
    
}
