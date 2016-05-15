/*
Program Name: CalculatorImpl
Programmer: Justin Bortmas, 1218106
Assignment Number: Project #1
Purpose: Implements the remote service
 */

public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject 
    implements Calculator { 
 
    public CalculatorImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public long addition(long x, long y) 
        throws java.rmi.RemoteException { 
        return x + y; 
    } 
 
    public long subtract(long x, long y) 
        throws java.rmi.RemoteException { 
        return x - y; 
    } 
 
    public long multiply(long x, long y) 
        throws java.rmi.RemoteException { 
        return x * y; 
    } 
 
    public long division(long x, long y) 
        throws java.rmi.RemoteException { 
        return x / y; 
    } 
} 
