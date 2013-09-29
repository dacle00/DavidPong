import java.awt.*;

public class Ball
{

	//========
	//DETAILS
	//========

	public int radius;
	public int xspeed;
	public float yspeed;
	public int xspeedMax;
	public int xspeedMin;
	public int xLoc;
	public int yLoc;
	public Color color; 

	//=============
	//CONSTRUCTORS
	//=============

	public Ball()
	{
		xLoc = 0;
		yLoc = 0;
		radius= 2;
		xspeed = 2;
		yspeed = 2;
		xspeedMax = 16;
		xspeedMin = 1;
		color = Color.cyan;
	}

	public Ball(int rad, int x, int y, int xsp, float ysp, int xspmax, int xspmin, Color c)
	{
		//User Inputs
		radius= rad;
		xLoc = x;
		yLoc = y;
		xspeed = xsp;
		yspeed = ysp;
		xspeedMax = xspmax;
		xspeedMin = xspmin;
		color = c;
	}

	//====================
	//GET and SET methods
	//====================

	public int getRadius()
	{
		return radius;
	}
	public void setRadius(int r)
	{
		radius =r;
	}

	public int getxSpeed()
	{
		return xspeed;
	}
	public void setxSpeed(int s)
	{
		if( s<0 )
		{
			if( s>=-xspeedMin )
				xspeed = -xspeedMin;
			else if( s<=-xspeedMax )
				xspeed  = -xspeedMax;
			else
				xspeed = s;
		}
		else
		{
			if( s<=xspeedMin )
				xspeed = xspeedMin;
			else if( s>=xspeedMax )
				xspeed = xspeedMax;
			else
				xspeed = s;
		}
	}	

	public int getxSpeedMax()
	{
		return xspeedMax;
	}
	public void setxSpeedMax(int smax)
	{
		xspeedMax = smax;
	}	

	public int getxSpeedMin()
	{
		return xspeedMin;
	}
	public void setxSpeedMin(int smin)
	{
		xspeedMin = smin;
	}	

	public float getySpeed()
	{
		return yspeed;
	}
	public void setySpeed(float s)
	{
		yspeed = s;
	}	

	public int getX()
	{
		return xLoc;
	}
	public void setX(int x)
	{
		xLoc = x;
	}	

	public int getY() 
	{
		return yLoc;
	}
	public void setY(int y)
	{
		yLoc = y;
	}	

	public Color getColor()
	{
		return color;
	}
	public void setColor(Color c)
	{
		color = c;
	}	
} // end class
