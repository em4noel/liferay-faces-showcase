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
package com.liferay.faces.showcase.component.buttonrow.internal;

import javax.faces.application.ResourceDependency;
import javax.faces.render.FacesRenderer;

import com.liferay.faces.showcase.component.buttonrow.ButtonRow;


/**
 * @author  Vernon Singleton
 */
@FacesRenderer(componentFamily = ButtonRow.COMPONENT_FAMILY, rendererType = ButtonRow.RENDERER_TYPE)
@ResourceDependency(library = "bootstrap", name = "css/bootstrap.min.css")
public class ButtonRowRenderer extends ButtonRowRendererBase {
	// Initial Generation
}
