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
package org.telosys.tools.dsl.converter;

import java.util.HashMap;
import java.util.Map;

import org.telosys.tools.dsl.model.DslModelAttribute;
import org.telosys.tools.dsl.parser.model.DomainField;
import org.telosys.tools.dsl.parser.model.DomainTag;

public class TagsConverter {

	public void applyTags(DslModelAttribute attribute, DomainField field) {
		Map<String, DomainTag> tagsMap = field.getTags();
		if ( tagsMap == null) return ;
		if ( tagsMap.isEmpty()) return ;
		// Convert tags
		Map<String,String> newTags = new HashMap<>();
		for ( DomainTag tag : tagsMap.values() ) {
			String name = tag.getName() ;
			String value = tag.getParameterAsString();
			if ( value == null ) {
				value = "";
			}
			newTags.put(name, value);
		}
		attribute.setTags(newTags);
	}

}
