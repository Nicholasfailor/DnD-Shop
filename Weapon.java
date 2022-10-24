public class Weapon
{
    private String weaponName;
    private double weaponDamage;
    private int cost;
    public Weapon (double dmg, String WN,int c)
        {
        weaponName=WN;
        weaponDamage=dmg;
        cost=c;
        }
    public String getWeaponName()
        {
        return weaponName;
        }
    public void setWeaponName(String weaponName)
        {
        this.weaponName = weaponName;
        }
    public double getWeaponDamage()
        {
        return weaponDamage;
        }
    public void setWeaponDamage(double weaponDamage)
        {
        this.weaponDamage = weaponDamage;
        }
        public int getCost()
        {
        return cost;
        }
    public void setCost(int cost)
        {
        this.cost = cost;
        }


}