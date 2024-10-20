package Week8.BattleSimulation;

import java.util.Random;

public class weapon 
{
    protected String name;
    protected Random DamageGenerator;

    public weapon(String n)
    {
        name = n;
        DamageGenerator = new Random();
    }

    public int damage()
    {
        int damageAmount = DamageGenerator.nextInt(2);
        System.out.println(this+" deals "+damageAmount+" damage!");
        return damageAmount;
    }

    public String toString()
    {
        String weaponInfo = name+"(Weapon)";
        return weaponInfo;
    }
}

