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
public class ProxyImage implements Image {

    private String imageFilePath;
    private HighResolutionImage proxifiedImage;

    public ProxyImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    //in proxy class we make just one method that do the 2 operations (load & show) the image at one time.
    public void showImage() {
        // create the Image Object only when the image is required to be shown
        proxifiedImage = new HighResolutionImage(imageFilePath); // HighResolutionImage cons will load the image.
        // now call showImage on realSubject
        proxifiedImage.showImage();
    }

}
