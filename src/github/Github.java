/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matthew
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine();
            bw.write(" <head>");
            bw.newLine();
            bw.write(" <title>");
            bw.newLine();
            bw.write(" Nova p&agrave;gina web");
            bw.newLine();
            bw.write(" </title>");
            bw.newLine();
            bw.write(" </head>");
            bw.newLine();
            bw.write(" <body>");
            bw.newLine();
            bw.write(" Nova p&agrave;gina web");
            bw.newLine();
            bw.write(" </body>");
            bw.newLine();
            bw.write("</html>");
            bw.write(" <h1>DAW2 m08uf4pr2</h1>");
bw.newLine();
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Github.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
