public class Personagens{
    private String nome;
    private String nomeClasse;
    private int hp;
    private int atk;
    private int def;
    private int posicaoDef;
    private int defesaEnqDefende;
    private Boolean defendendo;
    private Boolean vivo = true;

    public Personagens(int atk, int def, int hp) {
        setHp(hp);
        setAtk(atk);
        setDef(def);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPosicaoDef(int posicaoDef) {
        this.posicaoDef = posicaoDef;
    }

    public void setDefendendo(Boolean defendendo) {
        this.defendendo = defendendo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void setDefesaEnqDefende(int defesaEnqDefende) {
        this.defesaEnqDefende = defesaEnqDefende;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getPosicaoDef() {
        return posicaoDef;
    }

    public Boolean getDefendendo() {
        return defendendo;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public int getDefesaEnqDefende() {
        return defesaEnqDefende;
    }
}