/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author haris
 */
public class Konfigurasi {
    private final Font fAwesome;
    private final Font fRoboto;
    private final Font fRobotoBold;
    private final Font fPhilosopher;
    
    public Konfigurasi() throws IOException, FontFormatException {
        this.fAwesome = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/database/fonts/Font Awesome 5 Free-Solid-900.otf"));
        this.fRoboto = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/database/fonts/Roboto-Regular.ttf"));
        this.fRobotoBold = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/database/fonts/Roboto-Bold.ttf"));
        this.fPhilosopher = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/database/fonts/Philosopher-Regular.ttf"));
    }
    
    public Font getRoboto(float size) {
        return fRoboto.deriveFont(size);
    }
    
    public Font getRobotoBold(float size) {
        return fRobotoBold.deriveFont(size);
    }
    
    public Font getAwesome(float size) {
        return fAwesome.deriveFont(size);
    }
    
    public Font getPhilosopher(float size) {
        return fPhilosopher.deriveFont(size);
    }
}
