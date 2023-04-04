package ProjetoSmartv;

public class Smartv {

    int canal = 0;
    int volume = 25;
    int v, n;
    String a;
    boolean ligada = false;

    
    // ligar ou desligar
    public void ligar() {

        ligada = true;
        System.out.println("LIGADA");
    }

    public void desligar() {

        ligada = false;
        System.out.println("DESLIGADA");
    }
    
    
    //Volume

    public void aumentarVolume() {

        volume++;
        System.out.println(volume);
    }

    public void diminuirVolume() {

        volume--;
        System.out.println(volume);

    }
    
    
    //canal
      public void aumentarCanal() {

        canal++;
        System.out.println(canal);
    }

    public void diminuirCAnal() {

        canal--;
        System.out.println(canal);

    }
    
     public void mudarCAnal(int c) {

        canal=c;
        System.out.println(canal);

    }
    

}
