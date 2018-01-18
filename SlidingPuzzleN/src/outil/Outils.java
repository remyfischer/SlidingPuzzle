package outil;

import java.util.ArrayList;

import slidingpuzzlen.SlidingPuzzle;

public class Outils {
	
	public static SlidingPuzzle puzzle_copy(SlidingPuzzle origin ) {
		int copyPuzzle[][] = new int[origin.getDimension()][origin.getDimension()];
		for (int i =0; i<origin.getDimension(); i++) {
			for (int j = 0; j<origin.getDimension(); j++) {
				copyPuzzle[i][j] = origin.getPuzzle()[i][j];
			}
		}
		SlidingPuzzle p = new SlidingPuzzle(origin.getDimension());
		int coord[] = new int[2];
		coord[0] = origin.getCoordonnees()[0];
		coord[1] = origin.getCoordonnees()[1];		
		p.setPuzzle(copyPuzzle);
		p.setCoordonnees(coord);
		return p;
	}
	public static ArrayList<SlidingPuzzle> transformations(SlidingPuzzle _puzzle) {

		/*
		 * boolean coin = ((_puzzle.getCoordonnees()[0] == 0 &&
		 * _puzzle.getCoordonnees()[1] == 0 ) || (_puzzle.getCoordonnees()[0] ==
		 * 0 && _puzzle.getCoordonnees()[1] == _puzzle.getDimension() -1) ||
		 * (_puzzle.getCoordonnees()[0] == _puzzle.getDimension()-1 &&
		 * _puzzle.getCoordonnees()[1] == 0) || (_puzzle.getCoordonnees()[0] ==
		 * _puzzle.getDimension() - 1 && _puzzle.getCoordonnees()[1] ==
		 * _puzzle.getDimension() - 1) );
		 * 
		 * boolean bord = ((_puzzle.getCoordonnees()[0] == 0 &&
		 * _puzzle.getCoordonnees()[1] != 0 && _puzzle.getCoordonnees()[1] !=
		 * _puzzle.getDimension() - 1 ) || (_puzzle.getCoordonnees()[0] ==
		 * _puzzle.getDimension() - 1 && _puzzle.getCoordonnees()[1] != 0 &&
		 * _puzzle.getCoordonnees()[1] != _puzzle.getDimension() - 1 ) ||
		 * (_puzzle.getCoordonnees()[1] == 0 && _puzzle.getCoordonnees()[0] != 0
		 * && _puzzle.getCoordonnees()[0] != _puzzle.getDimension() - 1 ) ||
		 * (_puzzle.getCoordonnees()[1] == _puzzle.getDimension() - 1 &&
		 * _puzzle.getCoordonnees()[0] != 0 && _puzzle.getCoordonnees()[0] !=
		 * _puzzle.getDimension() - 1 ) );
		 * 
		 * if ( coin == true ){
		 * 
		 */

		ArrayList<SlidingPuzzle> transformations = new ArrayList<>();
		int valeur;
		
		
		
		// si il y a une case au dessus
		if (_puzzle.getCoordonnees()[0] - 1 >= 0) {
			int copyPuzzle[][] = new int[_puzzle.getDimension()][_puzzle.getDimension()];
			SlidingPuzzle e = Outils.puzzle_copy(_puzzle);
			copyPuzzle = e.getPuzzle();
			valeur = e.getPuzzle()[e.getCoordonnees()[0] - 1][e.getCoordonnees()[1]];
			copyPuzzle[e.getCoordonnees()[0] - 1][e.getCoordonnees()[1]] = 0;
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]] = valeur;
			int[] coord = new int[2];
			coord[0] = e.getCoordonnees()[0] - 1;
			coord[1] = e.getCoordonnees()[1];
			e.setPuzzle(copyPuzzle);
			e.setCoordonnees(coord);
			transformations.add(e);						
			e = Outils.puzzle_copy(_puzzle);
		}
		
		// si il y a une case à droite
		if (_puzzle.getCoordonnees()[1] + 1 < _puzzle.getDimension()) {
			int copyPuzzle[][] = new int[_puzzle.getDimension()][_puzzle.getDimension()];
			SlidingPuzzle e = Outils.puzzle_copy(_puzzle);			
			copyPuzzle = e.getPuzzle();
			valeur = e.getPuzzle()[e.getCoordonnees()[0]][e.getCoordonnees()[1]+1];
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]+1] = 0;
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]] = valeur;
			int[] coord = new int[2];
			coord[0] = e.getCoordonnees()[0];
			coord[1] = e.getCoordonnees()[1]+1;
			e.setPuzzle(copyPuzzle);
			e.setCoordonnees(coord);			
			transformations.add(e);						
		}	
		
		// si il y a une case en bas
		if (_puzzle.getCoordonnees()[0] + 1 < _puzzle.getDimension()) {
			int copyPuzzle[][] = new int[_puzzle.getDimension()][_puzzle.getDimension()];
			SlidingPuzzle e = Outils.puzzle_copy(_puzzle);			
			copyPuzzle = e.getPuzzle();
			valeur = e.getPuzzle()[e.getCoordonnees()[0] + 1][e.getCoordonnees()[1]];
			copyPuzzle[e.getCoordonnees()[0]+1][e.getCoordonnees()[1]] = 0;
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]] = valeur;
			int[] coord = new int[2];
			coord[0] = e.getCoordonnees()[0]+1;
			coord[1] = e.getCoordonnees()[1];
			e.setPuzzle(copyPuzzle);
			e.setCoordonnees(coord);
			transformations.add(e);			
			e = Outils.puzzle_copy(_puzzle);
		}
		
		//si il y a une case à gauche
		if (_puzzle.getCoordonnees()[1] - 1 >= 0) {
			int copyPuzzle[][] = new int[_puzzle.getDimension()][_puzzle.getDimension()];
			SlidingPuzzle e = Outils.puzzle_copy(_puzzle);			
			copyPuzzle = e.getPuzzle();
			valeur = e.getPuzzle()[e.getCoordonnees()[0]][e.getCoordonnees()[1] - 1];
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1] - 1] = 0;
			copyPuzzle[e.getCoordonnees()[0]][e.getCoordonnees()[1]] = valeur;
			int[] coord = new int[2];
			coord[0] = e.getCoordonnees()[0];
			coord[1] = e.getCoordonnees()[1] - 1;
			e.setPuzzle(copyPuzzle);
			e.setCoordonnees(coord);
			transformations.add(e);			
			e = Outils.puzzle_copy(_puzzle);
		}

		return transformations;

	}
}
