package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by reshikov on 04.12.16.
 */
public class Test2_3 {

@Test
    public void testDistance (){
    Point p = new Point();
    /**
     есть ли способ подтянуть значения x1,x2,y1,y2 из другого класса, что бы не приходилось заново их вводить?
     */
    p.x1 = 9;
    p.y1 = 9;
    p.x2 = 8;
    p.y2 = 8;

    Assert.assertEquals(p.distance(), 1.4142135623730951);
}
}
