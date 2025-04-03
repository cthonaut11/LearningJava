package oop.task2;

public class TrainingGround {

    public static void main(String[] args) {
//        Hero hero = new Hero("JIJ");
//        hero.attackEnemy(new Enemy(20));

        Hero hero2 = new Warrior("Warrior", 12);
        Hero hero3 = new Archer("Archer", 8);
        Hero hero4 = new Mage("Mage", 15);

        Enemy enemy = new Enemy("Ogre",100);

        allAttack(enemy, hero2, hero3, hero4);

//        Enemy enemy = new Enemy(100);
//        enemy.takeDamage(10);


    }

    public static void allAttack(Enemy enemy, Hero... heroes){
        while(enemy.isAlive()){
            for (Hero hero : heroes) {
                if(enemy.isAlive()){
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
