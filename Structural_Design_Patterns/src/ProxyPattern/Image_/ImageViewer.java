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
public class ImageViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // assuming that the user selects a folder that has 3 images	
        //create the 3 images 	
        Image highResolutionImage1 = new ProxyImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImage2 = new ProxyImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImage3 = new ProxyImage("sample/veryHighResPhoto3.jpeg");

        // assume that the user clicks on Image one item in a list
        // this would cause the program to call showImage() for that image only
        // note that in this case only image one was loaded into memory
        highResolutionImage1.showImage();
        System.out.println("\n======\nOne image Loaded\n");

        // consider using the high resolution image object directly
        Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImageBoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");

        // assume that the user selects image two item from images list
        highResolutionImageNoProxy2.showImage();
        System.out.println("\n======\nAll images Loaded\n");

        // note that in this case all images have been loaded into memory 
        // and not all have been actually displayed
        // this is a waste of memory resources
    }
}
