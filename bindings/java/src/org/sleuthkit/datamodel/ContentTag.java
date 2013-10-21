/*
 * Sleuth Kit Data Model
 * 
 * Copyright 2013 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.datamodel;

/**
 * Instances of this class are data transfer objects (DTOs) that represent tags 
 * a user can apply to content.
 */
public class ContentTag extends Tag {
	private final Content content;
	private final long beginByteOffset;
	private final long endByteOffset;
					
	public ContentTag(Content content, TagName type, String comment, long beginByteOffset, long endByteOffset) {
		this(Tag.ID_NOT_SET, content, type, comment, beginByteOffset, endByteOffset);
	}

	ContentTag(long id, Content content, TagName type, String comment, long beginByteOffset, long endByteOffset) {
		super(type, comment);
		this.content = content;
		this.beginByteOffset = beginByteOffset;
		this.endByteOffset = endByteOffset;				
	}
		
	public Content getContent() {
		return content;
	}	
	
	public long getBeginByteOffset() {
		return beginByteOffset;
	}

	public long getEndByteOffset() {
		return endByteOffset;
	}		
}
