package oop.task2;

public class Mage extends Hero{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with magic spell");
        enemy.takeDamage(getDamage());
    }
}
