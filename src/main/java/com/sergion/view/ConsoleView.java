package com.sergion.view;

import com.sergion.model.*;

public final class ConsoleView {
    public String lastPrint;

    public String show(final Field field) {
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < field.getSize(); x++) {
            if (x != 0) {
                fieldBuilder.append("  ");
                fieldBuilder.append("~~~~~~~~~~~\n");
            }
            fieldBuilder.append("  ");
            generateLine(field, x, fieldBuilder);
        }
        lastPrint = fieldBuilder.toString();
        return lastPrint;
    }

    private static void generateLine(final Field field, final int x, final StringBuilder sb) {

        for (int y = 0; y < field.getSize(); y++) {
            if (y != 0) sb.append("|");
            sb.append(" ");
            Figure figure = field.getFigure(new Point(x, y));
            sb.append(figure != null ? figure : " ");
            sb.append(" ");
        }
        sb.append("\n");
    }
}
