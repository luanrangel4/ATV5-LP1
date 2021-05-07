/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenvolvedor;

import funcionario.funcionario;
import java.util.Arrays;
/**
 *
 * @author luan
 */
public class dev extends funcionario{
    public double Nsalario;
    public dev(String nome, String CPF, double salario){
        super(nome,CPF,salario);
    }

    public double getBonificacaoDev() {
        return bonificacaoDev;
    }
    
    public double Nslario(){
       Nsalario = (bonificacaoDev * salario) + salario;
        return Nsalario;
    }
    
   
    @Override
    public void imprimir(){
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + CPF);
        System.out.println("Salario: R$" + salario);
        System.out.println("Bonificação :" + getBonificacaoDev());
        System.out.println("Salario Atualizado: R$" + Nslario());
    }
    
        public void imprimirBD(){
        String[] BTS = {name, CPF};
        double[] BTD = {Nsalario, bonificacaoDev, bonificacaoGer};
        System.out.println(Arrays.toString(BTS));
        System.out.println(Arrays.toString(BTD));
    }
}
