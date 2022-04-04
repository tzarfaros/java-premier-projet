package org.humanbboster.myproject.ordi;

import java.util.ArrayList;

public class Repartitor {

    private static Repartitor instance;
    private ArrayList<Printer> printers = new ArrayList<>();
    private int currentPrinterIndex = 0;

    private Repartitor(){ }

    public static Repartitor getInstance(){
        if(instance == null){
            instance = new Repartitor();
        }
        return instance;
    }

    public void print(){
        Printer printer = printers.get(currentPrinterIndex++);
        printer.print();
        if(currentPrinterIndex >= printers.size()){
            currentPrinterIndex = 0;
        }
    }

    public ArrayList<Printer> getPrinters() {
        return printers;
    }

    public void setPrinters(ArrayList<Printer> printers) {
        this.printers = printers;
    }
}

