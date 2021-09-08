package JavaPackage;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;

public class Assess_Emp {
    static Scanner sc=new Scanner(System.in);
    Map<String, String> name=new java.util.HashMap<String, String>();
    Map<String, String> salary=new java.util.HashMap<String, String>();
    Map<String, String> exp=new java.util.HashMap<String, String>();

    public static void main(String args[])  throws Exception{
        Assess_Emp as=new Assess_Emp();
        System.out.println("Welcome to Employ Management Tool");
        while(true) {
            System.out.println("1.Add 2.View  3.Update  4.Delete 5.Export 6.Exit ");
            System.out.println();
            System.out.println("Enter your choice");
            int ch= sc.nextInt();
            switch(ch) {
                case 1: as.add();
                    break;
                case 2: as.View();
                    break;
                case 3: as.update();
                    break;
                case 4: as.Delete();
                    break;
                case 5:as.export();
                    break;
                case 6: System.out.println("Thank you....");
                    System.exit(0);
                    break;
            }
        }
    }

    void add() {

        System.out.println("Enter ID");
        String id=sc.next();
        System.out.println("Enter Name");
        String ename=sc.next();
        sc.nextLine();
        System.out.println("Enter Salary");
        String esal=sc.nextLine();
        System.out.println("Enter Experience");
        String eexp=sc.next();
        if(name.containsKey(id)) {
            System.out.println("Record already exist...");
        }
        else {
            name.put(id, ename);
            salary.put(id, esal);
            exp.put(id, eexp);
            System.out.println("Record added successfully");
        }
    }

    void View() {
        if (name.isEmpty()) {
            System.out.println("No records to display...");
        } else {
            for (String key : name.keySet()) {
                System.out.println("Id: " + key);
                System.out.println("Name: " + name.get(key));
                System.out.println("Salary: " + salary.get(key));
                System.out.println("Experience: " + exp.get(key));
                System.out.println();
            }
        }
    }

    void update() {

        if(name.isEmpty()) {
            System.out.println("No records to display...");
        }
        System.out.println("Enter the id you want to update");
        String id=sc.next();

        if(name.containsKey(id) && salary.containsKey(id) && exp.containsKey(id)) {
            System.out.println("Enter new salary and Experience");

            String nsal=sc.next();
            String nexp=sc.next();
            salary.put(id,nsal);
            exp.put(id,nexp);
            System.out.println("Record Updated Successfully...!");
        }
        else {
            System.out.println("Record not Exist..!");
        }
    }

    void Delete() {

        System.out.println("Enter the Employes id to delete!");
        String id= sc.next();
        if(name.containsKey(id)) {
            name.remove(id);
            salary.remove(id);
            exp.remove(id);
            System.out.println("Record deleted successfully...!");
        }
        else{
            System.out.println("Record not Exist..!");
        }
    }
    void export() throws Exception {
        File f=new File("C://Users//00003940//Documents//Data.txt");
        FileWriter fw=new FileWriter(f);
        for(String k:name.keySet()) {
            fw.write(k);
            fw.write(name.get(k));
            fw.write(salary.get(k));
            fw.write(exp.get(k));
            System.out.println();
        }
        System.out.println("Data Exported Successfully");
        fw.close();
    }
}

