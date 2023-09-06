import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRAN HUYNH DUC
 */
public class Person {
    private String Name;
    private int Age;
    private String Gender;
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
        return Age;
    }
    public void setGender(String Gender){
        this.Gender=Gender;
    }
    public String getGender(){
        return Gender;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        Name=sc.nextLine();
        System.out.print("nhap tuoi: ");
        Age=sc.nextInt();
        sc.nextLine();
        System.out.print("nhap gioi tinh: ");
        Gender = sc.nextLine();
    }
    public void output(){
        System.out.println("ten la: "+Name);
        System.out.println("Tuoi: "+Age);
        System.out.println("gioi tinh: "+Gender);
    }
}