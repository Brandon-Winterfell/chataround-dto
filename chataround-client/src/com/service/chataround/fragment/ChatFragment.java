package com.service.chataround.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.service.chataround.R;
import com.service.chataround.util.Callback;

public class ChatFragment extends Fragment implements Callback {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.chatfragment, container, false);
	}

	@Override
	public void onButtonBClicked() {
		

	}

}