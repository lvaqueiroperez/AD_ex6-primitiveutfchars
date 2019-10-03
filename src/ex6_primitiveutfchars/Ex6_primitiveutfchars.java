/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_primitiveutfchars;

import java.io.*;

/**
 *
 * @author oracle
 */
public class Ex6_primitiveutfchars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
         Propoñovos un exercicio que consistirá grabar unha mesma cadea  de texto
         tres veces usando dous metodos distintos (writeUTF e writeChars) nun 
         ficheiro denominado text6.txt para posteriormente recuperalos.
        
         */
        //al usar métodos distintos, readUTF y readChars, no hace falta usar tantos buckes
        //readUTF terminará de leer cuando llegue a la siguiente cadena de distinto tipo
        //(readChar)
        
        //EJERCICIO ACABADO,ORDENAR BIEN
        
        //escritura
        FileOutputStream escribir = null;
        BufferedOutputStream escribirBuffer = null;
        DataOutputStream escribirData = null;
        //lectura
        FileInputStream leer = null;
        BufferedInputStream leerBuffer = null;
        DataInputStream leerData = null;
        String lecturas = "";

        escribir = new FileOutputStream("/home/oracle/Desktop/ex6/texto6.txt");
        escribirBuffer = new BufferedOutputStream(escribir);
        escribirData = new DataOutputStream(escribirBuffer);

        leer = new FileInputStream("/home/oracle/Desktop/ex6/texto6.txt");
        leerBuffer = new BufferedInputStream(leer);
        leerData = new DataInputStream(leerBuffer);

        String cadena = "Está en casa";
        
        escribirData.writeUTF(cadena);
        escribirData.writeChars(cadena);
        escribirData.writeUTF(cadena);
        escribirData.close();
        
        System.out.println(leerData.readUTF());
        for(int i = 0;i<cadena.length();i++){
            
            System.out.print(leerData.readChar());
            
        }
        System.out.println("\n"+leerData.readUTF());

    
    }

}
