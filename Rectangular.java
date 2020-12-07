/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 * 
 * @author Nicolas Nguyen
 */
public class Rectangular {
    private int width;
    private int length;
    private String color;
    private static int numOfSide = 4;
       
    /**
     * Default constructor
     */
    public Rectangular() {
        Random rand = new Random();
        
        int minNum = 1;
        int maxNum = 10;
        
        this.width = rand.nextInt(maxNum - minNum + 1) + minNum;
        this.length = rand.nextInt(maxNum - minNum + 1) + minNum;
        this.color = "black";
    }
    
    /**
     * Constructor with all members
     * @param width the width of a rectangular
     * @param length the length of a rectangular
     * @param color the color of the rectangular
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    
    /**
     * Copy constructor
     * @param rectangular another rectangular
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }
    
    /**
     * To calculate the area of a rectangular
     * @return the area of a rectangular
     */
    public int calcArea() {       
        return width * length;     
    }
    
    /**
     * To calculate the perimeter of a rectangular
     * @return the perimeter of a rectangular
     */
    public int calcPerimeter () {
        return (width + length) * 2;
        
    }
    
    /**
     * To compare two rectangular
     * @param rectangular another rectangular
     * @return if the two rectangular are the same
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width && this.length == rectangular.length
                && this.color.equals(rectangular.color);
    }
    
    /**
     * To generate a string to represent the rectangular
     * @return a string to represent the rectangular
     */
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %s\n", "Color", color);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        return str;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
