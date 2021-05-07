/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author luan
 */
public class funcionario {
    protected String name;
    protected String CPF;
    protected double salario;
    public double bonificacaoDev;
    public double bonificacaoGer;
    
    public funcionario(String name, String CPF, double salario) {
        this.name = name;
        this.CPF = CPF;
        this.salario = salario;
        
    }

    public void setBonificacaoDev(double bonificacaoDev) {
        this.bonificacaoDev = bonificacaoDev;
    }

    public void setBonificacaoGer(double bonificacaoGer) {
        this.bonificacaoGer = bonificacaoGer;
    }
    
    
    
    public void imprimir(){
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + CPF);
        System.out.println("Salario: R$" + salario);
        
    }

    
    
}
