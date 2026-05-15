package Composite.Model;

public class SectieFrunza implements ISpital {
    private String numeSectie;

    public SectieFrunza(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void adaugaNod(ISpital spital) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void stergeNod(ISpital spital) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + " ->" + numeSectie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SectieFrunza{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
