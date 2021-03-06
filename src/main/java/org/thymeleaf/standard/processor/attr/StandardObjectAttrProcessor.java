/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.standard.processor.attr;

/**
 * Selects an object so that its methods and properties can be accessed using
 * the shortcut *{...} syntax, eg:
 * <p>
 * &lt;div th:object="${session.user}"&gt;<br/>
 * &nbsp; &lt;span th:text="*{firstName}"&gt;First name&lt;/span&gt;<br/>
 * &nbsp; &lt;span th:text="*{lastName}"&gt;Last name&lt;/span&gt;<br/>
 * &lt;/div&gt;
 * 
 * @author Daniel Fern&aacute;ndez
 * @since 1.0
 */
public final class StandardObjectAttrProcessor 
        extends AbstractStandardSelectionAttrProcessor {

    public static final int ATTR_PRECEDENCE = 500;
    public static final String ATTR_NAME = "object";
    
    
    
    public StandardObjectAttrProcessor() {
        super(ATTR_NAME);
    }

    
    
    @Override
    public int getPrecedence() {
        return ATTR_PRECEDENCE;
    }

    
    

    
}
