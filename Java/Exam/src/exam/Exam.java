/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int i = 1;
//        switch(i)
//    {
//    case(1):
//    System.out.println("i ="+i);break;
//    case(2):
//    System.out.println("i= "+i);break;
//    default:System.out.println("not found");}
//        // TODO code application logic here
//        Scanner sc=new Scanner(System.in);
//    System.out.print("Enter the value of input: ");
//    int inaput = sc.nextInt();
//    System.out.println("inaput = "+inaput);
//    int[] table = new int[10];
//   table[0]=9;
//   table[2]=2;
//   for(int a=0;a<10;a++){
//   System.out.println(table[a]);}
//   sc.close();
int[] table ={1,3,4,5,3,34,8};
for(int i=0;i<table.length;i++){
System.out.print(table[i]+" ,");}
for(int f:table){
System.out.print(f+" ,");}
int tmp;
boolean b=true;
System.out.println();
while(b){
b=false;
for(int j=0;j<table.length-1;j++){
if(table[j]<table[j+1]){
    b=true;
tmp=table[j];
table[j]=table[j+1];
table[j+1]=tmp;}}}
for(int e:table){
System.out.print(e+" ,");}
    }
    
  
    
}
