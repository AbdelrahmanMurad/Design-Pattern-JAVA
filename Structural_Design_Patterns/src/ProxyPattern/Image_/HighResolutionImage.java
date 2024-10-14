/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern.Image_;

/**
 *
 * @author A_Murad
 */
public class HighResolutionImage implements Image {

    public HighResolutionImage(String imageFilePath) {
        loadImage(imageFilePath);
    }

    //private because we dont need it in main.
    private void loadImage(String imageFilePath) {
        //load Image from disk into memory 
        //this is heavy and costly operation 
        System.out.println("Load Image");
    }

    @Override
    public void showImage() {
        //Actual Image rendering logic
        System.out.println("Show Image");
    }

}
