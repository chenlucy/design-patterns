package com.corey.factory;

import com.sun.glass.ui.Pen;
import com.sun.javafx.tk.quantum.PrismPen;
import com.sun.javafx.tk.quantum.ViewScene;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Map;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class Creator {
    public static void main(String[] args) {
        ViewScene viewScene= new ViewScene(true,true);
        PrismPen pen = new PrismPen(viewScene,true);

    }
}
