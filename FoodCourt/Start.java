import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start {
    public static void main(String args[]) {
        
        Scanner scannner = new Scanner(System.in);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        FileReadWriteDemo frwd = new FileReadWriteDemo();
        FoodCourt b = new FoodCourt();
        
        boolean option = true;
        Scanner input = new Scanner(System.in);

        String username;
        String password;
        System.out.println("Enter Username: ");
        username = input.nextLine();
        System.out.println("Enter Password: ");
        password = input.nextLine();

        
        while(option) {
              if(username.equals("username") && (password.equals("password")))
               {
            System.out.println("**********Welcome to Triple A food Court**********");
            
            System.out.println("What do you want to do?");
            System.out.println("1. Employee Management");
            System.out.println("2. Restaurant Management ");
            System.out.println("3. Restaurant FoodItem Management ");
            System.out.println("4. FoodItem Quantity Add-Sell ");
            System.out.println("5. Exit");
            System.out.print("Your Option : ");
            int alt = scannner.nextInt();
            
            switch(alt) {
                
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Employee Management");
                    System.out.println("-----------------------------------------");
                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New Employee");
                    System.out.println("2. Remove Existing Employee");
                    System.out.println("3. Show All Employees");
                    System.out.println("4. Search an Employee");
                    System.out.println("5. Go Back");
                    System.out.print("Your Option: ");
                    
                    int alt1 = scannner.nextInt();
                    
                    switch(alt1)
                    {
                        case 1:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Insert New Employee");
                            
                            Employee e = new Employee();
                            try{
                            System.out.print("Enter Employee ID: ");
                            String empId1 = scannner.next();
                            e.setEmpId(empId1);
                            
                            System.out.print("Enter Employee Name: ");
                            String name1 = scannner.next();
                            e.setName(name1);
                            
                            System.out.print("Enter Employee Salary: ");
                            double salary1 = scannner.nextDouble();
                            e.setSalary(salary1);
                            
                            b.insertEmployee(e);}
                            catch(Exception f ) {
                                System.out.println("Please Enter Valid Input");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 2:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Remove Existing Employee");
                            
                            System.out.print("Enter Employee ID: ");
                            String empId2 = scannner.next();
                            
                            b.removeEmployee(b.getEmployee(empId2));
                            
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 3:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All Employees");                            
                            b.showAllEmployees();                            
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 4:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Search an Employee");
                            System.out.print("Enter Employee ID: ");
                            String empId3 = scannner.next();                            
                            Employee e3 = b.getEmployee(empId3);
                            
                            if(e3 != null) {
                                
                                System.out.println("Employee ID is: "+e3.getEmpId());
                                System.out.println("Employee Name is: "+e3.getName());
                                System.out.println("Employee Salary is: "+e3.getSalary()); }
                            else {
                                System.out.println("Employee Does NOT Exist"); }
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 5:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;
                        default:
                            System.out.println("-----------------------------------------");
                            System.out.println("Plese enter valid input");
                            System.out.println("-----------------------------------------");
                            break;
                    }
                    break;
                    
                case 2:                    
                    
                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Restaurant Management");
                    System.out.println("-----------------------------------------");                    
                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New Restaurant");
                    System.out.println("2. Remove Existing Restaurant");
                    System.out.println("3. Show All Restaurants");
                    System.out.println("4. Search a Restaurant");
                    System.out.println("5. Go Back");                    
                    System.out.print("Your Option: ");
                    
                    int alt2 = scannner.nextInt();
                    
                    switch(alt2) {
                        
                        case 1:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Insert New Restaurant");
                            
                            Restaurant rest1 = new Restaurant();
                            System.out.print("Enter Restaurant RID: ");
                            try{
                            String rid1 = scannner.next();
                            rest1.setRid(rid1);
                            String name1;
                            System.out.print("Enter Restaurant Name: ");
                            try {
                                name1 = br.readLine(); }
                            catch(IOException ioe) {
                                name1 = "defaultName"; }
                            
                            rest1.setName(name1);
                            b.insertRestaurant(rest1); }
                            catch(Exception e ) {
                                System.out.println("Please Enter Valid Input");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 2:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Remove Existing Restaurant");
                            System.out.print("Enter Restaurant RID: ");
                            String rid2 = scannner.next();
                            Restaurant rest2 = b.getRestaurant(rid2);
                            b.removeRestaurant(rest2);
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 3:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All Restaurants");
                            b.showAllRestaurants();                            
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 4:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Search a Restaurant");                            
                            System.out.print("Enter Restaurant RID: ");
                            rid2 = scannner.next();                            
                            Restaurant rest3 = b.getRestaurant(rid2);
                            
                            if(rest3 != null) {
                                System.out.println("Restaurant RID: "+rest3.getRid());
                                System.out.println("Restaurant Name: "+rest3.getName());
                                rest3.showAllFoodItems(); }
                            else {
                            System.out.println("Restaurant Does NOT Exist");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 5:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;
                            
                        default:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Plese enter valid input");
                            System.out.println("-----------------------------------------");
                            break;
                    }
                    break;
                    
                case 3:
                    
                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Restaurant FoodItem Management");
                    System.out.println("-----------------------------------------");                    
                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New FoodItem");
                    System.out.println("2. Remove Existing FoodItem");
                    System.out.println("3. Show All FoodItems");
                    System.out.println("4. Search a FoodItem");
                    System.out.println("5. Go Back");                    
                    System.out.print("Your Option: ");
                    
                    int alt3 = scannner.nextInt();
                    
                    switch(alt3) {
                        
                        case 1:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Insert New FoodItem for a Restaurant\n");
                            System.out.println("Which Type of FoodItem do you want?");
                            System.out.println("1. MainDish");
                            System.out.println("2. Appitizers");
                            System.out.println("3. Go Back");
                            System.out.print("Your Type: ");
                            int type = scannner.nextInt();
                            
                            FoodItem a = null;
                            
                            if(type == 1) {
                                
                                System.out.print("Enter FoodItem Id : ");
                                String id = scannner.next();
                                System.out.print("Enter FoodItem Name : ");
                                String name = scannner.next();
                                System.out.print("Enter Available Quantity : ");
                                int quantity = scannner.nextInt();
                                System.out.print("Enter Price : ");
                                double price = scannner.nextDouble();
                                System.out.print("Enter Category : ");
                                String category = scannner.next();
                                MainDish maindish = new MainDish();
                                maindish.setFid(id);
                                maindish.setName(name);
                                maindish.setAvailableQuantity (quantity);
                                maindish.setPrice (price);
                                maindish.setCategory(category);
                                a = maindish; }
                            
                            else if(type == 2) {
                                
                                System.out.print("Enter FoodItem Id : ");
                                String id = scannner.next();
                                System.out.print("Enter FoodItem Name : ");
                                String name = scannner.next();
                                System.out.print("Enter Available Quantity : ");
                                int quantity = scannner.nextInt();
                                System.out.print("Enter Price : ");
                                double price = scannner.nextDouble();
                                System.out.print("Enter Size : ");
                                String size = scannner.next();
                                
                                Appitizers appitizers = new Appitizers();
                                appitizers.setFid(id);
                                appitizers.setName(name);
                                appitizers.setAvailableQuantity (quantity);
                                appitizers.setPrice (price);
                                appitizers.setSize(size);
                                a = appitizers; }
                            
                            else if(type == 3) {
                                System.out.println("Going Back ..."); }
                            else {
                                System.out.println("Plese enter valid input Type"); }
                            if(a != null) {
                                System.out.print("Enter Restaurant RID: ");
                                String rid1 = scannner.next();
                                b.getRestaurant(rid1).insertFoodItem(a); }
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 2:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Remove Existing FoodItem");
                            System.out.print("Enter Restaurant RID: ");
                            String rid2 = scannner.next();
                            System.out.print("Enter FoodItem Id: ");
                            String id2 = scannner.next();                            
                            try{
                            b.getRestaurant(rid2).removeFoodItem(b.getRestaurant(rid2).getFoodItem(id2));}
                            catch(Exception e) {
                            System.out.println("Please enter some FoodItem first");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 3:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All FoodItems");                            
                            System.out.print("Enter Restaurant RID: ");
                            String rid4 = scannner.next();                            
                            try {b.getRestaurant(rid4).showAllFoodItems();}
                            catch(Exception e) {
                                System.out.println("No Restaurant Found");
                                System.out.println("Please enter Restaurant and FoodItem first");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 4:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Search a Restaurant");                            
                            System.out.print("Enter Restaurant RID: ");
                            String rid3 = scannner.next();
                            System.out.print("Enter FoodItem Id: ");
                            String id3 = scannner.next();                            
                            try{ FoodItem a3 = b.getRestaurant(rid3).getFoodItem(id3);
                            
                            if(a3 != null) {
                                a3.showInfo(); }}
                            catch(Exception e) {
                                System.out.println("No FoodItem Found");
                                System.out.println("Please enter FoodItem first");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 5:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;
                            
                        default:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Plese enter valid input");
                            System.out.println("-----------------------------------------");
                            break; }
                    break;
                    
                case 4:
                    
                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen FoodItem Quantity Add-Sell");
                    System.out.println("-----------------------------------------");                    
                    System.out.println("What do you want to do?\n");
                    System.out.println("1. Add FoodItem");
                    System.out.println("2. Sell FoodItem");
                    System.out.println("3. Show Add-Sell History");
                    System.out.println("4. Go Back");                    
                    System.out.print("Your Option: ");
                    int alt4 = scannner.nextInt();
                    
                    switch(alt4) {
                        
                        case 1:
                            
                            System.out.println("-----------------------------------------");
                            try{
                            System.out.println("Add FoodItem");                            
                            System.out.print("Enter Restaurant Rid: ");
                            String rid1 = scannner.next();
                            System.out.print("Enter FoodItem Id: ");
                            String id1 = scannner.next();
                            System.out.print("Enter Quantity: ");
                            int amount1 = scannner.nextInt();
                            
                            if(amount1>0) {
                                Restaurant rt = b.getRestaurant(rid1);
                                FoodItem fm = rt.getFoodItem(id1);
                                fm.addQuantity(amount1);
                                frwd.writeInFile("Add : "+ amount1 +" kg in FoodItem Number "+id1); }}
                            catch(Exception e ) {
                                System.out.println("Please Enter Valid Input");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 2:
                            
                            System.out.println("-----------------------------------------");
                            try { 
                            System.out.println("Sell FoodItem");
                            System.out.print("Enter Restaurant Rid: ");
                            String rid2 = scannner.next();
                            System.out.print("Enter FoodItem Id: ");
                            String id2 = scannner.next();
                            System.out.print("Enter Quantity: ");
                            int amount2 = scannner.nextInt();
                            
                            if(amount2>0 && amount2 <= b.getRestaurant(rid2).getFoodItem(id2).getAvailableQuantity()) {
                                
                                Restaurant rt = b.getRestaurant(rid2);
                                FoodItem fm = rt.getFoodItem(id2);
                                fm.sellQuantity(amount2);
                                frwd.writeInFile("Sell : "+ amount2 +" kg from FoodItem Number "+id2); }}
                            catch(Exception e ) {
                                System.out.println("Please Enter Correct Data");}
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 3:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Show Add Sell History");
                            frwd.readFromFile();
                            System.out.println("-----------------------------------------");
                            break;
                            
                        case 4:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Going back....");
                            System.out.println("-----------------------------------------");
                            break;
                            
                        default:
                            
                            System.out.println("-----------------------------------------");
                            System.out.println("Plese enter valid input");
                            System.out.println("-----------------------------------------");
                            break;
                    }
                    break;
                    
                case 5:
                    
                    System.out.println("You have choosen to exit");
                    option = false;
                    break;
                    
                default:
                    
                    System.out.println("Plese enter valid input");
                    break; }
        }
    }
}
}
