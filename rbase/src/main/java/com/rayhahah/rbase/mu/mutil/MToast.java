package com.rayhahah.rbase.mu.mutil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

public class MToast
{
	
	@SuppressLint("WrongConstant")
	public void mToast(Context c, String s){
		Toast.makeText(c,s,3000).show();
		
		
	}
}
