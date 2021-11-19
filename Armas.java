public class Armas {
    private String nomeArma;
    private int atk;
    private int def;

    public Armas(int atk, int def) {
        setAtk(atk);
        setDef(def);
    }
    
    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
