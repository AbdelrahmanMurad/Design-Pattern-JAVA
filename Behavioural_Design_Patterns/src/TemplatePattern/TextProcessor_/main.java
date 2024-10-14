/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.TextProcessor_;

/**
 *
 * @author A_Murad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "My name is Ahmed. I bought this coat last year. it has many defects and useless";

        MyTextProcessor process = new MyTextProcessor();
        process.processText(text);
    }

}
