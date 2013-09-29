import java.awt.Color;

public class Paddle
{
	//========
	//DETAILS
	//========

	int		width;
	int		height;
	int		xLoc;
	int		yLoc;
	int		initX;
	int		initY;
	int		yspeed;
	int		xspeed;
	Color 	color;
	int		upkey;
	int		downkey;
	int		leftkey;
	int		rghtkey;
	int 	score;
	int 	ymoving;  // positive, negative, or 0
	int 	xmoving;  // positive, negative, or 0

	
	//=============
	//CONSTRUCTORS
	//=============

	public Paddle()
	{
		//defaults
		width	= 20;
		height	= 80;
		xLoc	= -1;
		yLoc	= -1;
		initX	= -1;
		initY	= -1;
		yspeed	= -1;
		xspeed	= -1;
		color	= Color.cyan;
		score	= -1;
		upkey	= -1;	//[W] key
		downkey	= -1;	//[S] key
		leftkey	= -1;	//[A] key
		rghtkey	= -1;	//[D] key
		ymoving	= 0;
		xmoving	= 0;
	}

	public Paddle(int w, int h, int x, int y, int vspeed, int hspeed, Color c, int up, int down, int left, int right)
	{
		//user inputs
		width	= w;
		height	= h;
		xLoc	= x;
		yLoc	= y;
		initX	= xLoc;
		initY	= yLoc;
		yspeed	= vspeed;
		xspeed	= hspeed; // paddle isn't moving horizontaly by default
		color	= c;
		upkey	= up;
		downkey	= down;
		leftkey = left;
		rghtkey = right;

		//defaults
		score	= 0;
		ymoving	= 0;
		xmoving	= 0;
	}


	//====================
	//GET and SET methods
	//====================

	public int getWidth()
	{
		return width;
	}
	public void setWidth(int w)
	{
		width = w;
	}

	public int getHeight()
	{
		return height;
	}
	public void setHeight(int h)
	{
		height = h;
	}

	public int getX()
	{
		return xLoc;
	}
	public void setX(int x)
	{
		xLoc= x;
	}

	public int getY()
	{
		return yLoc;
	}
	public void setY(int y)
	{
		yLoc = y;
	}
	
	public int getInitialX()
	{
		return initX;
	}
	public void setInitialX(int x)
	{
		initX = x;
	}

	public int getInitialY()
	{
		return initY;
	}
	public void setInitialY(int y)
	{
		initY = y;
	}

	public int getYSpeed()
	{
		return yspeed;
	}
	public void setYSpeed(int vspeed)
	{
		yspeed = vspeed;
	}

	public int getXSpeed()
	{
		return xspeed;
	}
	public void setXSpeed(int hspeed)
	{
		xspeed = hspeed;
	}

	public Color getColor()
	{
		return color;
	}
	public void setColor(Color c)
	{
		color = c;
	}

	public int getUpKey()
	{
		return upkey;
	}
	public void setUpKey(int k)
	{
		upkey= k;
	}

	public int getDownKey()
	{
		return downkey;
	}
	public void setDownKey(int k)
	{
		downkey= k;
	}

	public int getLeftKey()
	{
		return leftkey;
	}
	public void setleftKey(int k)
	{
		leftkey= k;
	}

	public int getRightKey()
	{
		return rghtkey;
	}
	public void setRightKey(int k)
	{
		rghtkey= k;
	}
	
	public int getScore()
	{
		return score;
	}
	public void setScore(int s)
	{
		score= s;
	}
	public void score()
	{
		score++;
	}

	public int getYMoving()
	{
		return ymoving;
	}
	public void setYMoving(int ym)
	{
		ymoving= ym;
	}

	public int getXMoving()
	{
		return xmoving;
	}
	public void setXMoving(int xm)
	{
		xmoving= xm;
	}

	
	
	
	
	
	
	
	
	
	
	
} // end class
