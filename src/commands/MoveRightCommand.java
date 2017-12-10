/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import tetris2.Moves;
import tetris2.TetrisShape;

/**
 *
 * @author PR
 */
public class MoveRightCommand implements CommandInterface{
    
    private TetrisShape shape;
    
    public MoveRightCommand(TetrisShape shape){
        this.shape = shape; 
    }

    @Override
    public void execute() {
        shape.setMoveDirection(Moves.RIGHT);
    }
    
}