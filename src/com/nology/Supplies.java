package com.nology;

public class Supplies {

    private int pens;
    private int staplers;
    private int staples;
    private int rulers;
    private int a4Booklets;

    public Supplies(int pens, int staplers, int staples, int rulers, int a4Booklets) {
        this.pens = pens;
        this.staplers = staplers;
        this.staples = staples;
        this.rulers = rulers;
        this.a4Booklets = a4Booklets;
    }

    public Supplies() {
    }

    public int getPens() {
        return pens;
    }

    public void setPens(int pens) {
        this.pens = pens;
    }

    public void setStaples(int staples) {
        this.staples = staples;
    }

    public void setRulers(int rulers) {
        this.rulers = rulers;
    }

    public int takePens(int pens) {

        if ((getPens() - pens) < 0) {
            insufficientPens(pens);
            return -1;
        } else {
            setPens(getPens() - pens);
            return getPens();
        }

    }
    public int takeRulers(int rulers) {

        if (getRulers() - rulers < 0) {
            return -1;
        } else {
            setPens(getRulers() - rulers);
            return getRulers();
        }

    }


    public String insufficientPens(int pens) {
        return  ((getPens() - pens)*-1) + " more pens required";
    }

    public String staplesToStaplersCheck(int staples) {
        if (getStaplers() * staples > getStaples() ){
            return "More staples requires";
        } else {return "More staplers requires";}
    }

    public int takeStaples(int staples) {
        setStaples(getStaples() - staples);
        return getPens();
    }
    public int takeStaplers(int staplers) {
        setStaplers(getStaplers() - staplers);
        return getPens();
    }
    public int takeA4Booklets(int a4Booklets) {
        setA4Booklets(getStaplers() - a4Booklets);
        return getA4Booklets();
    }

    public int howManyNewStaff() {
        int newStaff = 0;
        while (getStaples() >0 && getPens() >0 && getStaplers() > 0 && getA4Booklets() > 0 && getRulers() > 0) {
            takePens(5);
            takeRulers(3);
            takeStaplers(1);
            takeStaples(100);
            takeA4Booklets(4);
            newStaff += 1;
        }
        return newStaff;
    }


    public void addPens(int pens) {
        this.pens += pens;
    }

    public int getStaplers() {
        return staplers;
    }

    public void setStaplers(int staplers) {
        this.staplers = staplers;
    }

    public int getStaples() {
        return staples;
    }

    public void addStaples(int staples) {
        this.staples += staples;
    }

    public int getRulers() {
        return rulers;
    }

    public void addRulers(int rulers) {
        this.rulers =+ rulers;
    }

    public int getA4Booklets() {
        return a4Booklets;
    }

    public void setA4Booklets(int a4Booklets) {
        this.a4Booklets = a4Booklets;
    }
}
