package com.example.practiceapp;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class OpenGLPractice extends Activity{

	private GLSurfaceView mGLView;

	@Override
	public void onCreate(Bundle savedInstanceState){

		mGLView = new MyGLSurfaceView(this);
		
	}//end of onCreate method

	class MyGLSurfaceView extends GLSurfaceView{

		public MyGLSurfaceView(Context context) {
			
			super(context);
			setEGLContextClientVersion(2);
			setRenderer(new MyRenderer());
			// Render the view only when there is a change in the drawing data
			setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
			
		}//end of constructor
		
	}//end of inner class
	
	class MyRenderer implements GLSurfaceView.Renderer{

		@Override
		public void onDrawFrame(GL10 gl) {
			// TODO Auto-generated method stub
			 GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
			
		}

		@Override
		public void onSurfaceChanged(GL10 gl, int width, int height) {
			// TODO Auto-generated method stub
			GLES20.glViewport(0, 0, width, height);
		}

		@Override
		public void onSurfaceCreated(GL10 gl, EGLConfig config) {
			// TODO Auto-generated method stub
			GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
		}
		
	}
}
