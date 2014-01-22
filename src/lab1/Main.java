package lab1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.*;

public class Main implements GLEventListener{


	int count = 0;
	
	public static void main(String[] args) {
		System.out.println("Herrroooo!");
			
		GLProfile glp = GLProfile.getDefault();
	    GLCapabilities caps = new GLCapabilities(glp);
	    GLCanvas canvas = new GLCanvas(caps);

	    Frame frame = new Frame("Test");
	    frame.setSize(500, 500);
	    frame.add(canvas);
	    frame.setVisible(true);
	    
	    frame.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	            System.exit(0);
	        }

	    });
	    canvas.addGLEventListener(new Main());
	    Animator animator = new Animator(canvas);
	    animator.start();
		
	}


	public void display(GLAutoDrawable drawable) {
		update();
		draw(drawable, 2);
	}


	private void update() {
		
	}
	
	private void box(GL2 gl, int num){
		
//			x1 += 0.05f;
//			x2 += 0.05f;

	    
	}

	public void draw(GLAutoDrawable drawable, int num){
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT);

		Box b = new Box(gl, num, 0.0f , 0.0f);
		Box b2 = new Box(gl, num, 0.15f, 0.15f);
		Box b3 = new Box(gl, num, 0.3f, 0.3f);
		
	}
	
	public void dispose(GLAutoDrawable drawable) {

	}


	public void init(GLAutoDrawable drawable) {
		drawable.getGL().setSwapInterval(1);
	}


	public void reshape(GLAutoDrawable drawable, int arg1, int arg2, int arg3, int arg4) {

	}

}
