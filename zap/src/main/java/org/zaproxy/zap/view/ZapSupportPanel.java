/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2017 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.zaproxy.zap.utils.ZapSupportUtils;

public class ZapSupportPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs an {@code ZapSupportPanel}.
	 */
	public ZapSupportPanel() {
		super(new GridBagLayout(), true);

		GridBagConstraints gbcSupportDetails = new GridBagConstraints();
		
		JTextArea supportDetailsTextArea = new JTextArea(20, 0);
		supportDetailsTextArea.setEditable(false);
		
		supportDetailsTextArea.setText(ZapSupportUtils.getAll(true));
		supportDetailsTextArea.setCaretPosition(0);
		
		gbcSupportDetails.gridx = 3;
		gbcSupportDetails.gridy = 0;
		gbcSupportDetails.ipadx = 0;
		gbcSupportDetails.ipady = 0;
		gbcSupportDetails.weightx = 1.0D;
		gbcSupportDetails.weighty = 1.0D;
		gbcSupportDetails.fill = GridBagConstraints.BOTH;
		gbcSupportDetails.anchor = GridBagConstraints.NORTHWEST;
		gbcSupportDetails.insets = new Insets(2, 2, 2, 2);
		
		this.add(new JScrollPane(supportDetailsTextArea), gbcSupportDetails);
	}
}
