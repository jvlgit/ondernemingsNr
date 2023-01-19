package be.vdab.ondernemingsnummer.domain;

import be.vdab.ondernemingsnummer.constraints.OndernemingsNr;

public class Firma {
    @OndernemingsNr
    private long ondernemingsNr;

    public long getOndernemingsNr() {
        return ondernemingsNr;
    }

    public void setOndernemingsNr(long ondernemingsNr) {
        this.ondernemingsNr = ondernemingsNr;
    }
}
