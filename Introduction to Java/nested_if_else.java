//program for nested if else statement
public class nested_if_else {
    public static void main(String args[]) 
    {
        int age=25; //creating two variable for age and weight
        int weight=48;
        //applying condition on age and weight
        if(age>=18)
        {
            if(weight>50)
            {
                System.out.println("Eligible to Donate blood");
            }
            else
            {
                System.out.println("Not eligible to Donate blood");
            }
        }
        else{
            System.out.println("Age must be greater than 18");
        }
    }
}
