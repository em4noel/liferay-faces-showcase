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
package com.liferay.faces.showcase.dto;

import java.io.Serializable;


/**
 * @author  Neil Griffin
 */
public class Country implements Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 9135922470541735463L;

	// Private Data Members
	private long countryId;
	private String countryCode;
	private String countryName;

	public Country(long countryId, String countryCode, String countryName) {
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public long getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
