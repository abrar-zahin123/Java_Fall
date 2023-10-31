package classes;
import java.lang.*;
import interfaces.*;
public class Restaurant implements FoodItemOperations {
    
    private String name;
    private String rid;
    private FoodItem foodItems[] = new FoodItem [10];
    
    
    public void setName(String name){this.name = name;}
    public void setRid(String rid){this.rid = rid;}
    
    
    public String getName(){return name;}
    public String getRid(){return rid;}
    
    public void insertFoodItem(FoodItem f)
    {
        int flag = 0;
        for(int i=0; i<foodItems.length; i++)
        {
            if(foodItems[i] == null)
            {
                foodItems[i] = f;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("FoodItem Inserted");
        }
        else
        {
            System.out.println("Can Not Insert");
        }
    }
    
    public void removeFoodItem(FoodItem f)
    {
        int flag = 0;
        for(int i=0; i<foodItems.length; i++)
        {
            if(foodItems[i] == f)
            {
                foodItems[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1){System.out.println("FoodItem Removed");}
        else{System.out.println("Can Not Remove");}
    }
    
    public void showAllFoodItems()
    {
        for(FoodItem f : foodItems)
        {
            if(f != null)
            {
                f.showInfo();
            }
        }
    }
    
    public FoodItem getFoodItem(String fid) {
        FoodItem f = null;
        for(int i=0; i<foodItems.length; i++)
        {
            if(foodItems[i] != null)
            {
                if(foodItems[i].getFid().equals(fid))
                {
                    f = foodItems[i];
                    break;
                }
            }
        }
    return f;
}
}