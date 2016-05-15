/*
Program Name: CalculatorServer
Programmer: Justin Bortmas, 1218106
Assignment Number: Project #1
Purpose: Provides simple hosting
 */

import java.rmi.Naming;

public class CalculatorServer {

   public CalculatorServer() {
     try {
       Calculator cal = new CalculatorImpl();
       Naming.rebind("rmi://localhost:1099/CalculatorService", cal);
     } catch (Exception excep) {
       System.out.println("Exception: " + excep);
     }
   }

   public static void main(String args[]) {
     new CalculatorServer();
   }
}