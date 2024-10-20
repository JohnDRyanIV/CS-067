package Week8.BattleSimulation;


public class MagicHealingSword extends Sword {

    protected Character owner;

    public MagicHealingSword(String n, Character o)
    {
        super(n);
        owner = o;
    }

    @Override
    public int damage()
    {
        int swordDamage;
        swordDamage = super.damage();

        if( swordDamage == 6)
        {
            int healAmount = DamageGenerator.nextInt(5)+1;
            System.out.println("Healing "+owner+" by "+healAmount);
            owner.heal(healAmount);
        }
        return swordDamage;
    }
    
}