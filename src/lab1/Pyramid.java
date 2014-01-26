package lab1;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

public class Pyramid {

	public Pyramid(GL2 gl) {
		DrawPyramid(gl);
	}
	
	public void DrawPyramid(GL2 gl){
		
		gl.glBegin(GL.GL_LINE_LOOP);
		gl.glPushAttrib(GL2.GL_CURRENT_BIT);
			gl.glColor3f(0, 1, 1);
		gl.glPopAttrib();
			
		gl.glPushMatrix();
			gl.glVertex2f(0.5f, 0.5f);
			gl.glVertex2f(0.5f, 0.6f);
			gl.glVertex2f(0.6f, 0.6f);
			gl.glVertex2f(0.6f, 0.65f);
			gl.glVertex2f(0.80f, 0.65f);
			gl.glVertex2f(0.80f, 0.6f);
			gl.glVertex2f(0.9f, 0.6f);
			gl.glVertex2f(0.9f, 0.5f);
		gl.glPopMatrix();	
		
		gl.glEnd();
		
	}

}
