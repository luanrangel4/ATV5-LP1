/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiv;

/**
 *
 * @author luan
 */
import gerente.gerente;
import desenvolvedor.dev;
//import funcionario.funcionario;

public class AtividadeIV {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Gerentes / Desenvolvedores");
        System.out.println("============================");
        
        gerente dos = new gerente("Lucas", "000.000.000-00", 5000, 154564);
        dos.setBonificacaoGer(0.20);
        dos.imprimir();
        
        System.out.println("============================");
        
        gerente Ger = new gerente("Rafael", "000.000.000-00", 2000, 756757);
        Ger.setBonificacaoGer(0.20);
        Ger.imprimir();
        
        System.out.println("============================");
        
        dev tre = new dev("Robson", "000.000.000-00", 2500);
        tre.setBonificacaoDev(0.15);
        tre.imprimir();
        
        System.out.println("============================");
        
        dev ti = new dev("Carlos", "000.000.000-00", 5345345);
        ti.setBonificacaoDev(0.15);
        ti.imprimir();
        
        System.out.println("============================");
        
        Ger.imprimirBD();
        dos.imprimirBD();
        tre.imprimirBD();
        ti.imprimirBD();
        
    }
    
}
