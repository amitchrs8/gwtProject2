package com.gwt.practice.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class AppEntryClass implements EntryPoint {

	TestUIBinder testBinder =  new TestUIBinder();
	
	@Override
	public void onModuleLoad() {

		RootPanel.get().add(testBinder);	
	}

}
