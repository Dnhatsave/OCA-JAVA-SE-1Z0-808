package com.sydevelop.OOP.Encapsulation;

public class Printer {
    private int tonnerLevel;
    private int numberPages;
    private boolean bootSides;

    public Printer(int tonnerLevel, int numberPages, boolean bootSides) {
        this.tonnerLevel = tonnerLevel;
        this.numberPages = numberPages;
        this.bootSides = bootSides;
    }

    public void fillUpTonner(int tonner){
        System.out.println("The tonner lever was incresead from " + tonnerLevel + " To " +  tonner);
        this.tonnerLevel += tonner;
    }

    public void printPage(int pages){
        if (tonnerLevel > 0) {
            if (isBootSides()) {
                System.out.println("The both sides of pages are being printed ");
                this.tonnerLevel -= 2;
                System.out.println("Current tonner level is " + tonnerLevel);
            } else {
                for (int i = 1;i<pages; i++){
                    System.out.println("Print  current page " + i + " of " + numberPages);
                    this.tonnerLevel--;
                    if (tonnerLevel < 0){
                        System.out.println("Stop Printing... Insuficient tonner level");
                        break;
                    }
                }
                System.out.println("Current tonner level is " + tonnerLevel);
            }
        }else{
            System.out.println("Insuficient tonner level please fellup to print");
        }
    }

    public int getTonnerLevel() {
        return tonnerLevel;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public boolean isBootSides() {
        return bootSides;
    }
}
