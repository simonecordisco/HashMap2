public class Articolo {
    private String nome;
    private double prezzo;

    public  Articolo(String nome, double prezzo) {
        this.nome=nome;
        this.prezzo=prezzo;
    }
    public String getNome () {
        return nome;
    }

    public String setNome(){
        this.nome = nome;
        return nome;
    }

    public double getPrezzo () {
        return prezzo;
    }


    public double setPrezzo(){
        this.prezzo = prezzo;
        return prezzo;
    }
    @Override
    public String toString () {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';

    }
}
