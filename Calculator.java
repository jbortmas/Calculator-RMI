/*
Program Name: Calculator
Programmer: Justin Bortmas, 1218106
Assignment Number: Project #1
Purpose: Creates interface for calculatiing services
 */


public interface Calculator 
          extends java.rmi.Remote { 
    public long addition(long x, long y) 
        throws java.rmi.RemoteException; 
 
    public long subtract(long x, long y) 
        throws java.rmi.RemoteException; 
 
    public long multiply(long x, long y) 
        throws java.rmi.RemoteException; 
 
    public long division(long x, long y) 
        throws java.rmi.RemoteException; 
} 
