package proxy.model;

public class ProxySpital implements Ispital{
    private Spital spital;

    public ProxySpital(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient() {
        if(spital.getPacient().isAreCardSanatate()){
            System.out.println("Se interneaza pacientul");
        }else{
            System.out.println("Nu se interneaza pacientul");
        }
    }
}
