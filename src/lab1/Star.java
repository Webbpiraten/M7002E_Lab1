package lab1;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

public class Star {
	
	public Star(GL2 gl){
		DrawStar(gl);
	}
	
	public void DrawStar(GL2 gl){
		
		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glPushAttrib(GL2.GL_CURRENT_BIT);
				gl.glColor3f(0, 1, 0);
			gl.glPopAttrib();
			
			gl.glPushMatrix();
			gl.glVertex2f(-0.1f, -0.15f);
			gl.glVertex2f(-0.1f, 0.1f);
			gl.glVertex2f(-0.25f, 0.25f);
			gl.glVertex2f(-0.05f, 0.25f);
			gl.glVertex2f(0.1f, 0.50f);
			gl.glVertex2f(0.25f, 0.25f);
			gl.glVertex2f(0.45f, 0.25f);
			gl.glVertex2f(0.25f, 0.10f);
			gl.glVertex2f(0.35f, -0.15f);
			gl.glVertex2f(0.1f, 0.05f);
			gl.glPopMatrix();
			
		gl.glEnd();
	}

}
