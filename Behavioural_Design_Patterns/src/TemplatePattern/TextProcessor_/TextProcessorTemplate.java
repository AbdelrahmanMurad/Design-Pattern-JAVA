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
public abstract class TextProcessorTemplate {

    public abstract String[] tokenize(String text);

    public abstract String[] removeStopwrods(String[] text);

    public abstract String[] stem(String[] text);

    public abstract String applySentimentAnalysis(String[] text);

    final public String processText(String text) {
        //why final ?? to prevent overiding.
        String[] tokens = tokenize(text);
        String[] tokensWithoutStopwords = removeStopwrods(tokens);
        String[] stem = stem(tokensWithoutStopwords);
        return applySentimentAnalysis(stem);
    }
}
//If you want any information, you take it from Explaination.
