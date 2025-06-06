/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int tmp;
//        FileInputStream in = null;
//        try{
//        in = new FileInputStream ("abc.txt");
//        while((tmp=in.read())!=-1){
//        System.out.print((char)tmp);}}
//        catch(FileNotFoundException e){
//            System.out.println("You made a mistake in the file's name");
//            e.printStackTrace();
//            }catch(IOException e){
//                e.printStackTrace();
//            }finally{
//        try{
//        if(in!=null){
//            in.close();}}
//        catch(IOException e){
//        e.printStackTrace();}}
//        byte[] buffer = new byte[10];
//        FileInputStream in = null;
//        int tmp;
//        try{
//            in = new FileInputStream("abc.txt");
//            while((tmp=in.read(buffer))==buffer.length){
//            System.out.print(new String(buffer));}
//            for(int i =tmp;i<buffer.length;i++){
//            buffer[i]=0;
//            System.out.println(new String(buffer));}
//        }catch(FileNotFoundException e){
//            System.out.println("You made a mistake in the file's name");
//            e.printStackTrace();
//            }catch(IOException e){
//                e.printStackTrace();
//            }finally{
//        try{
//        if(in!=null){
//            in.close();}}
//        catch(IOException e){
//        e.printStackTrace();}}
//String str = "Wrintg into file";
//FileOutputStream out= null;
//try{
//out = new FileOutputStream("abc2.txt");
//for(int i =0;i<str.length();i++){
//System.out.write(str.charAt(i));}}catch(FileNotFoundException e){
//            System.out.println("You made a mistake in the file's name");
//            e.printStackTrace();
//            }

Scanner sc = new Scanner(System.in);
System.out.print("Enter file you want to copy: ");
String file_src = sc.nextLine();
System.out.print("Enter the name of  destination file:");
String file_dsc =  sc.nextLine();
 FileInputStream in = null;
 FileOutputStream out = null;
 try{
 in = new FileInputStream(file_src);
 out = new FileOutputStream(file_dsc);
 int tmp;
 while((tmp=in.read())!=-1){
 out.write(tmp);}}catch(FileNotFoundException e){
            System.out.println("You made a mistake in the file's name");
            e.printStackTrace();
            }
 

        // TODO code application logic here
    }
    
}
