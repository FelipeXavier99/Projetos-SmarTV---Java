package ProjetoSmartv;

public class Usuario {
    
    public static void main(String[] args) {
        
        Smartv tv = new Smartv();
        
        System.out.println("TV ligada ? ");
        tv.ligar();
        
        System.out.println("\n");
        
        System.out.println("Volume = ");
        tv.aumentarVolume();
        
        System.out.println("\n");
        
        System.out.println("Canal = ");
        tv.mudarCAnal(10);
        
    }
    
}
