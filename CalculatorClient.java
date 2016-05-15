/*
Program Name: CalculatorClient
Programmer: Justin Bortmas, 1218106
Assignment Number: Project #1
Purpose: User process that will print out results
 */

import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.Naming; 
import java.rmi.NotBoundException; 
 
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        try { 
            Calculator calc = (Calculator)
            Naming.lookup("rmi://localhost/CalculatorService"); 
            System.out.println( calc.subtract(6, 4) ); 
            System.out.println( calc.addition(3, 4) ); 
            System.out.println( calc.multiply(2, 9) ); 
            System.out.println( calc.division(8, 2) ); 
        } 
        catch (MalformedURLException malf) { 
            System.out.println(); 
            System.out.println("MalformedURLException"); 
            System.out.println(malf); 
        } 
        catch (RemoteException remoteEx) { 
            System.out.println(); 
            System.out.println("RemoteException"); 
            System.out.println(remoteEx); 
        } 
        catch (NotBoundException nBoundEx) { 
            System.out.println(); 
            System.out.println("NotBoundException"); 
            System.out.println(nBoundEx); 
        } 
        catch (java.lang.ArithmeticException arithEx) { 
            System.out.println(); 
            System.out.println("java.lang.ArithmeticException"); 
            System.out.println(arithEx); 
        } 
    } 
} 

