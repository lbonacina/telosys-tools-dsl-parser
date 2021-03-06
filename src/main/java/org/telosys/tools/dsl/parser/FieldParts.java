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
package org.telosys.tools.dsl.parser;

/**
 * This object contains a 'field' after the first step of parsing. <br>
 * It contains the 2 parts of the field : <br>
 * . name and type<br>
 * . annotations ans tags <br>
 * These two parts are raw (not yet parsed) <br>
 * 
 * @author Laurent GUERIN
 *
 */
class FieldParts {

	private final int lineNumber;
	private final String nameAndTypePart ;
	private final String annotationsPart ;
	
	/**
	 * Constructor
	 * @param lineNumber
	 * @param nameAndTypePart ( eg "name : string" )
	 * @param annotationsPart annotations and tags ( eg "@Id #Tag" )
	 */
	protected FieldParts(int lineNumber, String nameAndTypePart, String annotationsPart) {
		super();
		this.lineNumber = lineNumber ;
		this.nameAndTypePart = nameAndTypePart;
		this.annotationsPart = annotationsPart;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	public String getNameAndTypePart() {
		return nameAndTypePart;
	}

	public String getAnnotationsPart() {
		return annotationsPart;
	}

	protected boolean isVoid() {
		return nameAndTypePart.length() == 0 && annotationsPart.length() == 0 ;
	}
	
	@Override
	public String toString() {
		return "Field : line " + lineNumber 
				+ " [" + nameAndTypePart + "] [" + annotationsPart + "]"
				;
	}

}
