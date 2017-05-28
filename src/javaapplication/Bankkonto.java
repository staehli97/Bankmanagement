/**
 * Created by vmadmin on 24.02.2017.
 */
public class Bankkonto implements IBankkonto {
    private String kontoBezeichnung;
    private int kontoNr;
    private int maxAusz;
    private int passwort;

    public String getKontoBezeichnung() {
        return kontoBezeichnung;
    }

    public void setKontoBezeichnung(String kontoBezeichnung) {
        this.kontoBezeichnung = kontoBezeichnung;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public int getMaxAusz() {
        return maxAusz;
    }

    public void setMaxAusz(int maxAusz) {
        this.maxAusz = maxAusz;
    }

    public Bankkonto(String kontoBezeichnung, int kontoNr, int maxAusz) {
        this.kontoBezeichnung = kontoBezeichnung;
        this.kontoNr = kontoNr;
        this.maxAusz = maxAusz;
    }

    @Override
    public void GetSaldo() {
        
        

    }

    @Override
    public void SetSaldo() {

    }

    @Override
    public void ShowSaldo() {

    }

    @Override
    public void OpenAccount() {

    }

    @Override
    public void CloseAccount() {

    }
}
