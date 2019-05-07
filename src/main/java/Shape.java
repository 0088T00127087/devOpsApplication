/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joeenright
 */
public class Shape {
    
    float height;
    float length;

    public Shape(float height, float length) {
        this.height = height;
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    
    public float getArea(){
        return this.height * this.length;
    }
    
    public String toString(){
        return "Height: " + getHeight() + "\nLenght: " + getLength();
    }
    
}
