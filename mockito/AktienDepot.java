package mockito;

import java.util.List;

public class AktienDepot {
    private TickerService ticker;
    private List<Aktie> aktien;

    public TickerService getTicker() {
        return ticker;
    }

    public void setTicker(TickerService ticker) {
        this.ticker = ticker;
    }

    public List<Aktie> getStocks() {
        return aktien;
    }

    public void setAktien(List<Aktie> aktien) {
        this.aktien = aktien;
    }

    public double getMarketValue(){
        double marktwert = 0.0;

        for(Aktie aktie:aktien){
            marktwert = marktwert + aktie.getAnzahl() * ticker.getPrice(aktie);
        }
        return marktwert;
    }
}
