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
package org.zaproxy.zap.utils;

import java.util.Iterator;

/**
 * An {@code Iterator} that allows to be reset, to initial state.
 * 
 * @param <E> the type of elements returned by this iterator
 * @see Iterator
 * @see EmptyResettableIterator
 * @since 2.4.0
 */
public interface ResettableIterator<E> extends Iterator<E> {

    /**
     * Resets the iterator to the initial state.
     */
    void reset();

}
