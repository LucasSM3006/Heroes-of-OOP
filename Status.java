public class Status {
    //private Personagens personagens[];

    public static Boolean checagem(Personagens personagens[], int controle) {

        for(int k = 0; k <= controle; k++) {
            if(personagens[k].getHp() > 0) {
                return true;
            }
        }
        return false;
    }
}
