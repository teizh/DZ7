public class Medic extends Hero{
    public double healPoints;
    public void increaseExperience () {
            healPoints= healPoints*(1.1);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность REVIVE A SOUL" );
    }


    @Override
    public void increaseExpirience() {

    }
}
