public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] HavingSuperAbilitys = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < HavingSuperAbilitys.length; i++) {
            HavingSuperAbilitys[i].applySuperAbility();}

        }
    }

