/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int op; 
        int opId; 
        String opNome;
        String opEquipe;
        
        Atleta at1 = new Atleta(1, "Rodler"  , "Equipe1", "Pirajuí"   , "SP");
        Atleta at2 = new Atleta(2, "Mendonça", "Equipe2", "Pirajuí"   , "SP");
        Atleta at3 = new Atleta(3, "Matheus" , "Equipe3", "Pirajuí"   , "SP");
        Atleta at4 = new Atleta(4, "Bruna"   , "Equipe4", "Cafelândia", "SP");
        Atleta at5 = new Atleta(5, "Sara"    , "Equipe5", "Pirajuí"   , "SP");
    
        ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
        listaAtleta.add(at1);
        listaAtleta.add(at2);
        listaAtleta.add(at3);
        listaAtleta.add(at4);
        listaAtleta.add(at5);
        
        
        for(int i = 6; i < 11; i++){
            Atleta objAtleta = new Atleta();
            objAtleta.setIdAtleta(i);
            objAtleta.setNome("Atleta "+i);
            objAtleta.setEquipe("Equipe"+(i-5));
            objAtleta.setCidade("Cidade do Atleta "+i);
            objAtleta.setEstado("Estado "+i);
            listaAtleta.add(objAtleta); 
        }
        
        System.out.printf("*** Lista de Atletas ***\n\n");
        
        for(int j = 0; j <listaAtleta.size(); j++){
            System.out.println("Atleta: "+listaAtleta.get(j).getIdAtleta()+
                               " - "+listaAtleta.get(j).getNome()+
                               " - "+listaAtleta.get(j).getEquipe()+
                               " - "+listaAtleta.get(j).getCidade()+
                               " - "+listaAtleta.get(j).getEstado());
        }
        
        System.out.println("\n\nBuscar Atleta por: ID(1) - NOME(2) - EQUIPE(3)");
        System.out.println("Digite sua opção: ");
        op = entrada.nextInt();
        Atleta objAtleta1 = new Atleta();
        
        switch(op){
            case 1:
                System.out.println("Digite ID do Atleta: ");
                opId = entrada.nextInt();
                for(int k = 0; k <listaAtleta.size(); k++){
                    objAtleta1 = listaAtleta.get(k);
                    if(objAtleta1.getIdAtleta() == opId){
                        System.out.println("Encontrei o/a: "+ objAtleta1.getNome());
                    }
                }
                break;
             
            case 2:
                System.out.println("Digite NOME do Atleta: ");
                opNome = entrada.next();
                for(int k = 0; k <listaAtleta.size(); k++){
                    objAtleta1 = listaAtleta.get(k);
                    if(objAtleta1.getNome().equalsIgnoreCase(opNome)){
                        System.out.println("Encontrei o/a: "+ objAtleta1.getNome());
                    }
                }
                break;
                
            case 3:
                System.out.println("Digite Equipe do Atleta: ");
                opEquipe = entrada.next();
                System.out.println("Encontrei os Atletas: ");
                for(int k = 0; k <listaAtleta.size(); k++){
                    objAtleta1 = listaAtleta.get(k);
                    if(objAtleta1.getEquipe().equalsIgnoreCase(opEquipe)){
                        System.out.println("  "+objAtleta1.getNome());
                    }
                }
                break;
        }
        
    }
    
}
