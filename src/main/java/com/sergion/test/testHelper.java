package com.sergion.test;

import com.sergion.model.*;

public class testHelper {

    public void setField (Field field, String fig1, String fig2, String fig3, String fig4, String fig5, String fig6, String fig7, String fig8, String fig9){
        if (fig1 != null) field.setFigure(new Point(0,0), Figure.valueOf(fig1)); else field.delFigure(new Point(0,0));
        if (fig2 != null) field.setFigure(new Point(0,1), Figure.valueOf(fig2)); else field.delFigure(new Point(0,1));
        if (fig3 != null) field.setFigure(new Point(0,2), Figure.valueOf(fig3)); else field.delFigure(new Point(0,2));
        if (fig4 != null) field.setFigure(new Point(1,0), Figure.valueOf(fig4)); else field.delFigure(new Point(1,0));
        if (fig5 != null) field.setFigure(new Point(1,1), Figure.valueOf(fig5)); else field.delFigure(new Point(1,1));
        if (fig6 != null) field.setFigure(new Point(1,2), Figure.valueOf(fig6)); else field.delFigure(new Point(1,2));
        if (fig7 != null) field.setFigure(new Point(2,0), Figure.valueOf(fig7)); else field.delFigure(new Point(2,0));
        if (fig8 != null) field.setFigure(new Point(2,1), Figure.valueOf(fig8)); else field.delFigure(new Point(2,1));
        if (fig9 != null) field.setFigure(new Point(2,2), Figure.valueOf(fig9)); else field.delFigure(new Point(2,2));
    }
}
