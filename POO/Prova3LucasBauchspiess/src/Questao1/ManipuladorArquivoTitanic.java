/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lbauchspiess
 */
public class ManipuladorArquivoTitanic {
        
    public void migrarDadosValidosTitanic(File origem, File destino) throws FileNotFoundException,
            UnsupportedEncodingException, IOException{
        
        if (origem == null || !origem.isFile() || !origem.exists() || destino == null) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios; Ou não é um arquivo; ou não existe.");
        }
        
        Path caminhoDestino = destino.toPath();
        
        if(!Files.exists(caminhoDestino)){
            
            if (!Files.exists(caminhoDestino.getParent())) {
                Files.createDirectories(caminhoDestino.getParent());
            }
            
            Files.createFile(caminhoDestino);
        }
        
        ArrayList<String> linhasDestino = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(origem, "UTF-8")) {
            while(scanner.hasNext()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(";");
                int verificador = 0;
                
                for(int i=0; i<=5; i++){
                    if(dados[i] == null || dados[i].equals("")){
                        verificador = 1;
                        break;
                    }
                }                           
                
                if(verificador == 1){
                   
                        String linhaNova = String.join(";", 
                        dados[0],
                        dados[1],
                        dados[2],
                        dados[3],
                        dados[5],
                        dados[4] + "");
                
                        linhasDestino.add(linhaNova);
                }
            }
        }
        
        try(PrintWriter writter = new PrintWriter(destino, "UTF-8")){
            
            for(String linha : linhasDestino){
            
                writter.println(linha);
                
            }
            
        }

    }
        
}
