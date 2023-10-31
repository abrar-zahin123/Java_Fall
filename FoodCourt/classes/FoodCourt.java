package classes;
import java.lang.*;
import interfaces.*;
public class FoodCourt implements RestaurantOperations, EmployeeOperations {
    
    private  Restaurant restaurants[] = new Restaurant [500];
    private  Employee employees []   = new Employee  [100];
    
    public void insertRestaurant(Restaurant c) {
        int flag = 0;
        
        for(int count=0; count<restaurants.length; count++) {
            if(restaurants[count] == null) {
                restaurants[count] = c;
                flag = 1;
                break; }
        }
        if(flag == 1) {
            System.out.println("Restaurant Inserted"); }
        else {
            System.out.println("Restaurant Can Not be Inserted");
        }
    }
    public void removeRestaurant(Restaurant c)
    {
        int flag = 0;
        
        for(int count=0; count<restaurants.length; count++)
        {
            if(restaurants[count] == c)
            {
                restaurants[count] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Restaurant Removed");
        }
        else
        {
            System.out.println("Restaurant Can Not be Removed");
        }
    }
    public void showAllRestaurants()
    {
        for(Restaurant c : restaurants)
        {
            if(c != null)
            {
                System.out.println("************************");
                System.out.println("Restaurant Name: "+ c.getName());
                System.out.println("Restaurant Rid: "+ c.getRid());
                System.out.println("-------------------------");
                c.showAllFoodItems();
                System.out.println("-------------------------");
                System.out.println();
            }
        }
    }
    public Restaurant getRestaurant(String rid)
    {
        Restaurant c = null;
        
        for(int count=0; count<restaurants.length; count++)
        {
            if(restaurants[count] != null)
                if(restaurants[count].getRid().equals(rid))
            {
                c = restaurants[count];
                break;
            }
        }
        return c;
    }
    
    
    
    
    public void insertEmployee(Employee e)
    {
        int flag = 0;
        
        for(int count=0; count<employees.length; count++)
        {
            if(employees[count] == null)
            {
                employees[count] = e;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Employee Inserted");
        }
        else
        {
            System.out.println("Employee Can Not be Inserted");
        }
    }
    public void removeEmployee(Employee c)
    {
        int flag = 0;
        
        for(int count=0; count<employees.length; count++)
        {
            if(employees[count] == c)
            {
                employees[count] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Employee Removed");
        }
        else
        {
            System.out.println("Employee Can Not be Removed");
        }
    }
    public void showAllEmployees()
    {
        System.out.println("/////////////////////////////////");
        for(Employee e : employees)
        {
            if(e != null)
            {
                System.out.println("Employee Id: "+ e.getEmpId());
                System.out.println("Employee Name: "+ e.getName());
                System.out.println("Employee Salary: "+ e.getSalary());
                System.out.println();
            }
        }
        System.out.println("/////////////////////////////////");
    }
    public Employee getEmployee(String empId)
    {
        Employee e = null;
        
        for(int count=0; count<employees.length; count++)
        {
            if(employees[count] != null)
            {
                if(employees[count].getEmpId().equals(empId))
                {
                    e = employees[count];
                    break;
                }
            }
        }
        return e;
    }
}
