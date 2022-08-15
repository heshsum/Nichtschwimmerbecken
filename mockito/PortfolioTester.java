package mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class PortfolioTester {

    public static void main(String[] args) {

        //Create a portfolio object which is to be tested
        AktienDepot depot = new AktienDepot();

        //Creates a list of stocks to be added to the portfolio
        List<Aktie> aktien = new ArrayList<>();
        Aktie bayer = new Aktie("BAYN", "Bayer", 10);
        Aktie apple = new Aktie("AAPL", "Apple", 3);

        aktien.add(bayer);
        aktien.add(apple);

        TickerService mockTicker = mock(TickerService.class);

        // mock the behavior of stock service to return the value of various stocks
        when(mockTicker.getPrice(bayer)).thenReturn(125.5);
        when(mockTicker.getPrice(apple)).thenReturn(598.47);

        //add stocks to the portfolio
        depot.setAktien(aktien);

        //set the stockService to the portfolio
        depot.setTicker(mockTicker);

        double marketValue = depot.getMarketValue();

        System.out.println("Marktwert des Depots: " + marketValue);
    }
}

