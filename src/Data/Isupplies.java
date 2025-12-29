
package Data;

import java.util.ArrayList;

public interface Isupplies {
   public abstract boolean Insert(Supplies supplies);
   public abstract ArrayList<Supplies> View();
   public abstract ArrayList<Supplies> Search(String Category);
   
   
   
}
