/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2015 The ZAP Development Team
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
package org.zaproxy.zap.view.messagelocation;

import java.awt.Color;
import java.util.Random;

import org.zaproxy.zap.extension.httppanel.Message;
import org.zaproxy.zap.model.MessageLocation;

/**
 * A {@code MessageLocationHighlightsManager} for highlights of text message locations.
 * 
 * @since 2.4.0
 * @see TextMessageLocationHighlight
 */
public class TextMessageLocationHighlightsManager implements MessageLocationHighlightsManager {

    private Random random = new Random();

    @Override
    public void init(Message message) {
    }

    @Override
    public TextMessageLocationHighlight getHighlight(MessageLocation messageLocation) {
        return new TextMessageLocationHighlight(Color.getHSBColor(
                random.nextFloat(),
                Math.max(random.nextFloat(), 0.50f),
                Math.max(random.nextFloat(), 0.65f)).brighter());
    }
}
