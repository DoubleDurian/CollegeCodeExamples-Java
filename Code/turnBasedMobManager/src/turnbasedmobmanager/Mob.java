/*
 * Program:TurnBasedMobManger
 * This:Mob.java
 * Author:Durian
 * Date:9/19/2016
 * Purpose:To hold the statistics of the mob as well as it level and an array
           of attacks that it can use
 */
package turnbasedmobmanager;

public class Mob 
{
    //variables
        //combat variables
    int attack;
    int defense;
    int sAttack;
    int sDefence;
        //constituional variables
    int speed;
    int health;
    int maxHealth;
    
    int experience;
    int level;
    
    boolean isAlive;
    boolean boosted;
          
    //constructors
    public Mob()
    {
        //generic default constructor 
        //used only in debuggin mode
        //should never be called in game
        attack = 10;
        defense = 10;
        sAttack = 10;
        sDefence = 10;
        
        speed = 10;
        health = 30;
        
        experience = 0;
        level = 1;
        isAlive = true;
    }
    
    //methods
    public void takeDamage(int damage)
    {//is called by the battle manager when this mob takes damage
        this.health = this.health - damage;
        if(health <= 0)
        {
            //the mob has been killed
            isAlive = false;
        }
    }
    public void heal(int recovery)
    {//called when a pokemon is healed, if it is healed to max then it gains a
        //property called boosted which may increase attack or 
        //something in a future build
        this.health = this.health + recovery;
        if(health > maxHealth)
        {
            health = maxHealth;
            boosted = true;
        }
    }
    
    
}
