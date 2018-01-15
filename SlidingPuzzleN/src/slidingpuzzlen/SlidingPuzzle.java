/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidingpuzzlen;

/**
 *
 * @author HANRIAT Calliste FISCHER Rémy
 */
public class SlidingPuzzle {
    


    private int dimension;
    private int puzzle[][];
    private int coordonnees[];
    
    public SlidingPuzzle(){
        
        setDimension(1);
        puzzle = new int[dimension][dimension];
        coordonnees = new int[2];
        initialisation();
        
    }
    
    public SlidingPuzzle(int _dimension){
        
        setDimension(_dimension);
        puzzle = new int[dimension][dimension];
        coordonnees = new int[2];
        initialisation();
        
    }
    
    public void initialisation(){
        
        int nbValeurs = getDimension()*getDimension()-1;
        int randomNum;
        boolean test;
        

        
        int[] tabValeurs = new int [getDimension()*getDimension()];
        
        // initialisation du tableau de nombres à -1 pour ne pas avoir de problème par la suite
        for(int i = 0 ; i < getDimension()*getDimension() ; i++){
            
            tabValeurs[i] = -1;
            
        }
        
        for(int i = 0 ; i < getDimension()*getDimension() ; i++){
            
            test = false;
            while(test == false){
                

                
                randomNum = 0 + (int)(Math.random() * getDimension()*getDimension());
                
            
                if (estPresent(tabValeurs, randomNum) == false){
                    tabValeurs[i] = randomNum;
                    test = true;
                   
                }
                
            }
            
                
        }
        
        int k = 0;
        
        for(int i = 0 ; i < getDimension() ; i++){
            for(int j = 0 ; j < getDimension() ; j++){
                
                puzzle[i][j] = tabValeurs[k];
                if(puzzle[i][j] == 0){
                    
                    coordonnees[0] = i;
                    coordonnees[1] = j;
                    this.setCoordonnees(coordonnees);
                }
                k++;
                
            }
            
            
        }
        
        
    }
    
    public boolean estPresent(int[] _tab, int _number){
        
        boolean test = false;
        int i = 0;
        
        while(i < getDimension()*getDimension() && test == false){
            
            if (_tab[i] == _number) test = true;
            i++;
            
        }
        
        return test;
        
    }
    
    public boolean estTrie(){
        
        boolean test = true;
        
        int i = 0, j=0, k=1;
        
        while(i < getDimension() && test == true){
            while(j < getDimension() && test == true){
                
                if(i == getDimension() - 1 && j == getDimension() - 1 && puzzle[i][j] != 0 ){
                    
                    test = false;
                    
                } else if (puzzle[i][j] != k){
                    
                    test = false;
                    
                }
                j++;
                k++;               
                
            }
            
            i++;            
            
        }
        
        return test;
        
    }
    
    public void initTrie(){
        
        int k=1;
        for (int i = 0 ; i < getDimension() ; i++){
            
           for(int j = 0 ; j < getDimension() ; j++){
               
               if(i == getDimension() - 1 && j == getDimension()-1){
                   
                   puzzle[i][j]=0;
                   
               } else {
                   
                   puzzle[i][j] = k;
                   
               }
               k++;
               
           }
            
        }
        
    }
    
    public void affichage(){
        
        for(int i = 0 ; i < getDimension() ; i++){
            
            for(int j = 0 ; j < getDimension() ; j++){
                
                System.out.print(puzzle[i][j]+"  ");
                
            }
            
            System.out.println("");
            
        }
        
    }

    public int[] getCoordonnees() {
        return coordonnees;
    }

    public int getDimension() {
        return dimension;
    }

    public int[][] getPuzzle() {
        return puzzle;
    }

    public void setCoordonnees(int[] coordonnees) {
        this.coordonnees = coordonnees;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setPuzzle(int[][] puzzle) {
        this.puzzle = puzzle;
    }
    
    
    
    
   



    
}

