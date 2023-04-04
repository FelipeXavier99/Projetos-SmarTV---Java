package projetotestesmartv;

import java.util.Scanner;

public class ProjetoTesteSmartv {

    // outra opcao ligar TV
    //private boolean ligada=new Boolean ("false");
    //if(!ligada)...
    
    
    
    public static void main (String[] args) {
        //   boolean ligada = false;
        int canal = 0;
        int volume = 25;
        int v,n;
        String a;

        
        Scanner obj = new Scanner(System.in);

        System.out.println("TV está ligada?( s ou n)");
        a = obj.nextLine();

        if (a.equals("s")) {
            System.out.println("TV ligada ");

        }
        else if(a.equals("n")){
        
        }

        System.out.println("Mudar de volume - aumentar(1) diminiuir(2)");
        v = obj.nextInt();

        if (v == 1) {
            volume++;
            System.out.println("Volume = " + volume);

        } else {
            volume--;
            System.out.println("Volume = " + volume);

        }
        
         System.out.println("Mudar de canal - aumentar(1) diminiuir(2) ou digite");
        n= obj.nextInt();
        
        switch(n){
                
                case 1:
                      canal++;
            System.out.println("CANAL = " + canal);
            break;
            
                case 2:
                    canal--;
            System.out.println("CANAL = " + canal);
            break;
            
                default:
                    int di;
                    di=canal+n;
                     System.out.println("CANAL = " + di);
                    
            
        }

      
       
            

        }
        
        

    }

    /*
    public boolean ligarTV(int l){
    
       if l==true;
       return
    }
     */
