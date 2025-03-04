/**
 * Copyright (c) 2000-2021 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.showcase.component.outputsourcecode.internal;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.ResponseWriter;
import javax.faces.context.ResponseWriterWrapper;


/**
 * @author  Neil Griffin
 */
public class OutputSourceCodeResponseWriter extends ResponseWriterWrapper {

	// Private Data Members
	private String mode;
	private ResponseWriter wrappedResponseWriter;

	public OutputSourceCodeResponseWriter(ResponseWriter responseWriter, String mode) {
		this.wrappedResponseWriter = responseWriter;
		this.mode = mode;
	}

	@Override
	public void endElement(String name) throws IOException {

		if ("span".equals(name)) {
			name = "pre";
		}

		super.endElement(name);
	}

	@Override
	public ResponseWriter getWrapped() {
		return wrappedResponseWriter;
	}

	@Override
	public void startElement(String name, UIComponent component) throws IOException {

		if ("span".equals(name)) {
			name = "pre";
		}

		super.startElement(name, component);
	}

	@Override
	public void writeAttribute(String name, Object value, String property) throws IOException {

		if ("class".equals("name")) {

			if (mode != null) {

				if (value == null) {
					value = "lang-".concat(mode);
				}
				else {
					value = value.toString().concat("  lang-".concat(mode));
				}
			}
		}

		super.writeAttribute(name, value, property);
	}
}
