package oop.task2;

public class Archer extends Hero{

    public Archer(String name, int damage){
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " attacks " + enemy.getName() + " with bow");
        enemy.takeDamage(getDamage());
    }
}
