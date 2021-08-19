package exception;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyAnimation {
    public Image loadImage(String s) throws IOException, FileNotFoundException, EOFException, ArrayIndexOutOfBoundsException {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };
        System.out.println("");
        return image;
    }
}
