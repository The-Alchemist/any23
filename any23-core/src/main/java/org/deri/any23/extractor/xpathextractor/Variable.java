/**
 * Copyright 2008-2010 Digital Enterprise Research Institute (DERI)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.deri.any23.extractor.xpathextractor;

/**
 * Represents a variable in {@link TemplateXPathExtractionRule}.
 *
 * @see TemplateXPathExtractionRule
 * @author Michele Mostarda (mostarda@fbk.eu)
 */
public class Variable {

    /**
     * Variable identifier.
     */
    private final String name;

    /**
     * Variable <i>XPath</i> expression.
     */
    private final String xPath;

    public Variable(String name, String xPath) {
        this.name = name;
        this.xPath = xPath;
    }

    /**
     * @return the variable name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the variable <i>XPath</i>.
     */
    public String getxPath() {
        return xPath;
    }

}