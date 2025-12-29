package Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuppliesDB implements Isupplies {

    File file = new File("Data.txt");

    @Override
    public boolean Insert(Supplies supplies) {

        try {
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(supplies.getName() + ":"
                    + supplies.getQuantity() + ":"
                    + supplies.getPrice() + ":"
                    + supplies.getCategory() + "\n");
            filewriter.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(SuppliesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Supplies> View() {
        try {
            Scanner scan = new Scanner(file);
            ArrayList<Supplies> supplieseslist=new ArrayList<>();
            while(scan.hasNextLine()){
                String line=scan.nextLine();
                String arr[]=line.split(":");
                String Name=arr[0];
                String Quantity=arr[1];
                int Price=Integer.valueOf(arr[2]);
                String Category=arr[3];
                Supplies supplies = new Supplies(Name, Quantity, Price, Category);
                supplieseslist.add(supplies);
            }
            return supplieseslist;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuppliesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Supplies> Search(String Category) {
        ArrayList<Supplies> supplieseslist=View();
        ArrayList<Supplies> Categorylist=new ArrayList<>();
        for(int i=0 ;i < supplieseslist.size();i++){
            Supplies supplies=supplieseslist.get(i);
            if(supplies.getCategory().equals(Category)){
                System.out.println(supplies.getCategory());
                String Name=supplies.getName();
                String Quantity=supplies.getQuantity();
                int Price=supplies.getPrice();
                String Categoryn=supplies.getCategory();
                supplies = new Supplies(Name, Quantity, Price, Categoryn);
                Categorylist.add(supplies);
            }
            
            
        
    }
        return Categorylist;
    }

}
