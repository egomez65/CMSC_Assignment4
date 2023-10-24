
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 10/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ema Gomez
*/

import javax.print.attribute.standard.MediaSize.Other;

public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot () {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	
	public Plot ( int x, int y, int width, int depth ) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	
	public Plot ( Plot otherPlot ) {
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
		
	}
	
	public boolean overlaps ( Plot plot ) {
		
		int bottomRightX = this.x + width;
		int bottomRightY = this.y - depth;
		
		int otherBottomRightX = plot.x + plot.width;
		int otherBottomRightY = plot.y - plot.depth;
		int otherTopRightX = otherBottomRightX;
		int otherTopRightY = plot.y;
		int otherBottomLeftX = plot.x;
		int otherBottomLeftY = otherBottomRightY;
		
		if ( plot.x > this.x && plot.x < bottomRightX && 
			 plot.y < this.y && plot.y > bottomRightY) {
			return true;
		}
		
		if ( otherBottomRightX > this.x && otherBottomRightX <= bottomRightX &&
			 otherBottomRightY < this.y && otherBottomRightY >= bottomRightY) {
			return true;
			
		}
		
		if ( otherTopRightX > this.x && otherTopRightX < bottomRightX &&
			 otherTopRightY < this.y && otherTopRightY > bottomRightY) {
			return true;
			
		}
		
		if ( otherBottomLeftX > this.x && otherBottomLeftX < bottomRightX && 
			 otherBottomLeftY < this.y && otherBottomLeftX > bottomRightY) {
			return true;
			
		}
		
			return false;
			
	}
	
	public boolean encompasses ( Plot plot ) {
		
		int bottomRightX = this.x + width;
		int bottomRightY = this.y - depth;
		
		int otherBottomRightX = plot.x + plot.width;
		int otherBottomRightY = plot.y - plot.depth;
		
		if ( plot.x >= this.x && plot.x <= bottomRightX && plot.y <= this.y && plot.y >= bottomRightY && 
				otherBottomRightX <= bottomRightX && otherBottomRightX >= this.x && 
				otherBottomRightY <= this.y && otherBottomRightY >= bottomRightY) {
			return true;
		}
		
		return false;
		
	}
	
	public void setX ( int x ) {
		this.x = x;
		
	}
	
	public void setY ( int y ) {
		this.y = y;
	}
	
	public void setWidth ( int width ) {
		this.width = width;
		
	}
	
	public void setDepth ( int depth ) {
		this.depth = depth;
	}
	
	public int getX() {
		return this.x;
		
	}
	
	public int getY() {
		return this.y;
		
	}
	
	public int getWidth() {
		return this.width;
		
	}
	
	public int getDepth() {
		return this.depth;
		
	}
	
	public String toString () {
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
		
	}
	
}