/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import outil.Outils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import slidingpuzzlen.SlidingPuzzle;

/**
 *
 * @author HANRIAT Calliste FISCHER Rémy
 */
public class InitPuzzleJUnitTest {
    
    public InitPuzzleJUnitTest() {

        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
        
    }
    
    @Test
    public void init(){
        
        boolean test;
        
        SlidingPuzzle puzzle = new SlidingPuzzle(3);
        //puzzle.affichage();
        
        test = puzzle.estTrie();
        
        System.out.println(test);
        
        puzzle.initTrie();
        //puzzle.affichage();        
        
        test = puzzle.estTrie();
        
        System.out.println(test);
        
        puzzle = new SlidingPuzzle(3);
        System.out.println("Affichage de base : ");
        puzzle.affichage();
        System.out.println("visite des transformations : ");
        ArrayList<SlidingPuzzle> puzzles = Outils.transformations(puzzle);
        for (SlidingPuzzle p : puzzles) {
        	p.affichage();
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
