package com.epam.university.java.core.task013;

/**
 * Factory for creation of figures.
 */
public class FigureFactoryImpl implements FigureFactory {

    /**
     * Minimal number of vertexes to make a figure.
     */
    private static final int MIN_VERTEXES = 3;

    /**
     * Create figure with designated amount of vertexes.
     *
     * @param vertexCount amount of vertexes
     * @return figure instance or null if vertexCount < MIN_VERTEXES
     */
    @Override
    public Figure newInstance(final int vertexCount) {
        if (vertexCount < MIN_VERTEXES) {
            return null;
        }
        return new FigureImpl();
    }

    /**
     * Create new vertex instance with designated coordinates.
     *
     * @param x first coordinate
     * @param y second coordinate
     * @return vertex instance
     */
    @Override
    public Vertex newInstance(final int x, final int y) {
        return null;
    }
}