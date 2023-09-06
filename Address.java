
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRAN HUYNH DUC
 */
public class Address {
    private String City;
    private String District;
    public void setCity(String City){
        this.City=City;
    }
    public String getCity(){
        return City;
    }
    public void setDistrict(String District){
        this.District=District;
    }
    public String getDistrict(){
        return District;
    }
     public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten thanh pho: ");
        City=sc.nextLine();
        System.out.print("nhap huyen: ");
        District = sc.nextLine();
    }
    public void output(){
        System.out.println("Thanh pho: "+City);
        System.out.println("Huyen: "+District);
    }
}
