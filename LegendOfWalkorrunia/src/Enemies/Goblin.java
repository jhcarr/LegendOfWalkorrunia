/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemies;

import Player.Stats;

/**
 *
 * @author Thomas
 */
public class Goblin implements IEnemy {
    private final Stats stats = new Stats(6, 12, 8, 10, 10, 8);
    private final String name = "Goblin";
    
    public Goblin() {
    }
    
    @Override
    public String enemyName() {
        return name;
    }

    @Override
    public Stats getStats() {
        return stats;
    }
    
}
