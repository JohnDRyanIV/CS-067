package Week8.BattleSimulation;


public class BattleDriver 
{
    public static void main(String[] args) 
    {
        Character hero = new Mage("Elminster", 35, 30, 5);
        Character monster = new Character("The Overrider",50);
        Axe axe = new Axe("IOAxeption");
        monster.equipWeapon(axe);

        System.out.print("BATTLE!!!");
        System.out.print(hero+" vs. "+monster);

        while(hero.isAlive() && monster.isAlive())
        {
            int heroAttack = hero.attack();
            monster.dealDamage(heroAttack);

            int monsterAttack = monster.attack();
            hero.dealDamage(monsterAttack);
        }

        if(!hero.isAlive())
        {
            System.out.println("Our hero "+hero+" fought valiantly but died in battle against "+monster);
        }
        if(!monster.isAlive())
        {
            System.out.println("The evil "+monster+" was slain by the hero "+hero);
        }
    }
}
