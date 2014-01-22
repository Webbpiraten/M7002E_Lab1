package lab1;

import javax.media.opengl.GL2;


public class Box{

	float x1 = -0.95f;
	float y1 = 0.95f;
	float x2 = -0.85f;
	float y2 = 0.85f;
	
	public Box(GL2 gl, int num, float x_1, float x_2){
		Drawbox(gl, x1+x_1, y1, x2+x_2, y2, num);
	}
	
	public void Drawbox(GL2 gl, float x1, float y1, float x2, float y2, int num){
		gl.glColor3f(0, 1, 0);
		gl.glRectf(x1,y1,x2,y2);
		
		
	}
	

	
}
