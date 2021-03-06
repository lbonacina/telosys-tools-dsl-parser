/**
 *  Copyright (C) 2008-2017  Telosys project org. ( http://www.telosys.org/ )
 *
 *  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.gnu.org/licenses/lgpl.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.telosys.tools.dsl.parser.exceptions;

/**
 * DSL Parser Exception 
 * 
 * @author Laurent GUERIN
 *
 */
public class FieldNameAndTypeError extends FieldParsingError {

    private static final long serialVersionUID = 1L;
    
//	private final String fieldNameAndType;

    /**
     * Constructor
     * @param entityName
     * @param fieldNameAndType
     * @param error
     */
    public FieldNameAndTypeError(String entityName, String fieldNameAndType, String error) {
//        super(entityName, fieldNameAndType, entityName + " : '" + fieldNameAndType + "' (" + error + ")");
        super(entityName, fieldNameAndType, error );
//        this.fieldNameAndType = fieldNameAndType ;
    }

//	public String getFieldNameAndType() {
//		return fieldNameAndType;
//	}
    
}
