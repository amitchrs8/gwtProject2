package com.gwt.practice.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestUIBinder extends Composite {

	private static TestUIBinderUiBinder uiBinder = GWT.create(TestUIBinderUiBinder.class);

	interface TestUIBinderUiBinder extends UiBinder<Widget, TestUIBinder> {
	}

	public TestUIBinder() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setText(String text){
		
	}
	
	
}
