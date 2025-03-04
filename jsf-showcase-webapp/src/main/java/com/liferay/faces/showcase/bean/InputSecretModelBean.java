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
package com.liferay.faces.showcase.bean;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 * @author  Vernon Singleton
 */
@ManagedBean
@RequestScoped
public class InputSecretModelBean {

	private Date date = new GregorianCalendar().getTime();
	private String password;

	public Date getDate() {
		return date;
	}

	public String getPassword() {
		return password;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
