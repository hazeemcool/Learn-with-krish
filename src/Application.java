/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thilini
 */
public class Application {
    
    
    
    public static void main(String[] args) {


Printer printer=new Printer();
printer.start();
for(int t=0;t<100;t++){
    System.out.println("Main"+Thread.currentThread().getName()+t);
}

        System.out.println("Main thread running............ ");

    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        
//       
//        Printer printer=new Printer();
//        printer.setDaemon(true);
//        printer.start();
//         for(int i=0;i<100;i++){
//        
//            System.out.println("main "+Thread.currentThread().getName()+" "+i);
//        
//        
//        }
//        
//System.out.println("###################");
//
//    }
    

