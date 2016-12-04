package ru.stqa.pft.sandbox;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.tools.javac.util.BasicDiagnosticFormatter;

/**
 * Created by reshikov on 04.12.16.
 */
public class Task1_2 {

    public static void main(String[] args) {

        Point p = new Point();
        p.x1 = 9;
        p.y1 = 9;
        p.x2 = 8;
        p.y2 = 8;
        System.out.println("Расстояние между точками = " + p.distance());

    }


}
