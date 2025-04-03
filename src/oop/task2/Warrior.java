package oop.task2;

public class Warrior extends Hero{

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with sword");
        enemy.takeDamage(getDamage());
    }
}
