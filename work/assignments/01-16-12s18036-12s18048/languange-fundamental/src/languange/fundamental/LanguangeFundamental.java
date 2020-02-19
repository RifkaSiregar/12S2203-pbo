/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languange.fundamental;

/**
 *
 * @author 16-12s18036 Sandra Siregar
 * @author 16-12s18048 Rifka Siregar
 */
public class LanguangeFundamental {
    
    public static void main(String[] args) {
    System.out.println("Hello, world!");
    int gear = 1;
    boolean result = true;
    char capitalC= 'C';
    byte b = 100;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    //26 in hexadecimal and binary
    int hexVal = 0x1a;
    int binVal = 0b11010;
    
    System.out.println(hexVal + ", " + binVal);
    
    //intantiating and manipulating objects
    String name = "Wiro Sableng";
    short gearObject = 1;
    Boolean resultObj = true;
    System.out.println(name + ", " + gearObject +"," + resultObj);
    
    name = name.toUpperCase();
    gearObject++;
    resultObj = (result == false ) || !resultObj;
    
    System.out.println(name +", " + gearObject + ", " + resultObj);
    
    //array, collections, and loop
    int[][] numbers = new int[10][10];
    
    for(int i = 0; i < numbers.length; ++i){
        for(int j = 0; j < numbers[i].length; ++j){
            System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
    }
//Challenge

    }
}
    

  
