
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRAN HUYNH DUC
 */
public class Student extends Person{
    private int Id;
    private double GPA;
    Address address = new Address();
    public void setId(int Id){
        this.Id=Id;
    }
    public int getId(){
        return Id;
    }
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
    public double getGPA(){
        return GPA;
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id: ");
        Id=sc.nextInt();
        sc.nextLine();
        super.input();
        System.out.print("nhap GPA: ");
        GPA = sc.nextDouble();
        address.input();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("ID: "+Id);
        super.output();
        System.out.println("GPA: "+GPA);
        address.output();
    }
}
