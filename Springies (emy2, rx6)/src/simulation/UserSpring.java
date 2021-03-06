package simulation;

import java.awt.Dimension;

import util.Vector;

public class UserSpring extends Spring {
    private double myLength;
    private Mass userMass;
    private Mass myEnd;
    private int springWidth = 10;
    private double pullMagnitude = 20;


    public UserSpring(Mass start, Mass end, double length, double kVal) {
	super(start, end, length, kVal);
	myLength = length;
	myEnd = end;
	userMass = start;
	// TODO Auto-generated constructor stub
    }
    
    @Override
    public void update(double elapsedTime, Dimension bounds) {
	setSize(springWidth, (int) myLength);
	Vector pullingForce = new Vector(Vector.angleBetween(userMass.getCenter(),myEnd.getCenter()), pullMagnitude);
	userMass.applyForce(pullingForce);
	myEnd.applyForce(pullingForce);
	setSize(springWidth, (int) myLength);


    }
}
