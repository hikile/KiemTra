import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRAN HUYNH DUC
 */
public class Classroom {
    private int classId;
    private int numberOfStudent;
    ArrayList<Student> listStudent = new ArrayList<>();
    public void setclassId(int classId){
        this.classId=classId;
    }
    public void setnumberOfStudent(int numberOfStudent){
        this.numberOfStudent=numberOfStudent;
    }
    public int getclassId(){
        return classId;
    }
    public int getnumberOfStudent(){
        return numberOfStudent;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap classID: ");
        classId=sc.nextInt();
        System.out.print("Nhap so luong hoc sinh: ");
        numberOfStudent=sc.nextInt();
        for(int i=1 ; i<=numberOfStudent ;i++){
            Student stuDent = new Student();
            stuDent.input();
            listStudent.add(stuDent);
        }
    }
    public void output(){
        System.out.println("classID: " + classId);
        System.out.println("so luong hoc sinh la: " + numberOfStudent);
        for(Student student:listStudent){
            student.output();
        }
    }
   public ArrayList<Student> searchByName(String name){
       int check=0;
        for(Student student : listStudent){
           String Name=student.getName();
            if(Name.contains(name)){
                student.output();
                check=1;
                break;
            }
        }
        if(check==0){
            System.out.println("khong co hoc sinh muon tim");
        }
        return null;
    }
    public static void main(String[] args) {
        Classroom Class = new Classroom();
        Scanner sc = new Scanner(System.in);
        String name;
        Class.input();
        Class.output();
        System.out.print("Nhap ten hoc sinh muon tim: ");
        name=sc.nextLine();
        Class.searchByName(name);
    }
    
}
