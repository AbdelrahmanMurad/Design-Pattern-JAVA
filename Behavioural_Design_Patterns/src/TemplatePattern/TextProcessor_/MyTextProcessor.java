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
public class MyTextProcessor extends TextProcessorTemplate {

    @Override
    public String[] tokenize(String text) {
        System.out.println("tokenize operation");
        return null;
    }

    @Override
    public String[] removeStopwrods(String[] text) {
        System.out.println("removeStopwrods operation");
        return null;
    }

    @Override
    public String[] stem(String[] text) {
        System.out.println("stem operation");
        return null;
    }

    @Override
    public String applySentimentAnalysis(String[] text) {
        System.out.println("applySentimentAnalysis operation");
        return null;
    }
}
