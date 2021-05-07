/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiv;

/**
 *
 * @author rafael
 */
import gerente.gerente;
import desenvolvedor.dev;
//import funcionario.funcionario;

public class AtividadeIV {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Gerentes / Desenvolvedores");
        System.out.println("============================");
        
        gerente dos = new gerente("juan", "000.000.000-00", 2000, 1548.7);
        dos.setBonificacaoGer(0.20);
        dos.imprimir();
        
        System.out.println("============================");
        
        gerente Ger = new gerente("Pablo Escobar", "000.000.000-00", 2000000, 555.7);
        Ger.setBonificacaoGer(0.20);
        Ger.imprimir();
        
        System.out.println("============================");
        
        dev tre = new dev("newt scamander", "000.000.000-00", 2500);
        tre.setBonificacaoDev(0.15);
        tre.imprimir();
        
        System.out.println("============================");
        
        dev ti = new dev("Crescencio", "000.000.000-00", 4000);
        ti.setBonificacaoDev(0.15);
        ti.imprimir();
        
        System.out.println("============================");
        
        Ger.imprimirBD();
        dos.imprimirBD();
        tre.imprimirBD();
        ti.imprimirBD();
        
    }
    
}
